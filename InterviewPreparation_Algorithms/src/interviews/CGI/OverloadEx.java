package interviews.CGI;

class OverloadEx {

	public void m1(String s1) {
		
	}
	
}

class Child_OverloadEx extends OverloadEx{
public void m1(String s2) {
		
	}

public static void main(String[] args) {
	
	OverloadEx  Overloa = new Child_OverloadEx();
	
	//OverloadEx  Overloa = ()new Child_OverloadEx();
	//Overloa.m1(10);
	Overloa.m1("10");
}
	
}
