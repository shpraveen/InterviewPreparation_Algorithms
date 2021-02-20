package Java8.streamMethods;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_sorted_increasing_length_order {

	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<>();
		l.add("Kajal Aggarwal");
		l.add("Anushka Sharma");
		l.add("Sam Gavis");
		l.add("Victor Olali");
		l.add("Crum Josh");
		l.add("Ron Wesley");
		System.out.println("Original mark List: " + l);
		
		Comparator<String> c= (s1,s2) -> {
			int l1 = s1.length();
			int l2 = s2.length();
			if(l1<l2) return -1;
			else if(l1>l2) return +1;
			else return s1.compareTo(s2);
		};
		//or
//		 

		
		//natural sorting --> comparable
		List<String>  sotededMarksNatural = l.stream().sorted(c).collect(Collectors.toList());
		System.out.println("Sorted Marks Comparable: "+sotededMarksNatural);
		
	}

}
