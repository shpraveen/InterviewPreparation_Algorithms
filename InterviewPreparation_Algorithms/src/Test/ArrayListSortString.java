package Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListSortString {
	
	List<String> listofcountries = null;
	
	public static void main(String[] args) {
		ArrayListSortString s = new ArrayListSortString();
		s.listofcountries= new ArrayList<String>();
		s.listofcountries.add("India");
		s.listofcountries.add("Burma");
		s.listofcountries.add("Bhutan");
		s.listofcountries.add("Malaysia");
		s.listofcountries.add("Japan");
		
		System.out.println("Before Sorting");
		for(String counter:s.listofcountries) {
			System.out.println(counter);
		}
		
		Collections.sort(s.listofcountries);
		

		System.out.println("\nAfter Sorting");
		for(String counter:s.listofcountries) {
			System.out.println(counter);
		}
		
	}

}
