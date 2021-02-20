package Java8.streamMethods;

import java.util.stream.Stream;

public class Stream_Stream_of {

	public static void main(String[] args) {
		Stream<Integer> s = Stream.of(9,9999,9999,99,999,100);
		//s.forEachOrdered(System.out::println);
		s.forEach(System.out::println);
		
		Integer[] i = {10,45,89,88,658,975,31};
		Stream.of(i).forEach(System.out::println);
	}

}
