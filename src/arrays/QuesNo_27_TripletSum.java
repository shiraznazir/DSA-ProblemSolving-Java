package arrays;
/*QuesNo--> 27 Find a triplet that sum to a given value */
public class QuesNo_27_TripletSum {
	static boolean tripletSum(int arr[],int sum) {
		boolean isTrue = false;
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				for (int k = j; k < n; k++) {
					if(arr[i] + arr[j] + arr[k] == sum & arr[i] != arr[j] 
							&& arr[j]!= arr[k]) {
						isTrue = true;
						System.out.println("It is the sum of the number ");
					}
				}
			}
		}
		return isTrue;
	}
	public static void main(String[] args) {
		int arr[] = {12, 3, 4, 1, 6, 9};
		int k = 24;
		boolean result = tripletSum(arr,k);
		System.out.println(result);
	}

}
