package interviews.exceptions_adaface;


class BasicSample{}

class ComplexSample {
	
	BasicSample createSample() {
		BasicSample bs = new BasicSample(); // line 4
		return bs;							// line 5
	}
	
	public static void main(String[] args) {
		ComplexSample cs = new ComplexSample(); //8
		BasicSample bs = cs.createSample(); 	//9
		System.out.println(bs);
		bs = new BasicSample();				//11
		System.out.println("End");			//line 12
	}

}


// After which line bs object is creted -- line 4

// eligible for garbage collection -- ? no eligible for garbage collection