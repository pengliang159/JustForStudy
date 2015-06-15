/*
 Copyright (c) 2013 QIDAPP.com. All rights reserved.
 QIDAPP.com PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */ 
package com.prl.thread.test;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @author Pengrl
 * @version $Id$
 * @since 1.1, 2015-6-9
 */
public class CellularAutomata {
	
	private class Worker implements Runnable {
		private final Board board;
		public Worker(Board board) {
			this.board = board;
		}
		@Override
		public void run() {
			while (!board.hasConverged()) {
				for (int x = 0; x < board.getMaxX(); x++) {
					for (int y = 0;y < board.getMaxY(); y++) {
						board.setNewValue(x, y, computeValue(x, y));
					}
				}
				try {
					barrier.await();
				} catch (InterruptedException ex) {
					return;
				} catch (BrokenBarrierException ex) {
					return;
				}
			}
		}
		
		int computeValue(int x, int y) {
			return x + y;
		}
	}
	
	private final Board mainBoard;
	private final CyclicBarrier barrier;
	private final Worker[] workers;

	public CellularAutomata(Board board) {
		this.mainBoard = board;
		int count = Runtime.getRuntime().availableProcessors();
		this.barrier = new CyclicBarrier(count, new Runnable() {
			@Override
			public void run() {
				mainBoard.commitNewValues();
			}
		});
		workers = new Worker[count];
		for (int i = 0; i < count; i++) {
			workers[i] = new Worker(mainBoard);
		}
	}
	
	public void start() {
		for (int i = 0; i < workers.length; i++) {
			new Thread(workers[i]).start();
		}
		mainBoard.waitForConvergence();
	}
	
	public static void main(String[] args) {
		new CellularAutomata(new Board()).start();
	}
}
