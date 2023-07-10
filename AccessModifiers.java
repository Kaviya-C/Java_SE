package com.recollect.corejava;
/*
 * private---constructor field method inner class here private are applicable
 * protected---within the package and those inherited to any sub classes
 * public
 * default-----subclass of same package
 */
class Father
{
	  Father()
	{
		System.out.println("Father in private constructor");
	}
	
}
class Daughter extends Father
{
	protected  Daughter()
	 // if we not mention any modifier then
	 //that place contains default modifier--->visibility within the package
	{
		System.out.println("Daughter in private constructor");
	}
}
public class AccessModifiers 
{
	public static void main(String...args)
	{
		Father f=new Daughter(); 
		
	}
	

}
