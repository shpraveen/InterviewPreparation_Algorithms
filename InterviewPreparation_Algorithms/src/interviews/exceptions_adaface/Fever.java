package interviews.exceptions_adaface;


class Disease{
	
	{System.out.print("A ");}
	public Disease() {System.out.print("B ");}
}

class Cancer extends Disease{
	
	static { System.out.print("C ");}
	public Cancer() {System.out.print("D ");}
		{ System.out.print("E ");}
	static { System.out.print("F ");}
	
}

class Fever extends Disease {
	public static void main(String[] args) {
		System.out.print("G ");
		new Fever();
		//new Cancer();
		System.out.print("H ");
	}
}

// parent class > child class
// execution : static > simple block > constructor > method

//G B H

// G A B H -- output

// A G B H 

//G C F D E H

//G C F A B E D H 
