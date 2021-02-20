package interviews.IHS_Markit;


//Input: arr1[] = { 1, 3, 4, 5}, arr2[] = {2, 4, 6, 8}
//Output: arr3[] = {1, 2, 3, 4, 4, 5, 6, 8}
public class MergeArrays {
	
	public static void mergeArrays(int[] arr1,int[] arr2,int len1,int len2) {
		int[] mergedArr=new int[len1+len2];
		
		int i=0;
		int j=0;
		int k=0;
		
		while(i<len1 && j< len2) {
		if(arr1[i] < arr2[j]) {
			
			mergedArr[k++]=arr1[i++];
			
		}
			else {
			
				mergedArr[k++]=arr2[j++];
			
			}
		
		
		
	
		System.out.println("Array AFtre merge: "+mergedArr.length);
		for(int x=0; x< len1+len2; x++) {
			System.out.println("Array AFtre merge: "+mergedArr[x]);
		}
		
		}	
		
		while(i<len1) {
			mergedArr[k++]=arr2[i++];
			
		}
		
		while(j<len2) {
			mergedArr[k++]=arr2[j++];
			
		}
		
		System.out.println("Array AFtre merge: "+mergedArr.length);
		for(int x=0; x< len1+len2; x++) {
			System.out.println("Array AFtre merge: "+mergedArr[x]);
		}
		
	}

	public static void main(String[] args) {
		
		int[] arr1 = { 1, 3, 4, 5};
		int[] arr2 = {2, 4, 6, 8};
		
		int len1= arr1.length;
		int len2 = arr2.length;
		System.out.println(len1+len2);
		
		//int[] mergedArr=new int[len1+len2];
		
		mergeArrays(arr1,arr2,len1,len2);
		
		
	}

}
