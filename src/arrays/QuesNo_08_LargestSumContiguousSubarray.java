package arrays;
/*Ques No 08 Write an efficient program to find the sum of contiguous subarray within a 
 * one-dimensional array of numbers that has the largest sum. */

public class QuesNo_08_LargestSumContiguousSubarray {
	static int largestSum(int arr[]) {
		int currSum = 0;
		int maxSum = 0;
		for (int i = 0; i < arr.length; i++) {
			currSum += arr[i];
			
			if(maxSum < currSum) {
				maxSum = currSum;
			}
			if(currSum < 0) {
				currSum = 0;
			}
		}
		return maxSum;
	}
	public static void main(String[] args) {
		int arr [] = {-2, -3, 4, -1, -2, 1, 5, -3};
		int largest = largestSum(arr);
		System.out.println("The largest sum of subarray : " + largest);
	}

}
