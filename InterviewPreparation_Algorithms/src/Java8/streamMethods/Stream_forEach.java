package Java8.streamMethods;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Stream_forEach {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(0);
		al.add(10);
		al.add(20);
		al.add(5);
		al.add(15);
		al.add(15);
		// System.out.println("Original List: " + al);

		al.stream().forEach(System.out::println);

		// or
		Consumer<Integer> c = i -> {
			System.out.println("The Square of " + i + " is " + (i * i));
		};

		al.stream().forEach(c);

		// or

		al.stream().forEach(i -> {
			System.out.println("The Square of " + i + " is " + (i * i));
		});

	}

}
