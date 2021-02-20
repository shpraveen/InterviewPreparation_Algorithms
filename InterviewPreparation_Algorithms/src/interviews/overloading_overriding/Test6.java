package interviews.overloading_overriding;

class Base6 { 
    public void Print() 
    { 
        System.out.println("Base"); 
    } 
} 
  
class Derived6 extends Base6 { 
    public void Print() 
    { 
        System.out.println("Derived"); 
    } 
} 
  
class Test6 { 
    public static void DoPrint(Base6 o) 
    { 
        o.Print(); 
    } 
    public static void main(String[] args) 
    { 
        Base6 x = new Base6(); 
        Base6 y = new Derived6(); 
        Derived6 z = new Derived6(); 
        DoPrint(x); 
        DoPrint(y); 
        DoPrint(z); 
    } 
}

//Output:
//
//Base
//Derived
//Derived
//
//Predicting the first line of output is easy. We create an object of type Base and call DoPrint(). 
//DoPrint calls the print function and we get the first line.
//
//DoPrint(y) causes the second line of output. Like C++, assigning a derived class reference to a base class 
//reference is allowed in Java. Therefore, the expression Base y = new Derived() is a valid statement in Java. 
//In DoPrint(), o starts referring to the same object as referred by y. Also, unlike C++, functions are virtual 
//by default in Java. So, when we call o.print(), the print() method of Derived class is called due to run time
//polymorphism present by default in Java.
//DoPrint(z) causes the third line of output, we pass a reference of Derived type and the print() method of 
//Derived class is called again. The point to note here is: unlike C++, object slicing doesn’t happen in Java.
//Because non-primitive types are always assigned by reference.