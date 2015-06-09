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
public class ModenPostOffice {

	private LetterProcess letterProcess = new LetterProcessImpl();
	
	public void sendLetter(String context, String address) {
		letterProcess.writeContext(context);
		letterProcess.fillEnvelope(address);
		letterProcess.letterInotoEnvelope();
		letterProcess.sendLetter();
	}
}
