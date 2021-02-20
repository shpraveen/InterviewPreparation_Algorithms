package interviews.overloading_overriding.polymorphism;

import java.io.IOException;

public class A1 extends A2{
	
	//Cannot reduce the visibility of the inherited method from A2
//	 void a1() {
//		System.out.println("default () in parent");
//	}
	
	 public void a1() throws RuntimeException{
		System.out.println("default () in parent");
	}
	 
	 public static void main(String[] args) {
		A2 a = new A1();
		A2 a2 = new A2();
		
		a.a1();
	}

}

class A2{
	
	protected void a1() throws NullPointerException{
		
	System.out.println(" () in child");
	}
}

//public > protected > default > private
//Exception > RuntimeException > ArrayIndexOutOfBound|IOException


//Child class should have access modifier either equal or greater than parent's access modifier
//We cannot restrict the access modifier in child


// Child class's Exception thrown should be either equal or less than parent's Exception
