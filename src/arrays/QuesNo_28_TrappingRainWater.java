package arrays;
/*Ques No --> 28 Given n non-negative integers representing an elevation map
 *  where the width of each bar is 1, compute how much water it is able to 
 *  trap after raining.
*/
public class QuesNo_28_TrappingRainWater {
	static int trapping(int arr[]) {
		int sum = 0;
		int n = arr.length;
		int left [] = new int[n];
		int right [] = new int[n];
		left[0] = arr[0];
		for (int i = 1; i < n; i++) {
			left[i] = Math.max(left[i-1],arr[i]);
		}
		right[n-1] = arr[n-1];
		for (int i = n-2; i >= 0; i--) {
			right[i] = Math.max(right[i+1], arr[i]);
		}
		for (int i = 0; i < n; i++) {
			sum += (Math.min(right[i], left[i])) - arr[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		int arr[] = { 3, 1 ,2 ,4 , 0, 1, 3, 2};
		int result = trapping(arr);
		System.out.println();
		System.out.println("Trapping of rain water : " + result);
	}

}
