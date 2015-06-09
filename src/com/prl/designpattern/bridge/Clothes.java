/*
 Copyright (c) 2013 QIDAPP.com. All rights reserved.
 QIDAPP.com PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */ 
package com.prl.designpattern.bridge;

/**
 * @author Pengrl
 * @version $Id$
 * @since 1.1, 2014-7-11
 */
public class Clothes extends Product {

	@Override
	public void beProducted() {
		System.out.println("生产出的衣服是这样子的");
	}

	@Override
	public void beSelled() {
		System.out.println("生产出的衣服卖出去了");
	}

}
