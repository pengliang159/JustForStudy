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
public interface LetterProcess {

	// 信的内容
	public void writeContext(String context);
	
	// 写信封
	public void fillEnvelope(String address);
	
	// 信放进信封
	public void letterInotoEnvelope();
	
	// 邮递
	public void sendLetter();
}
