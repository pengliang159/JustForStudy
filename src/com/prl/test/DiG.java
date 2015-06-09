/*
 Copyright (c) 2013 QIDAPP.com. All rights reserved.
 QIDAPP.com PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */ 
package com.prl.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Pengrl
 * @version $Id$
 * @since 1.1, 2014-8-12
 */
public class DiG {
	public static void main(String[] args) {
		String[][] arr = { { "R", "G", "B" }, { "X", "L", "M", "XL", "XXL" },
				{ "1", "2" } };
		List<String> list = new ArrayList<String>();
		DiG d = new DiG();
		List<String> li = d.one(arr, list);
		for (int i = 0; i < li.size(); i++) {
			System.out.println("个数：" + i + "---" + li.get(i));
		}
	}

	public List<String> one(String[][] arr, List<String> list) {
		List<String> newArray = new ArrayList<String>();
		newArray = Arrays.asList(arr[0]);

		for (int m = 1; m < arr.length; m++) {
			String[] arr2 = arr[m];
			newArray = twoBin(newArray, arr2);
		}
		return newArray;
	}

	/**
	 * 两层循环
	 * 
	 * @param list
	 * @param arr2
	 * @return
	 */
	private List<String> twoBin(List<String> list, String[] arr2) {
		List<String> newArr = new ArrayList<String>();
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < arr2.length; j++) {
				newArr.add(list.get(i) + "," + arr2[j]);
			}
		}
		return newArr;
	}
}
