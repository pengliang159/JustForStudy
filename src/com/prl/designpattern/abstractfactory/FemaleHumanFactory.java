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
public class FemaleHumanFactory extends AbstractHumanFactory {

	@Override
	public Human createBlackHuman() {
		return createHuman(HumanEnum.BlackFeMaleMan);
	}
	
	@Override
	public Human createWhiteHuman() {
		return createHuman(HumanEnum.WhiteFeMaleMan);
	}
	
	@Override
	public Human createYellowHuman() {
		return createHuman(HumanEnum.YellowFeMaleMan);
	}
}
