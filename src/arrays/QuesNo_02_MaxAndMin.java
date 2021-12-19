package arrays;

public class QuesNo_02_MaxAndMin {
	/*Ques-No-02-Find the maximum and minimum element in an array*/
	static void maxAndMin(int arr[]) {
		int minVal = arr[0];
		int maxVal = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(minVal > arr[i]) {
				minVal = arr[i];
			}
			if(maxVal < arr[i]) {
				maxVal = arr[i];
			}
		}
		System.out.println("Min Value : " + minVal + "      Max Value : " + maxVal);
	}
	public static void main(String[] args) {
		int arr[] = { 5, 10, 29, 1, 28, 10, 34, 18};
		maxAndMin(arr);
	}

}
