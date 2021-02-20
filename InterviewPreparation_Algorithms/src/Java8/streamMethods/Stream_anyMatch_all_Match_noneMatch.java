package Java8.streamMethods;

import java.util.HashSet;
import java.util.Set;

public class Stream_anyMatch_all_Match_noneMatch {

public static void main(String[] args) {
		
		Set<String> fruites=new HashSet<String>();
		
		fruites.add("One apple");
		fruites.add("One mango");
		fruites.add("Two apples");
		fruites.add("More grapes");
		fruites.add("Two guavas");
		
		//anyMatch()
		boolean result=fruites.stream().anyMatch(value-> {return value.startsWith("One");});
		System.out.println(result);//true
		
		
		//allMatch()
		result=fruites.stream().allMatch(value-> {return value.startsWith("One");});
		System.out.println(result);//false
		
		//noneMatch()
		result=fruites.stream().noneMatch(value-> {return value.startsWith("One");});
		System.out.println(result);//false
		
	}

}
