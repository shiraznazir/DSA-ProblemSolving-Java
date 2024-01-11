package Recursion;

public class CheckSorted {
    public static boolean checkSorted(int arr[], int n) {
        if (n <= 0) {
            return true;
        }
        return arr[n] < arr[n - 1] ? false : checkSorted(arr, n - 1);
    }

    public static void main(String[] args) {
        int arr[] = { 10, 2, 3, 4, 5 };
        boolean result = checkSorted(arr, arr.length - 1);
        System.out.println("Answer " + result);
    }
}
