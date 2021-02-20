package Java8.interfaces;

public class DefaultMethodInterfaceJava8 implements TestInterfaceJava8{
	
	public void square(int a) {
		
		int square = a*a;
		System.out.println("Implmented Abstract method called !!"+square);
	}
	
	public static void main(String[] args) {
		
		DefaultMethodInterfaceJava8 d = new DefaultMethodInterfaceJava8();
		d.square(10);
		
		d.show();
		
		TestInterfaceJava8.prints();
	}

}
