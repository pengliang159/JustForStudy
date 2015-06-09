/*
 Copyright (c) 2013 QIDAPP.com. All rights reserved.
 QIDAPP.com PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */ 
package com.prl.designpattern.abstractfactory;

import com.prl.designpattern.abstractfactory.man.Human;

/**
 * @author Pengrl
 * @version $Id$
 * @since 1.1, 2014-5-12
 */
public class NvWa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HumanFactory hf = new MaleHumanFactory();
		Human bhm = hf.createBlackHuman();
		Human whm = hf.createWhiteHuman();
		Human yhm = hf.createYellowHuman();
		bhm.cry();
		whm.cry();
		yhm.cry();
		bhm.laugh();
		bhm.talk();
	}

}
