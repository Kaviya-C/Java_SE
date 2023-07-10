package com.recollect.corejava;
/*
 * Type casting --- primitive casting and derived casting
 * primitive casting used to convert data from one primitive data type to another primitive data type
 * two types in primitive casting:
 *       Auto widening--- small to big data type--->implicitly happened
 *       Explicit narrowing----big to small we have to do manually-- explicitly.
 *       
 * two types inn derived casting
 *        Auto up casting-- change the type of object from subclass type to super class type
 *        Explicit down casting
 *    Vechicle v=new Vechicle--- parent
 *    v.drive()--- parent drive method will execute
 *    
 *    Car c=new Car();
 *    c.drive()  -- car drive method will execute
 *    
 *    Car c =(Car)new Vechicle();--- explicit down casting
 * 
 * 
 * 
 */
class Vehicle{
	public void drive()
	{
		System.out.println("Drive the vechicle");
	}
}
class Car extends Vehicle{
	public void drive()
	{
		System.out.println("Drive the car");
	}
}
public class TypeCasting {
 public static void main(String...args)
 {
	 Vehicle v=new Vehicle();
	 v.drive();
	 
	 Vehicle v1=new Car();//---auto upcasting
	 v1.drive();
	 
	 Car c=(Car)v;
	 c.drive();
 }
}
