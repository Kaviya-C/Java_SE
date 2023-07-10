package com.recollect.corejava;
/*
 * After java command memory is divided into two parts
 * stack and heap
 * stack -- execution purpose
 * heap -- storage purpose
 * 
 * static members are stored in class memory
 * static member common for all objects .
 * every object shared each other.if we change any one of the static  variables that will be reflected on all the objects
 * 
 * static context cannot be accessed non-static contex
 * instance context can be accessed inside static context
 * 
 * for every object there will be seperate instance component wil be created
 * instance members are stored in object memory
 * 
 * 
 * string memory mangement--- jvm allocates special memory {string constant pool}
 * if we create string objects using new keyword that will be stored in heap memory
 * string literals are stored in string constant pool.
 * 
 * in string constant pool there cannot be two string objects with same content.
 * heap== there can be two string having same content
 *  whenever we are creating string literals jvm always check in SCP whether these string literal 
 *  already there or not it it is there then it will use that exiting object no create new object 
 * 
 * 
 * 
 */
public class MemoryManagement 
{
	int i;
	static int num;
	public  void method() {
		num=20;
	}

	public static void main(String...args)
	{
		MemoryManagement m=new MemoryManagement();
		m.i=10;
		
			m.method();
		

		System.out.println(num);
	}
	
}
