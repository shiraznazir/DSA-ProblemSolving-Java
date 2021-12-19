package arrays;
/*QuesNo-08-Write a program to cyclically rotate an array by one. */

public class QuesNo_07_ProgramToCyclicallyRotateAnArrayByOne {
	static int [] rotateByOne(int arr[]) {
		int n = arr.length;
		int ele = arr[n-1];
		for (int i = n-1; i > 0; i--) {
			arr[i] = arr[i-1];
		}
		arr[0] = ele;
		return arr;
	}
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5};
		int ans [] = rotateByOne(arr);
		for(int i: ans) {
			System.out.print(i + " ");
		}
	}

}
