package searchAndSort;
/*QuesNo_02_Given an array Arr of N positive integers. Your task is to find
 *  the elements whose value is equal to that of its index value ( Consider
 *   1-based indexing ).*/
public class QuesNo_02_ValueEqual2IndexValue {
	public static int valueIndex(int arr[]){
		int x = 1;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == x) {
				return x;
			}
			x++;
		}
		return 0;
	}
	public static void main(String[] args) {
		int arr[] = {15, 43, 45, 12, 7};
		int result = valueIndex(arr);
		if(result == 0) {
			System.out.println("Number is not found.");
		} else {
			System.out.println(result);
		}
	}

}
