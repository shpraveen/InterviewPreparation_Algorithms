package Java8.interfaces;


//We cannot instantiate Interface, however we can implement anonymous inner class
public class DriverClass_Instantiating_Interface implements TestInterface3 {
	
	TestInterface3 i3 = new TestInterface3() {
		
		@Override
		public void square(int a) {
			System.out.println("Anonymous inner class interface");
			
		}
	};

	public static void main(String[] args) {
		
	DriverClass_Instantiating_Interface d = new DriverClass_Instantiating_Interface();
	d.i3.square(10);
	d.square(20);
	}

	@Override
	public void square(int a) {
		System.out.println("\nInterface overriddden method !");
		
	}

}
