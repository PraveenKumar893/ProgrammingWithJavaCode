package com.Algorithms.Algoriths;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

class threadstate implements Runnable {

	public void run() {
		
	//	System.out.println(Thread.currentThread().getName());
	}
	
}

public class ThreadExecutorService {
	
	
	static void countValuess () {
		
		int count = 0 ;
		
		int values = count++;
		
		System.out.println(" ncxnxcmcxmnvxcxm " + values );
		
		System.out.println(" hgsdhdssdjhjhdshj " + count++);
		System.out.println(" hdssdjhjhdshj " + ++count);
		System.out.println(" hgsdhdssdjhjhdshj " + count++);
		System.out.println(" hdssdjhjhdshj " + ++count);

	}

	public static void main(String[] args) {
		ExecutorService execute  = Executors.newFixedThreadPool(5 , new ThreadFactory() {
			
			private int count = 0;
			
			@Override
			public Thread newThread(Runnable r) {
				return new Thread(r , " ThreadPoolService - " + count++);
			}
		});
		
		for(int i = 1 ; i<10 ;i++) {
			execute.submit(new threadstate());			
		}
		
		execute.shutdown();
		
		ExecutorService execsss = Executors.newFixedThreadPool(5);
		
		for(int i = 0 ; i<10 ;i++) {
			execsss.submit(new threadstate());
		}
		
		execsss.shutdown();
		countValuess();
	}
	
	
	
}
