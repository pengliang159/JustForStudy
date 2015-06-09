/*
 Copyright (c) 2013 QIDAPP.com. All rights reserved.
 QIDAPP.com PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */ 
package com.prl.sort;

import java.util.Random;

import org.apache.commons.lang.StringUtils;

/**
 * 插入排序
 * 
 * @author Pengrl
 * @version $Id$
 * @since 1.1, 2014-6-21
 */
public class InsertSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Integer[] arr = new Integer[10];
		Random random = new Random();
		int index = 0;
		while(true) {
			int num = random.nextInt(100) + 1;
			arr[index++] = num;
			if (index > 9) { break; }
		}
		
		System.out.println(StringUtils.join(arr, ","));
		
		int temp = 0;
		for (int i = 1; i < arr.length; i++) {
			int j = i - 1;
			temp = arr[i]; // 当前比对数
			// 当前比对数和前面的进行比对，如果发现前面的数字大于自己，就进行对换
			for (;j >= 0 && arr[j] > temp; j--) {
				arr[j + 1] = arr[j];
				arr[j] = temp;
			}
		}
		
		System.out.println(StringUtils.join(arr, ","));
	}

}
