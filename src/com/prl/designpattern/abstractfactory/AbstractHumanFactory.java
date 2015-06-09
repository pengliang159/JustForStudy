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
public abstract class AbstractHumanFactory implements HumanFactory {

	protected Human createHuman(HumanEnum humanEnum) {
		Human human = null;
		
		if (!humanEnum.getValue().equals("")) {
			try {
				human = (Human) Class.forName(humanEnum.getValue()).newInstance();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		return human;
	}
	
}
