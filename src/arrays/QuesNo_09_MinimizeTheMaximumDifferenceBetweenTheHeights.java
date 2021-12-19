package arrays;
/*QuesNo_09 Minimize the maximum difference between the heights*/

public class QuesNo_09_MinimizeTheMaximumDifferenceBetweenTheHeights {
	static int maxDiff(int arr[],int k) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > k) {
				arr[i] = arr[i]  - k;
			} else if(arr[i] < k) {
				arr[i] = arr[i] + k;
			}
		}
		int maxDiff = arr[0] - arr[1];
		for (int i = 1; i < arr.length -1 ; i++) {
			if((arr[i] - arr[i+1]) > maxDiff) {
				maxDiff = arr[i] - arr[i+1];
			}
		}
		return maxDiff;
	}
	public static void main(String[] args) {
		int arr[] = {1, 5, 15, 10} , k = 3; 
		int res = maxDiff(arr,k);
		System.out.println("The maximum difference is : " + res);
	}

}
