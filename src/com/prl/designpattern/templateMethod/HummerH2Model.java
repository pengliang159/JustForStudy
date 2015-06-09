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
public class HummerH2Model extends HummerModel {

	@Override
	protected void start() {
		System.out.println("h2 启动了");
	}

	@Override
	protected void stop() {
		System.out.println("H2 停止了");
	}

	@Override
	protected void alarm() {
		System.out.println("鸣笛叭叭叭");
	}

	@Override
	protected void engineBoom() {
		System.out.println("发动引擎");
	}

	@Override
	public void run() {
		this.start();
		this.alarm();
		this.engineBoom();
		this.stop();
	}

}
