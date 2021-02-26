package interviews.EY.MorganStanley;

public class Static_Inheritance extends Animal{
	static String a="Cat";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(a);// what will print
		System.out.println(Static_Inheritance.a);// what will print
		System.out.println(Animal.a);// what will print

		Static_Inheritance.a="Animal";
		System.out.println(Static_Inheritance.a);// what will print
		
	}

}

class Animal{
	
	static String a="Animal";
	
}

//class Cat extends Animal{
//	
//	
//	
//	
//	
//}
