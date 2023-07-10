
/*
 * super -- to access the super class members inside a sub class
 * class A{
 * int i;
 * A(int value)
 * {         System.out.println(value);
 *               }
 *                }
 * Class B extends A
 * {
 * public B(){
 * super(10);-----calling super class one argument constructor
 * }
 * }
 * 
 * 
 * 
 * ---------throw keyword--------------
 * to handover our created exception object to the jvm manually
 * need :
 *        customized user defined exceptions--withdrawn balance 10_000 but send request 20,000 that is a problem
 *        wihtdraw(double amount)
 *        {
 *           if(amount>balance)
 *               throw new InsufficientBalanceException
 *        }  
 *  throw keyword purpose is used for customized user defined exception
 *  not for predefined exceptions
 *   
 *        
 * ------------------throw----------------------------
 *        person who is throwing that person is programmer what we throw we throw exception object
 *        who caught this exception jvm will catch this.
 *        
 *  ------------------------------without throw keyword---------------
 *  
 *        class Test{
 *             public static void main(String...args)
 *             {
 *                     System.out.println(10/0);
 *             }
 *        
 *        }
 *   Exception in thread "main" java.lang.Arithmatic Exception by zero of Test.main()
 *   -------------------------------------------------------------------
 *        ------------with throw keyword-----------
 *        class Test{
 *            public static void main(String...args)
 *            {
 *                   throw new ArithmaticException("/ by Zero");
 *                   we created excception object explicitly
 *                   
 *                   throw--- handover our created exception object to the jvm manually.
 *            }
 *        
 *        }
 *        
 *   here we are not write any handle code so we get the output as:
 *   Exception in thread "main" java.lang.Arithme tic Exception by zero of Test.main()
 * ----------------------------------------------------------------
 *    
 *    -----------------final-------------------------
 *    final applicable for classes methods variables    
 *    1- any class or any method can be either abstract or final but not both
 *    abstract final are totally opposite
 *    
 *      class or static variable   --->  declared with static keyword
 *                                 --->  common to all instances of class 
 *                                 --->  variables are shared between the object of a class
 *                                 --->  common to all objects of class changes made to these variables through one object will reflect in another
 *                                 --->  accesses through class name or object reference 
 *      instance variable          --->  declared without static keyword
 *                                 --->  for every object it will have own seperate instance copy is available
 *                                 --->  variables not shared between the object of a class
 *                                 --->  changes made on one variables will not reflect other object
 *                                 --->  accessed by only object reference                       
 */

