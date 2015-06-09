/*
 Copyright (c) 2013 QIDAPP.com. All rights reserved.
 QIDAPP.com PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */ 
package com.prl.thread.test;

/**
 * @author Pengrl
 * @version $Id$
 * @since 1.1, 2014-10-9
 */
public class VolatileThread {

	public volatile static int count = 0;
	public static void inc() {
		try {
			Thread.sleep(1);
		} catch (Exception e) {
			// TODO: handle exception
		}
		count++;
	}
	
	public static void main(String[] args) {
		for (int i = 0; i < 1000; i++) {
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					VolatileThread.inc();
				}
			}).start();
		}
		System.out.println(count);
	}
}
