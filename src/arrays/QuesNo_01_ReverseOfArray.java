package arrays;
//     Ques-No-01_Reverse of a array ? 
public class QuesNo_01_ReverseOfArray {
	
	static void printReverse(int arr[]) {
		for (int i = arr.length -1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5};
		printReverse(arr);
	}

}
