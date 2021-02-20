package Java8.streamMethods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream_concatenation {
	
public static void main(String[] args) {
		
		List<String> animalsList=Arrays.asList("Dog","Cat","Elephant");
		List<String> birdsList=Arrays.asList("peackock","parrot","Crow");
		
		
		Stream <String>stream1=animalsList.stream();
		Stream <String>stream2=birdsList.stream();
		
		List<String> finallist=Stream.concat(stream1, stream2).collect(Collectors.toList());
		
		finallist.forEach(System.out::println);
		
		//or
		finallist.forEach(value -> System.out.println("After conactenation: "+value));
		
//		for(String item:finallist)
//		{
//			System.out.println(item);
//		}
	}

}
