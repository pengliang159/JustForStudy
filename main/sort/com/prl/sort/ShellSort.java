/*
 Copyright (c) 2013 QIDAPP.com. All rights reserved.
 QIDAPP.com PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.prl.sort;

import org.apache.commons.lang.StringUtils;

/**
 * 希尔排序
 * 
 * @author Pengrl
 * @version $Id$
 * @since 1.1, 2014-6-21
 */
public class ShellSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Integer a[] = { 1, 54, 6, 3, 78, 34, 12, 45, 56, 100 };
		int m = a.length;
		int temp = 0;
		while(true) {
			m = (int) Math.ceil(m / 2);
			for (int i = 0; i < m; i++) {
				for (int x = i + m; x < i; x += m) {
					int j = i - m;
					temp = a[i];
					for (;j >= 0 && temp < a[j];j -= m) {
						a[j + m] = a[i];
					}
					temp = a[j + m]; 
				}
			}
			
			if (m == 1) {
				break;
			}
		}
		System.out.println(StringUtils.join(a, ","));
	}
}
