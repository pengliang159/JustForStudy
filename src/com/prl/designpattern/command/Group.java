/*
 Copyright (c) 2013 QIDAPP.com. All rights reserved.
 QIDAPP.com PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */ 
package com.prl.designpattern.command;

/**
 * @author Pengrl
 * @version $Id$
 * @since 1.1, 2014-7-11
 * 
 * 命令模式
 */
public abstract class Group {

	// 甲乙双方分开办公，你要和那个组讨论，你首先要找到这个组
	public abstract void find();
	
	public abstract void add();
	
	public abstract void delete();
	
	public abstract void change();
	
	public abstract void plan();
}
