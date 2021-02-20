package Test;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSortInteger {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(8);
		al.add(15);
		al.add(26);
		al.add(48);
		al.add(4);
		al.add(6);
		al.add(51);
		al.add(1);
		
		System.out.println("Before Sorting");
		for(int i : al) {
			System.out.println(i);
		}

		Collections.sort(al);
		
		System.out.println("\nAfter Sorting");
		for(int i : al) {
			System.out.println(i);
		}
	}

}
