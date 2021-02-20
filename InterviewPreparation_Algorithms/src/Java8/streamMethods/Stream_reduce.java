package Java8.streamMethods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Stream_reduce {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("A", "B", "C", "1", "2", "3");

		Optional<String> reduced = list.stream().reduce((value, combinedValue) -> {
			return value + combinedValue;

		});
		System.out.println("Reduced: "+reduced.get());
	}

}
