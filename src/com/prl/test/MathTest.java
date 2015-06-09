/*
 Copyright (c) 2013 QIDAPP.com. All rights reserved.
 QIDAPP.com PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */ 
package com.prl.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Pengrl
 * @version $Id$
 * @since 1.1, 2014-9-5
 */
public class MathTest {

	public static int[] parse(int[]arr, int target) {
		int[] result = {};
		List<Integer> lst = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			for (int j =  i + 1; j < arr.length - 1; j++) {
				lst.add(i);lst.add(j);
			}
		}
		return result;
	}
	
	public static int[] first(int num1, int num2, int target) {
		if (num1 + num2 == target) {
			return new int[] {num1, num2};
		}
		return null;
	}
}
