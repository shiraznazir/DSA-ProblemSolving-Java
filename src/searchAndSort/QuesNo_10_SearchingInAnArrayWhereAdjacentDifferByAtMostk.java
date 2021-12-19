package searchAndSort;
/*Ques-No-10 --> Searching in an array where adjacent differ by at most k ?*/
public class QuesNo_10_SearchingInAnArrayWhereAdjacentDifferByAtMostk {

	public static void main(String[] args) {
		int arr[] = {20, 40, 50, 70, 70, 60};
		int k = 20;
		int x = 60;
		int result = searching(arr, k, x);
		if(result == -1) {
			System.out.println("Not Found.");
		} else {
			System.out.println(result);
		}
	}
	public static int searching(int arr[],int k, int x) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == x) {
				return i;
			}
		}
		return -1;
	}
}
