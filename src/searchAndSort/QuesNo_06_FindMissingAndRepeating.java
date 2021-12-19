package searchAndSort;
/*Ques No-06 --> Given an unsorted array Arr of size N of positive integers.
 *  One number 'A' from set {1, 2, …N} is missing and one number 'B' occurs 
 *  twice in array. Find these two numbers.
*/
public class QuesNo_06_FindMissingAndRepeating {
	public static void main(String[] args) {
		int arr[] = {4, 3, 6, 2, 1, 1};
		missingAndRepeating(arr);
	}
	public static void missingAndRepeating(int arr[]) {
		int xor = 0;
		for (int i = 0; i < arr.length; i++) {
			xor ^= arr[i];
		}
		
		for(int i = 1; i <= arr.length; i++) {
			xor ^= i;
		}
		int rsbm = xor & -xor;
		
		int x = 0;
		int y = 0;
		for(int val: arr) {
			if((val & rsbm) == 0) {
				x = x ^ val;
			} else {
				y = y ^ val;
			}
		}
		for (int i = 1; i <= arr.length; i++) {
			if((i & rsbm) == 0) {
				x = x ^ i;
			} else {
				y = y ^ i;
			}
		} 
		for(int val: arr) {
			if(val == x) {
				System.out.println("Repeating number is : " + x);
				System.out.println("Misssing number is : " + y);
				break;
			} else if(val == y) {
				System.out.println("Repeating number is : " + y);
				System.out.println("Missing number is : " + x);
				break;
			}
		}
	}
}
