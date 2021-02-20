package Java8.streamMethods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// distinct() limit()
//count()
public class Stream_distinct {
	
	public static void main(String[] args) {
		
		List<String> vehicleList = Arrays.asList("car","byke","cycle","bus","car","bus","car","suv","car");
		
		//distinct()
		List<String> distinctVehicleList = vehicleList.stream().distinct().collect(Collectors.toList());
		System.out.println("distinctVehicleList: "+distinctVehicleList);
		
		//forEach() -- takes consumer : no need to store in a new collection
		vehicleList.stream().distinct().forEach(value -> System.out.println("forEach() : "+value));
						
		
	}

}
