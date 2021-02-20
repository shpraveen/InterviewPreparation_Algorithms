package SecondLargestEl;

import java.util.Arrays;

public class ArraySecondLargest {

	public static void main(String[] args) {
		//int arrayElemnts[] = {};
		int[] arr = { 1, 4, 6, 7, 85, 65, 2, 0 };
		int length = arr.length;
		int num= printSecondLargest(arr,length);
		System.out.println(" number: "+ num);

	}
	
	public static int printSecondLargest(int arr[], int length) {
		
		//int i;
		//Arrays.sort(a);
		int largest= Integer.MIN_VALUE;
		int secondLargest=Integer.MIN_VALUE;
		for (int i: arr) {
			if(i > largest) {
				secondLargest=largest;
				largest=i;
			}
			else if(i > secondLargest) {
				secondLargest=i;
			}
		}
		
		return secondLargest;
	}

}
