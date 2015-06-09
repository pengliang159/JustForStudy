/*
 Copyright (c) 2013 QIDAPP.com. All rights reserved.
 QIDAPP.com PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */ 
package com.prl.designpattern.command;

/**
 * @author Pengrl
 * @version $Id$
 * @since 1.1, 2014-7-11
 */
public abstract class DeletePageCommand extends Command {

	@Override
	public void execute() {
		super.pg.find();
		super.pg.delete();
		super.pg.plan();
	}

}
