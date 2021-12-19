package arrays;
/*Ques No 13 -> Given an array arr of N integers. Find the contiguous sub-array(containing 
 * at least one number) which has the maximum sum and return its sum.
*/
public class QuesNo_13_KadanesAlgorithm {
	static int maxSum(int arr[]) {
		int n = arr.length;
		int currSum = 0;
		int maxSum = 0;
		for (int i = 0; i < n; i++) {
			currSum += arr[i];
			if(currSum > maxSum) {
				maxSum = currSum;
			}
			if(currSum < 0) {
				currSum = 0;
			}
		}
		return maxSum;
	}
	public static void main(String[] args) {
		int arr[] = {1,2,3,-2,5};
		int maxSum = maxSum(arr);
		System.out.println("The maximum sum in the array is : " + maxSum);
	}

}
