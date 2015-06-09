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
public class Client {

	public static void main(String[] args) {
		House house = new House();
		System.out.println("-----房地产公司是这个样子运行的-----");
		HouseCorp houseCorp = new HouseCorp(house);
		houseCorp.makeMoney();
		System.out.println("\n");
		
		System.out.println("-----山寨公司是这样运行的------");
		ShanZaiCorp shanZaiCorp = new ShanZaiCorp(new Clothes());
		shanZaiCorp.makeMoney();
	}
}
