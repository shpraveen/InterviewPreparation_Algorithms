package interviews.overloading_overriding;

//Test class Derived class
//super keyword is used to invoke the overridden method from a child class explicitly.
class Derived5  
{ 
    public void getDetails() 
    { 
        System.out.printf("Derived class "); 
    } 
} 
  
public class Test5 extends Derived5 
{ 
    public void getDetails() 
    { 
        System.out.printf("Test class "); 
        super.getDetails(); 
    } 
    public static void main(String[] args) 
    { 
        Derived5 obj = new Test5(); 
        obj.getDetails(); 
    } 
} 