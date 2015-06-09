/*
 Copyright (c) 2013 QIDAPP.com. All rights reserved.
 QIDAPP.com PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */ 
package com.prl.thread.test;

/**
 * @author Pengrl
 * @version $Id$
 * @since 1.1, 2015-6-8
 */
public class ThreadTest implements Runnable {
	private static int i = 0;

	@Override
	public void run() {
		System.out.print(i++ + "这是数字\t");
	}

}
