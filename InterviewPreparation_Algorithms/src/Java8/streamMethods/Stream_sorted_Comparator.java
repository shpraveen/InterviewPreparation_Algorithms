package Java8.streamMethods;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_sorted_Comparator {

	public static void main(String[] args) {
		ArrayList<Integer> marks = new ArrayList<>();
		marks.add(0);
		marks.add(10);
		marks.add(20);
		marks.add(5);
		marks.add(35);
		marks.add(15);
		System.out.println("Original mark List: " + marks);
		
		//natural sorting --> comparable
		List<Integer>  sotededMarksNatural = marks.stream().sorted((i1,i2) -> i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println("Sorted Marks Comparable: "+sotededMarksNatural);
		
		//using comparble for desc
		List<Integer>  sotededMarksNaturalDesc = marks.stream().sorted((i1,i2) -> -i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println("Sorted Marks Comparable Desc: "+sotededMarksNaturalDesc);
		//or interchange arg
		
		//Customized sorting --> Comparator
		List<Integer>  sotededMarks = marks.stream().sorted((i1,i2) -> (i1 < i2)?1:(i1 > i2)?-1:0).collect(Collectors.toList());
		System.out.println("Sorted Marks comparator: "+sotededMarks);
	}

}
