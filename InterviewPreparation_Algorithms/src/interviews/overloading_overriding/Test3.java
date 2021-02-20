package interviews.overloading_overriding;

// Compilation error due to access modifier -The overriding method can not have more restrictive access modifier.

class Derived3  
{ 
    public void getDetails() 
    { 
        System.out.println("Derived class"); 
    } 
} 
  
public class Test3 extends Derived3 
{ 
//    protected void getDetails() 
//    { 
//        System.out.println("Test class"); 
//    } 
    public static void main(String[] args) 
    { 
        Derived3 obj = new Test3();  // line xyz 
        obj.getDetails(); 
    } 
} 