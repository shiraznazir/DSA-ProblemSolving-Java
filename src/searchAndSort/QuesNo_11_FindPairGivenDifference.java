package searchAndSort;
/*Ques No-11 --> Given an unsorted array and a number n, find if there exists a 
 * pair of elements in the array whose difference is n ?  */
public class QuesNo_11_FindPairGivenDifference{

	public static void main(String[] args) {
		int arr[] = {90, 70, 20, 80, 50};
		int k = 45;
		pair(arr, k);
	}
	public static void pair(int arr[], int k) {
		int firstNo = 0;
		int secondNo = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if(arr[j] - arr[i] == k || arr[i] - arr[j] == k) {
					firstNo = arr[i];
					secondNo = arr[j];
				}
			}
		}
		if(firstNo == 0) {
			System.out.println("Not Found");
		} else {
			System.out.println("Pair is --> " + firstNo + " : " + secondNo );
		}
	}

}
