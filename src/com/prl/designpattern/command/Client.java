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
public class Client {

	public static void main(String[] args) {
		System.out.println("------客户要求增加一个需求---------");
		Group rg = new RequirementGroup();
		rg.find();
		rg.add();
		rg.plan();
	}
}
