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
public class House extends Product {

	@Override
	public void beProducted() {
		System.out.println("生产出来的房子是这样的");
	}

	@Override
	public void beSelled() {
		System.out.println("生产出的房子卖出去了");
	}

}
