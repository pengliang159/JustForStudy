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
public class BlackMaleMan extends AbstractBlackMan {

	@Override
	public void sex() {
		System.out.println("white male");
	}

}
