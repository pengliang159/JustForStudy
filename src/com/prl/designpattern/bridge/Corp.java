/*
 Copyright (c) 2013 QIDAPP.com. All rights reserved.
 QIDAPP.com PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */ 
package com.prl.designpattern.bridge;

/**
 * @author Pengrl
 * @version $Id$
 * @since 1.1, 2014-7-11
 * 
 * 桥梁模式
 */
public abstract class Corp {

	private Product product;
	
	public Corp(Product product) {
		this.product = product;
	}
	
	public void makeMoney() {
		this.product.beProducted();
		this.product.beSelled();
	}
}
