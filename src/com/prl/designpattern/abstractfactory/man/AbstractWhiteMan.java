/*
 Copyright (c) 2013 QIDAPP.com. All rights reserved.
 QIDAPP.com PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */ 
package com.prl.designpattern.abstractfactory.man;


/**
 * @author Pengrl
 * @version $Id$
 * @since 1.1, 2014-5-12
 */
public abstract class AbstractWhiteMan implements Human {

	@Override
	public void laugh() {
		System.out.println("拜仁笑了");
	}

	@Override
	public void cry() {
		System.out.println("拜仁哭了");
	}

	@Override
	public void talk() {
		System.out.println("拜仁吵吵");
	}

}
