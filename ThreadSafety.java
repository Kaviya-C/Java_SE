package com.learn.threadconcept.corejava;

import java.util.concurrent.atomic.AtomicInteger;

// mutation--mutable  x=6
//multiple thread--- mutable data --- problem start
// immutability  we cannot modify the value once we assigned

class Counters
{
   AtomicInteger count=new AtomicInteger();
   public  void increment()
   {
	   count.incrementAndGet();
   }
}
public class ThreadSafety 
{
	public static void main(String...args)  throws InterruptedException
	{
		Counters c=new Counters(); 
		Thread t1=new Thread(new Runnable() 
		{  
			public void run() 
			{
				for(int index=1;index<=1000;index++)
				{
					c.increment();
				}
							
			}
			
		});
		Thread t2=new Thread(new Runnable() 
		{  
			public void run() 
			{
				for(int index=1;index<=1000;index++)
				{
					c.increment();
				}
							
			}
			
		});
			
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		System.out.println(c.count);
		
	}

}
