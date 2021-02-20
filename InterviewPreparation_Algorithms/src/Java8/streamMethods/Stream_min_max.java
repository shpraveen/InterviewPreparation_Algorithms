package Java8.streamMethods;

import java.util.ArrayList;
import java.util.Optional;

public class Stream_min_max {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(0);
		al.add(10);
		al.add(20);
		al.add(5);
		al.add(15);
		al.add(15);
		System.out.println("Original List: " + al);
		
		Integer min = al.stream().min((i1,i2) -> i1.compareTo(i2)).get();
		System.out.println("min List: "+min);
		
		Integer max = al.stream().min((i1,i2) -> -i1.compareTo(i2)).get();
		System.out.println("max List: "+max);
		
		//or 
		Optional<Integer> min1 =  al.stream().min((i1,i2) -> i1.compareTo(i2));
		System.out.println("Optional get() min: "+min1.get());
		
		//or
		
		Integer get = al.stream().min((i1,i2) -> i1.compareTo(i2)).get();
		 System.out.println("get min: "+get);
		 
		 
		 //max
		 Optional<Integer> max1 =  al.stream().max((i1,i2) -> i1.compareTo(i2));
			System.out.println("Optional get() max: "+max1.get());
		 
	}

}
