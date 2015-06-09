/*
 Copyright (c) 2013 QIDAPP.com. All rights reserved.
 QIDAPP.com PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */ 
package com.prl.test;

import java.util.Random;

/**
 * @author Pengrl
 * @version $Id$
 * @since 1.1, 2014-12-10
 */
public class RandomId {
	private Random random;
	private String table;

	public RandomId() {
		random = new Random();
		table = "0123456789";
	}

	public String randomId(int id) {
		String ret = null, num = String.format("%06d", id);
		int key = random.nextInt(10), seed = random.nextInt(100);
		Caesar caesar = new Caesar(table, seed);
		num = caesar.encode(key, num);
		ret = num + String.format("%01d", key) + String.format("%02d", seed);

		return ret;
	}

	public static void main(String[] args) {
		RandomId r = new RandomId();
		for (int i = 0; i < 30; i += 1) {
			System.out.println(r.randomId(2));
		}
	}
}
