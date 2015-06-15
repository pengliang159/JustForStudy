/*
 Copyright (c) 2013 QIDAPP.com. All rights reserved.
 QIDAPP.com PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */ 
package com.prl.thread.test;

import java.math.BigInteger;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/**
 * @author Pengrl
 * @version $Id$
 * @since 1.1, 2015-6-10
 */
public interface Computable<A, V> {

	V compute(A arg) throws InterruptedException;
	
	public class ExpensiveFunction implements Computable<String, BigInteger> {
		
		@Override
		public BigInteger compute(String arg) throws InterruptedException {
			return new BigInteger(arg);
		}
	}
	
	public class Memorizer1<A, V> implements Computable<A, V> {
		private final Map<A, Future<V>> cache = new ConcurrentHashMap<A, Future<V>>();
		private final Computable<A, V> c;
		public Memorizer1(Computable<A, V> c) {
			this.c = c;
		}
		public V compute(final A arg) throws InterruptedException {
			Future<V> f = cache.get(arg);
			if (f == null) {
				Callable<V> eval = new Callable<V>() {
					@Override
					public V call() throws Exception {
						return c.compute(arg);
					}
				};
				FutureTask<V> ft = new FutureTask<V>(eval);
				f = ft;
				cache.put(arg, ft);
				ft.run();
			}
			try {
				return f.get();
			} catch (ExecutionException e) {
				throw new RuntimeException(e.getCause());
			}
		}
	}
}
