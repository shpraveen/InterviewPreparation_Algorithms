package Java8.interfaces;

//Duplicate default methods named show with the parameters () and () are inherited from the types 
//TestInterface2 and TestInterface1
// Need to override default method 
public class DriverClass implements TestInterface1, TestInterface2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DriverClass d = new DriverClass();
		d.show();
		TestInterface2.print1();

	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		TestInterface1.super.show();
		TestInterface2.super.show();
	}

}
