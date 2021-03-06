package Java8.streamMethods;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_map {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(0);
		al.add(10);
		al.add(20);
		al.add(5);
		al.add(15);
		al.add(15);
		System.out.println("Original List: " + al);

		List<Integer> l1 = new ArrayList<>();
		for (Integer I1 : al) {
			l1.add(I1*2);
		}
		System.out.println("Imperative List: "+l1);
		
		List<Integer> l2 = al.stream().map(I3 -> I3 * 2).collect(Collectors.toList());
		System.out.println("Declarative List: "+l2);
		l2.forEach(System.out::println);
	}

}
