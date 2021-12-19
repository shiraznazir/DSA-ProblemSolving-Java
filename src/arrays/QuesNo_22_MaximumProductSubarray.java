package arrays;
/*Ques No 22 -> Given an array that contains both positive and negative integers, 
 * find the product of the maximum product subarray
 * */
public class QuesNo_22_MaximumProductSubarray {
	static int maxProSubArray(int arr[]) {
		int maxPro = 1;
		int currPro = arr[0];
		for (int i = 1; i < arr.length; i++) {
			currPro *= arr[i];
			if(maxPro < currPro) {
				maxPro = currPro;
			}
			if(currPro == 0) {
				currPro = 1;
			}
			
		}
		return maxPro;
	}
	public static void main(String[] args) {
	int arr[] = {-1, -3, -10, 0, 60};
	int result = maxProSubArray(arr);
	System.out.println(result);
	}

}
