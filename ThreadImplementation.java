package com.learn.threadconcept.corejava;


//class Hi extends Thread
class Hi implements Runnable
{
  public  void run()
  {
      for(int index=1;index<=5;index++) 
      {
    	  System.out.println("           "+index+"hiii");
    	  try
    	  {Thread.sleep(1000);}catch(Exception e) {};
      }
  }
}
//class Hello extends Thread
class Hello implements Runnable
{
	  public void run()
	  {
	      for(int index=1;index<=5;index++) 
	      {
	    	  System.out.println(index+"hello!...");
	    	  try
	    	  {Thread.sleep(1000);}catch(Exception e) {};
	      }
	  }
	
}
public class ThreadImplementation {
	public static void main(String...args) {
		
		Hi obj1=new Hi();
		Hello obj2=new Hello();
		
		Thread t1=new Thread(new Hi());
		Thread t2=new Thread(obj2);
		
		t1.start();
		try {Thread.sleep(10);}catch(Exception e) {};
		t2.start();
		
		
		
	}

}
