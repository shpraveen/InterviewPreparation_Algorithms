package interviews.overloading_overriding;

class Point { 
    protected int x, y; 
  
    public Point(int _x, int _y) 
    { 
        x = _x; 
        y = _y; 
    }

	public Point() {
		// TODO Auto-generated constructor stub
	} 
} 
  
public class Test7 { 
    public static void main(String args[]) 
    { 
        Point p = new Point(); 
        System.out.println("x = " + p.x + ", y = " + p.y); 
    } 
} 

//Compiler Error

//there are no access permission issues because the Point and Main are in the same package and protected members 
//of a class can be accessed in other classes of the same package. The problem with the code is: there is no 
//default constructor in Point.
//Like C++, if we write our own parametrized constructor then Java compiler doesn’t create the default constructor. 
//So there are following two changes to Point class that can fix the above program.
//
//Remove the parameterized constructor.
//Add a constructor without any parameter.
//Java doesn’t support default arguments, so that is not an option.