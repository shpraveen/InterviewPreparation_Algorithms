package Java8.streamMethods;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_sorted_Comparator_String {

	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<>();
		l.add("Kajal");
		l.add("Anushka");
		l.add("Sam");
		l.add("Victor");
		l.add("Crum");
		l.add("Ron");
		System.out.println("Original mark List: " + l);
		
		//natural sorting --> comparable
		List<String>  sotededMarksNatural = l.stream().sorted((s1,s2) -> s1.compareTo(s2)).collect(Collectors.toList());
		System.out.println("Sorted Marks Comparable: "+sotededMarksNatural);
		
		//using comparble for desc
		List<String>  sotededMarksNaturalDesc = l.stream().sorted((s1,s2) -> s2.compareTo(s1)).collect(Collectors.toList());
		System.out.println("Sorted Marks Comparable Desc: "+sotededMarksNaturalDesc);
		//or interchange arg
		
		//Customized sorting --> Comparator
//		List<String>  sotededMarks = l.stream().sorted((i1,i2) -> (i1 < i2)?1:(i1 > i2)?-1:0).collect(Collectors.toList());
//		System.out.println("Sorted Marks comparator: "+sotededMarks);
	}

}
