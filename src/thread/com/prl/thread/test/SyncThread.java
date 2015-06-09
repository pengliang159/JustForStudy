package com.prl.thread.test;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/*
 Copyright (c) 2013 QIDAPP.com. All rights reserved.
 QIDAPP.com PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

/**
 * @author Pengrl
 * @version $Id$
 * @since 1.1, 2014-9-17
 */
public class SyncThread extends Thread {

	private static String sync = "";
	private String methodType = "";
	
	SyncThread(String methodType) {
		this.methodType = methodType;
	}
	
	private static void method(String s) {
		synchronized (sync) {
			sync = s;
			System.out.println(s);
//			while(true);
		}
	}
	
	public void method1() {
		method("method1");
	}
	
	public static void staticMethod1() {
		method("staticMethod1");
	}
	
	@Override
	public void run() {
		if ("static".equals(methodType)) {
			try {
				Thread.sleep(2000);
				System.out.println(bq.take() + "-----");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			staticMethod1();
		} else if ("nonstatic".equals(methodType)) {
			method1();
		}
	}
	
	final static BlockingQueue<String> bq = new ArrayBlockingQueue<String>(3);
	public static void main(String[] args) throws InterruptedException {
		SyncThread st = new SyncThread("nonstatic");
		SyncThread st1 = new SyncThread("static");
		st.start();
		st1.start();
		bq.put("aa");
		bq.put("bb");
		bq.put("cc");
		bq.put("dd");
		for (String b : bq) {
			System.out.println(bq.take());
		}
	}
}
