package arrays;
/*QuesNo 15 -> Inversion Count for an array indicates – how far (or close) the array is from
 *  being sorted. If the array is already sorted, then the inversion count is 0, but if the array
 *  is sorted in the reverse order, the inversion count is the maximum. 
    Formally speaking, two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j */
public class QuesNo_15_CountInversionsInAnArray {
	static int countInversion(int arr[]) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if(arr[i] > arr[j] && i < j) {
					count++;
				}
			}
		}
		return count;
	}
	public static void main(String[] args) {
		int arr[] = {8, 4, 2, 1};
		int result = countInversion(arr);
		System.out.println(result);
	}

}
