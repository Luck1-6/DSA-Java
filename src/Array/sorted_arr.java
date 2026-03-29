package Array;

public class sorted_arr {
	
	public static boolean isSorted(int[] arr, int n) {
        // Base cases: an array with 0 or 1 element is considered sorted
        if (n <= 1) {
            return true;
        }
        // Check if the last two elements are in sorted order
        if (arr[n - 2] > arr[n - 1]) {
            return false;
        }
        // Recursively check the remaining part of the array
        return isSorted(arr, n - 1);
    }

    public static void main(String[] args)
    {
        int arr[] = { 20, 23, 23, 45, 78, 88 };
        int n = arr.length;

        if (isSorted(arr,n ))
            System.out.print("Yes");
        else
            System.out.print("No");
    }

}
