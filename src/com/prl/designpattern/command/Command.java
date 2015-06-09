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
public abstract class Command {

	protected RequirementGroup rg = new RequirementGroup();
	protected PageGroup pg = new PageGroup();
	protected CodeGroup cg = new CodeGroup();
	
	public abstract void execute();
}
