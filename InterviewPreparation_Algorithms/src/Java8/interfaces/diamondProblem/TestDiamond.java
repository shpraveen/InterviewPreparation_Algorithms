package Java8.interfaces.diamondProblem;

public class TestDiamond implements A,B{

	public static void main(String[] args) {
		
		TestDiamond t = new TestDiamond();
		t.test();

	}

	@Override
	public void test() {
		B.super.test();
		//A.super.test();
	}

}
