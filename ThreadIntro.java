package com.learn.threadconcept.corejava;


// thread-- its a unit of process
// multi-threading
// multi task at same time 
// while typing  in ms word there may be spell check problem---that take care by
// spell checker which is in  ms-word

// using complete power of CPU --- octa cores 

// we can access web application in thread concept

public class ThreadIntro {
    public static void main(String...args) {
    	
    }
}

// how we can achieve thread:
//
// we have to create a class of"MyThread"
//that extends thread in that we specify method as run()
// Thread t=new MyThread();
//t.run();
//we have a main thread parallely i want to run one more thread
//by using run method we cannot achieve this so use start method like 
//t.start();-it will call a run method and create a thread
// wait for 2 sec---sleep is static method
//--ms accepted as arguments  2000 ms mean 2 sec
//wait(),notify(),notifyAll()  

// implements Runnable
// class MyThread extends A implements Runnable

//two ways to achieve multithreading:
/*
1] extending a thread class
2] implementing Runnable interface

*/









