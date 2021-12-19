package arrays;

public class QuesNo_30_SmallestSubarrayWithSumGreaterThanX {
	
	static int smallSubArray(int arr[], int k) {
		
		int n = arr.length;
		
		int count = 0;
		int key = 0;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			count++;
			if(sum < 0) {
				sum = 0;
			}
			
			if(sum >= k) {
				sum = sum - arr[key];
				count = count -1;
				key++;
			}
			
			if(sum > k) {
				if((sum - k) > arr[key]) {
					sum = sum - arr[key];
					count = count -1;
				}
				break;
			} else if(i == n-1) {
				return 0;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		int arr[] = {- 8, 1, 4, 2, -6};
		int x = 5;
		int ans = smallSubArray(arr,x);
		if(ans == 0) {
			System.out.println("Not Possible");
		} else {
			System.out.println(ans);
		}
	}

}
