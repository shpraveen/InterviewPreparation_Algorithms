package Java8.interfaces;


@FunctionalInterface
// This annotation will allow only abstract method || will throw Invalid '@FunctionalInterface' annotation; TestInterfaceJava8 is not a functional interface 
public interface TestInterfaceJava8 {
	
	public void square(int a);
	
	//public void cube(int a);
	
	default void show() {
		System.out.println("\nInside Interface Defualt Method Java8 !! ");
	}
	
	static void prints() {
		System.out.println("\nInside Interface static Method Java 8 !! ");
	}

}
