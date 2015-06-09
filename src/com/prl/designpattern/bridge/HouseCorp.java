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
public class HouseCorp extends Corp {

	public HouseCorp(House house) {
		super(house);
	}
	
	public void makeMoney() {
		super.makeMoney();
		System.out.println("房地产公司赚大钱了...");
	}

}
