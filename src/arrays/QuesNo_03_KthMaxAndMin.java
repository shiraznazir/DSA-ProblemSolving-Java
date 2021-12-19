package arrays;

public class QuesNo_03_KthMaxAndMin {
	static void kthMaxAndMin(int arr[], int k) {
		int n = arr.length;
		for (int i = 0; i < arr.length; i++) {
			int minInd = i;
			for (int j = i + 1; j < arr.length; j++) {
				if(arr[minInd] > arr[j]) {
					minInd = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[minInd];
			arr[minInd] = temp;
		}
		for(int item: arr) {
			System.out.print(item + " ");
		}
		System.out.println();
		System.out.println("Min Value : " + arr[k-1] + "   Max Value : " + arr[n-k]);
	}
	public static void main(String[] args) {
		int arr[] = { 54, 12, 45, 2, 3, 5, 12, 90, 23, 33, 29, 39};
		int k = 2;
		kthMaxAndMin(arr,k);
	}

}
