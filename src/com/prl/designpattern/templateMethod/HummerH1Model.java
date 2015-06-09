/*
 Copyright (c) 2013 QIDAPP.com. All rights reserved.
 QIDAPP.com PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */ 
package com.prl.designpattern.templateMethod;

/**
 * @author Pengrl
 * @version $Id$
 * @since 1.1, 2014-5-27
 */
public class HummerH1Model extends HummerModel {

	@Override
	public void start() {
		System.out.println("悍马启动啦");
	}

	@Override
	public void stop() {
		System.out.println("悍马停止了");
	}

	@Override
	public void alarm() {
		System.out.println("悍马叫了");
	}
	
	@Override
	public void engineBoom() {
	}

	@Override
	public void run() {
		this.start();
		this.engineBoom();
		this.alarm();
		this.stop();
	}
}
