package Java8.streamMethods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Stream_findAny_findFirst {

public static void main(String[] args) {
		
		//findAny()
		//List<String> stringList = Arrays.asList("one","two","three","one");
		//List<String> stringList = Arrays.asList();

		//Optional<String> ele=stringList.stream().findAny();
		//System.out.println(ele.get());//one  //NoSuchElementException
		
		
		//findFirst()
		//List<String> stringList = Arrays.asList("one","two","three","one");
		List<String> stringList = Arrays.asList();
		
		Optional<String> ele=stringList.stream().findFirst();
		
		System.out.println(ele.get());   //one  //NoSuchElementException
	}

}
