package Java8.streamMethods;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//count() - terminal method - return long
public class Stream_count {

	public static void main(String[] args) {
		ArrayList<Integer> marks = new ArrayList<>();
		marks.add(0);
		marks.add(10);
		marks.add(20);
		marks.add(5);
		marks.add(15);
		marks.add(15);
		System.out.println("Original mark List: " + marks);
		
		long noOfFailedStudents = marks.stream().filter(m -> m < 10).count();
		System.out.println("Failed Students : "+noOfFailedStudents);
		
		//or distinct() count()
		
		long distinctMarks = marks.stream().distinct().count();
		System.out.println("Distinct Count: "+distinctMarks);
		
		 
	}

}
