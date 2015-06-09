/*
 Copyright (c) 2013 QIDAPP.com. All rights reserved.
 QIDAPP.com PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */ 
package com.prl.designpattern.templateMethod;

/**
 * @author Pengrl
 * @version $Id$
 * @since 1.1, 2014-5-26
 */
public abstract class HummerModel {

	/*
	 * 启动
	 */
	protected abstract void start();
	
	/*
	 * 停止
	 */
	protected abstract void stop();
	
	/*
	 * 鸣笛
	 */
	protected abstract void alarm();
	
	/*
	 * 引擎发动了
	 */
	protected abstract void engineBoom();
	
	/*
	 * 启动
	 */
	public abstract void run();
}
