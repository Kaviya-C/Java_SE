
/*
 * Inheritance in java used to add additional functionality of existing class
 * we can use extends keyword to achieve inheritance
 * constructors,static initialization block , instance initialization block of 
 * super class will not be inherited to its sub class
 * but they are executed while creating an object of subclass
 * 
 * types of inheritance----> Single,Multilevel,Hierarchical,Hybrid,
 * multiple inheritance cannot be supported in java bcoz of ambiguity problem.
 * ------------------------------super-------------------------
 * super keyword used to access super class members inisde the subclass
 *  super is applicable to access super class constructor method field
 *   super and this keyword not applicable for static method and static initialization block. 
 * 
 * 
 * ------------------------Interface------------------------
 *   Interface in java very much similar to abstract class
 *   abstract class is the combination of concrete and abstract methods
 *   Interface contains only abstract default static methods---100% abstraction
 *   we cant create object for interfaces---we can use interface as reference for implented subclass of that interface
 *   using implements keyword we can implement the interface in our class  
 *   interfaces can have field and abstract methods
 *   by default every field in an interface is public static final
 *   methods by default public abstract
 *   while overriding the abstract method in subclass should not reduce the visibility always it should be public
 *   by default interface itself is abstract ---not public
 *   we no need to write the abstract keyword explicitly
 *    
 *   classes in java inherited from java.lang.object
 *   interfaces in java don't inherit from object class  
 *    
 *   -----------------------polymorphism--------------------
 *   poly-many morph-forms
 *   it refers to an entity where operator constructor method which takes many forms or it can be used for multiple task while compiling or running
 *   static polymorphism ,Dynamic polymorphism
 *   
 *   -----------------------Static polymorphism----------------------
 *  
 *   During compile time
 *   eg:operator overloading,constructor overloading,method overloading
 *   bcoz they shows polymorphism during at compile time
 *   static binding or early binding
 *   -----------------------operator overloading-----------------------
 *    + operator used for concate two strings also used to add two numbers
 *    ------------------------constructor overloading--------------------
 *    multiple constructors are allowed in a class 
 *    if we pass different number of arguments having same name for all the constructor 
 *   -----------------------method overloading------------------
 *     passing different argument for same method name 
 *     
 *     eg:
 *     
 *     class A
 *     {}
 *     class B extends A {}
 *     class C extend B{}
 *     public class D{
 *     
 *      public static void main(String...args)
 *      {
 *          A a=new A();
 *          a=new B();
 *          a=new C();
 *      }
 *     }
 *----------------------------------------------Dynamic polymorphism-----------------
 *
 *an entity which shows polymorphism during runtime is called dynamic polymorphism
 *method overriding is the best eg
 *dynamic or late binding 
 * ---------------------------method overloading----------------
 * when a class has more than one method with same name then we call that method is overloaded
 * overloaded method have different number of arguments or different types of arguments
 * but name of the method remains same     
 *    
 *    method signature---->method name
 *                    ---->number of arguments
 *                    ---->types of arguments
 *    *****return type,access modifier ,static,non-static is not considered in method signature*****             
 *  method overloading---method name must be same,number of arguments or types of arguments should be different
 *   
 *  --------------------------method overriding-----------------
 *  through method overriding we can modify the super class method according to our requirement  
 *  applicable only for methods 
 *  same method signature
 *  if parent class method is not satisfied the child class then child class can override that parent class
 *   method without changing the method signature. 
 *  should not reduce the visibility .. we can increase the visibility
 *     
 *    
 * ----------------- method overloading  VS method overriding--------------------
 *  
 *   definition,method signature,return type,visibility,final private methods,
 *   static context,binding ,class requirement.
 *  ----------------------------static binding vs dynamic binding-----------------
 *  
 *    binding -- link between method calls an method definition
 *    
 *    static binding happens during compilation
 *    early binding
 *    bcoz binding happens before a program actually runs
 *    
 *    static binding not checking the type of object it only checks the reference variable
 *       
 *    
 *    
 *    
 */
package com.recollect.corejava;
class Parent{
	public  void draw()
	{
		System.out.println("Draw in parent class");
	}
}
class Child extends Parent
{
	@Override
	public  void draw()
	{
		System.out.println("Draw in child class");
	}
}
public class SubClass{
	public static void main(String...args)
	{
		Parent p=new Parent();
		p.draw();
		p=new Child();// checks the runtime object so output is draw in child class
		p.draw(); 
	}
}

//private static final are allowed to overload not override 
// in above  we override the draw method so it is dynamic binding and it depends on run time object.



























