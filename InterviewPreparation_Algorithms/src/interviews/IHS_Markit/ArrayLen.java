package interviews.IHS_Markit;

import java.util.ArrayList;

public class ArrayLen {
	
	public static ArrayList<Integer> arrayMethod() {
		
		int[] arr1 = {1, 2, 3} ;
		ArrayList<Integer> al = new ArrayList<>();
		
		int len =arr1.length;
		 int first = arr1[0];
		 int last = arr1[len-1];
		 
		 al.add(first);
		 al.add(last);
		
		 System.out.println(al);
		return al;
		
	}
	
public static  int[] arrayMethod(int[] arr) {
		
		
		
		int len =arr.length;
		 int first = arr[0];
		 int last = arr[len-1];
		
		
		 int[] arr1 = {first,last} ;
		 System.out.println(arr1);
		return arr1;
		
	}

	public static void main(String[] args) {
		
		int[] arr1 = {1, 2, 3} ;
		
		
		arrayMethod();
		int[] arr2 =arrayMethod(arr1);
		  
		

	}

}
