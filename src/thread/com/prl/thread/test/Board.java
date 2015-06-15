/*
 Copyright (c) 2013 QIDAPP.com. All rights reserved.
 QIDAPP.com PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */ 
package com.prl.thread.test;

/**
 * @author Pengrl
 * @version $Id$
 * @since 1.1, 2015-6-10
 */
public class Board {
	public void commitNewValues() {
		System.out.println("新的值值");
		converged = true;
	}
	
	public Board getSubBoard(int count, int index) {
		return new Board();
	}
	
	private boolean converged = false;
	public boolean hasConverged(){
		return converged;
	}
	
	public int getMaxX() {
		return 1;
	}
	public int getMaxY() {
		return 1;
	}
	
	public void setNewValue(int x, int y, int z) {
		System.out.println(222);
	}
	
	public void waitForConvergence(){
		System.out.println(111);
	}
}
