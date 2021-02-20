package interviews.CGI.segregate0s1sOfArray;

public class Segregate0s1sOfArrayTwoPass {

    public static void segregate0and1(int arr[], int n){
        int count = 0; // counts the no of zeros in arr

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0)
                count++;
        }

        // loop fills the arr with 0 until count
        for (int i = 0; i < count; i++)
            arr[i] = 0;

        // loop fills remaining arr space with 1
        for (int i = count; i < n; i++)
            arr[i] = 1;

    }
    public static void print(int arr[], int n){

        System.out.print("Array after segregation is ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

    }
    public static void main(String[] args) {
        int arr[] = new int[]{ 0, 1, 0, 1, 1, 1 };
        int n = arr.length;

        segregate0and1(arr, n);
        print(arr, n);
    }
}


//int left = 0, right = size - 1; 
//
//while (left < right)  
//{ 
//    /* Increment left index while we see 0 at left */
//    while (arr[left] == 0 && left < right) 
//       left++; 
//
//    /* Decrement right index while we see 1 at right */
//    while (arr[right] == 1 && left < right) 
//        right--; 
//
//    /* If left is smaller than right then there is a 1 at left 
//       and a 0 at right.  Exchange arr[left] and arr[right]*/
//    if (left < right)  
//    { 
//        arr[left] = 0; 
//        arr[right] = 1; 
//        left++; 
//        right--; 
//    } 
//} 