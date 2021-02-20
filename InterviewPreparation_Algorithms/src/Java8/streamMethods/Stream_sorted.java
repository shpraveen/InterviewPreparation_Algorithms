package Java8.streamMethods;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_sorted {

	public static void main(String[] args) {
		ArrayList<Integer> marks = new ArrayList<>();
		marks.add(0);
		marks.add(10);
		marks.add(20);
		marks.add(5);
		marks.add(35);
		marks.add(15);
		System.out.println("Original mark List: " + marks);
		
		List<Integer>  sotededMarks = marks.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorted Marks : "+sotededMarks);
	}

}
