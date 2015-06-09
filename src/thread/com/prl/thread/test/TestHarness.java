package com.prl.thread.test;

import java.util.concurrent.CountDownLatch;

/**
 * TestHarness
 * <p/>
 * Using CountDownLatch for starting and stopping threads in timing tests
 *
 * @author Brian Goetz and Tim Peierls
 */
public class TestHarness {
    public long timeTasks(int nThreads, final Runnable task)
            throws InterruptedException {
        final CountDownLatch startGate = new CountDownLatch(1);
        final CountDownLatch endGate = new CountDownLatch(nThreads);

        for (int i = 0; i < nThreads; i++) {
            Thread t = new Thread() {
                public void run() {
                    try {
                    	System.out.println(startGate.getCount() + "----start");
                        startGate.await();
                        try {
                            task.run();
                        } finally {
                        	System.out.println(endGate.getCount() + "----end");
                            endGate.countDown();
                        }
                    } catch (InterruptedException ignored) {
                    }
                }
            };
            t.start();
        }

        System.out.println("-----------------111111111111");
        long start = System.nanoTime();
        startGate.countDown();
        endGate.await();
        System.out.println("-----------------2222222222222");
        long end = System.nanoTime();
        return end - start;
    }
    
    public static void main(String[] args) throws InterruptedException {
		long i = new TestHarness().timeTasks(10, new Thread(new ThreadTest()));
		System.out.println();
		System.out.println();
		System.out.println(i);
	}
}
