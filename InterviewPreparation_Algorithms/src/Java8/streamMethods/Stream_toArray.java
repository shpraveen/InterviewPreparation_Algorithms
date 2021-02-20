package Java8.streamMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream_toArray {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(0);
		al.add(10);
		al.add(20);
		al.add(5);
		al.add(15);
		al.add(15);
		// System.out.println("Original List: " + al);
		
		Integer[] i = al.stream().toArray(Integer[]::new); // constructor reference
		
//		for(Integer i1:i) {
//			System.out.println("Array Element: "+i1);
//		}
		//or
		Stream.of(i).forEach(System.out::println);
		
		//or
		List<String> list = Arrays.asList("A", "B", "C", "1", "2", "3");
		Object[] arr = list.stream().toArray();
		System.out.println("Arr: "+Arrays.toString(arr));

	}

}
