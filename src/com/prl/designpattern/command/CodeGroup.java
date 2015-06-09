/*
 Copyright (c) 2013 QIDAPP.com. All rights reserved.
 QIDAPP.com PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */ 
package com.prl.designpattern.command;

/**
 * @author Pengrl
 * @version $Id$
 * @since 1.1, 2014-7-11
 */
public class CodeGroup extends Group {

	@Override
	public void find() {
		System.out.println("找到代码组");
	}

	@Override
	public void add() {
		System.out.println("客户要求增加一个功能");
	}

	@Override
	public void delete() {
		System.out.println("客户要求修改一个功能");
	}

	@Override
	public void change() {
		System.out.println("客户要求删除一个功能");
	}

	@Override
	public void plan() {
		System.out.println("客户要求功能变更计划");
	}

}
