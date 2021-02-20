package interviews.overloading_overriding;

// Compilation error due to line 24
//The exception thrown by the overriding method should not be new or more broader 
//checked exception. In the code above, Exception is more broader class of checked 
//exception than IOException, so this results in compilation error.
import java.io.IOException; 


class Derived4  
{ 
    public void getDetails() throws Exception //line 23 
    { 
        System.out.println("Derived class"); 
    } 
} 
  
public class Test4 extends Derived4 
{ 
    public void getDetails() throws RuntimeException//line 24 
    { 
        System.out.println("Test class"); 
    } 
    
    public static void main(String[] args) throws Exception
    { 
        Derived4 obj = new Test4(); 
        obj.getDetails(); 
    } 
} 