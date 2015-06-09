/*
 Copyright (c) 2013 QIDAPP.com. All rights reserved.
 QIDAPP.com PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */ 
package com.prl.thread.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author Pengrl
 * @version $Id$
 * @since 1.1, 2015-6-6
 */
public class Test<T> {
	List<T> lst = new CopyOnWriteArrayList<T>();
	Map<String, T> map = new ConcurrentHashMap<String, T>();
	
	private static ThreadLocal<Connection> connectionHolder = new ThreadLocal<Connection>(){
		public Connection initialValue() {
			try {
				return DriverManager.getConnection("");
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return null;
		}
	};

	public static void main(String[] args) {
		ExpiredThread et = new ExpiredThread();
		String[] ss = et.getStates();
		ss[0] = "AAAA";
		String[] s2 = et.getStates();
		for (String s : s2) {
			System.out.println(s);
		}
	}
	
	public static Connection getConnection(){
		return connectionHolder.get();
	}
}
