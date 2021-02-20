package SecondLargestEl;


import java.util.ArrayList;
// even i+1, odd as it is
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArraySecondLargest2 {

	public static void main(String[] args) {
		//int arrayElemnts[] = {};
		Integer[] arr = { 1, 4, 6, 7, 85, 65, 2, 0 };
		
		List<Integer> alraw = new ArrayList<>(Arrays.asList(arr));
		List<Integer> al = alraw.stream().filter(num -> num%2==0).collect(Collectors.toList());
		
	}

}
