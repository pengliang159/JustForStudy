/*
 Copyright (c) 2013 QIDAPP.com. All rights reserved.
 QIDAPP.com PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */ 
package com.prl.designpattern.facade;

/**
 * @author Pengrl
 * @version $Id$
 * @since 1.1, 2014-5-14
 */
public class LetterProcessImpl implements LetterProcess {

	@Override
	public void writeContext(String context) {
		System.out.println("我在写信，写的内容是：" + context);
	}

	@Override
	public void fillEnvelope(String address) {
		System.out.println("写完信写地址，地址是：" + address);
	}

	@Override
	public void letterInotoEnvelope() {
		System.out.println("把信放进信封里...");
	}

	@Override
	public void sendLetter() {
		System.out.println("把信寄出去...");
	}

}
