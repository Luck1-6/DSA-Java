package Recursion; //Java Recursive approach to check if an //Array is sorted or not 

class sorted_array { 
    // Function that returns true if array is // sorted in non-decreasing order. 
	 public static boolean Sorted_array(int a[], int n)
	 {
	       // base case
	     if (n == 1 || n == 0)
	         return true;

	     return a[n - 1] >= a[n - 2] && Sorted_array(a, n - 1);
	 }
 // Driver code
public static void main(String[] args) {
    int arr[] = { 20, 23, 23, 15, 78, 88 };
    int n = arr.length;
    
      // Function Call
    if (Sorted_array(arr, n))
        System.out.print("Yes");
    else
        System.out.print("No");
}
}

