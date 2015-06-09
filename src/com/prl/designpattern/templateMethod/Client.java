/*
 Copyright (c) 2013 QIDAPP.com. All rights reserved.
 QIDAPP.com PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */ 
package com.prl.designpattern.templateMethod;

/**
 * @author Pengrl
 * @version $Id$
 * @since 1.1, 2014-5-27
 */
public class Client {

	public static void main(String[] args) {
		HummerModel h1 = new HummerH1Model();
		h1.run();
		System.out.println();
		HummerModel h2 = new HummerH2Model();
		h2.run();
	}
}
