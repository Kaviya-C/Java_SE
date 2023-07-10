package com.learn.threadconcept.corejava;

public class ThreadPriority {
	public static void main(String...args) throws InterruptedException
	{
		Thread t1=new Thread(()->
		{
			for(int index=0;index<5;index++)
			{
			System.out.println("Hi "+Thread.currentThread().getPriority());
			try{Thread.sleep(1000);}catch(Exception e) {}
			}
		
	},"Hi Thread");
		Thread t2=new Thread(()->
		{
			for(int index=0;index<5;index++)
			{
			System.out.println("Hello "+Thread.currentThread().getPriority());
			try{Thread.sleep(1000);}catch(Exception e) {}
			}
		},"Hello Thread");
        t1.setPriority(Thread.NORM_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		t1.start(); 
		try{Thread.sleep(10);}catch(Exception e) {}
		t2.start();
		System.out.println(t1.isAlive());
		
		t1.join();
		t2.join();
		
		System.out.println(t1.isAlive());
		System.out.println("Bye");
	}

}
