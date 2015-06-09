/*
 Copyright (c) 2013 QIDAPP.com. All rights reserved.
 QIDAPP.com PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */ 
package com.prl.designpattern.facade;

/**
 * @author Pengrl
 * @version $Id$
 * @since 1.1, 2014-5-15
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LetterProcess lp = new LetterProcessImpl();
		lp.writeContext("哎呀，你好啊。请打100块给我。");
		lp.fillEnvelope("泗陈公路1888弄130号");
		lp.letterInotoEnvelope();
		lp.sendLetter();
		System.out.println();
		System.out.println();
		System.out.println();
		ModenPostOffice mpo = new ModenPostOffice();
		mpo.sendLetter("哎呀，你好啊。我是来自中国的学生给你写英文啊", "ameracia god road happyness way");
	}

}
