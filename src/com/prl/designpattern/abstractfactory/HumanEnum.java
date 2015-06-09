/*
 Copyright (c) 2013 QIDAPP.com. All rights reserved.
 QIDAPP.com PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */ 
package com.prl.designpattern.abstractfactory;

/**
 * @author Pengrl
 * @version $Id$
 * @since 1.1, 2014-5-12
 */
public enum HumanEnum {

	YellowMaleMan("com.prl.designpattern.abstractfactory.YellowMaleMan"),
	YellowFeMaleMan("com.prl.designpattern.abstractfactory.YellowFeMaleMan"),
	WhiteMaleMan("com.prl.designpattern.abstractfactory.WhiteMaleMan"),
	WhiteFeMaleMan("com.prl.designpattern.abstractfactory.WhiteFeMaleMan"),
	BlackMaleMan("com.prl.designpattern.abstractfactory.BlackMaleMan"),
	BlackFeMaleMan("com.prl.designpattern.abstractfactory.BlackFeMaleMan");
	
	private String value = "";
	
	private HumanEnum(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
}
