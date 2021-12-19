package searchAndSort;

public class QuesNo_12_FindAllFourSumNumbers {

	public static void main(String[] args) {
		int arr[] = { 0, 0, 2, 1, 1};
		int k = 3;
		sum(arr, k);
	}
	public static void sum(int arr[], int k) {
		int n = arr.length;
		int i = 0, j = 1, m = 3, l = 4;
		
		while(i < n && j < n && m < n && l  < n ) {
			if(arr[i] + arr[j] + arr[m] + arr[l] == k) {
				System.out.println("The Numbers are : ");
				System.out.println(arr[i] + " : " + arr[j] + " : " + arr[m] + " : " + arr[l]);
				break;
			}
		}
	}

}
