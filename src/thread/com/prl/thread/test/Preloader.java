/*
 Copyright (c) 2013 QIDAPP.com. All rights reserved.
 QIDAPP.com PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */ 
package com.prl.thread.test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.Semaphore;

/**
 * @author Pengrl
 * @version $Id$
 * @since 1.1, 2015-6-9
 * 
 * java并发编程 5.3
 */
public class Preloader {
	
	Semaphore semaphore = new Semaphore(3);
	
	private class ProductInfo {
		
	}

	private final FutureTask<ProductInfo> future = new FutureTask<ProductInfo>(new Callable<ProductInfo>() {
		@Override
		public ProductInfo call() throws Exception {
			return loadProductInfo();
		}
	});
	
	private final Thread thread = new Thread(future);
	public void start(){
		thread.start();
	}
	
	public ProductInfo get() throws InterruptedException{
			try {
				return future.get();
			} catch (ExecutionException e) {
				Throwable cause = e.getCause();
				if (cause instanceof RuntimeException) {
					throw (RuntimeException) cause;
				} else {
					throw launderThrowable(cause);
				}
			}
	}
	
	public ProductInfo loadProductInfo(){
		return new ProductInfo();
	}
	
	public static RuntimeException launderThrowable(Throwable t){
	    if (t instanceof RuntimeException) return (RuntimeException) t;
	    else if  ( t instanceof Error) throw (Error)t;
	    else throw new IllegalStateException("Not unchecked",t);
	}
}
