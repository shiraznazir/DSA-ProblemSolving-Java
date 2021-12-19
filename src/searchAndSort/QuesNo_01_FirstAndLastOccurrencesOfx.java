package searchAndSort;
/*Ques-No-01 -->Given a sorted array arr containing n elements with possibly
 *  duplicate elements, the task is to find indexes of first and last
 *   occurrences of an element x in the given array ? */
public class QuesNo_01_FirstAndLastOccurrencesOfx {
	public static void firstAndLast(int arr[], int x) {
		int n = arr.length;
		int first = -1;
		int last = -1;
		for (int i = 0; i < n; i++) {
			if(x != arr[i]) {
				continue;
			}
			if(first == -1) {
				first = i;
			}
			last = i;
		}
		if(first != -1) {
			System.out.println("First Occurrence : " + first);
			System.out.println("Last Occurrence : " + last);
		} else {
			System.out.println("Number not found.");
		}
	}
	public static void main(String[] args) {
		int arr[] = { 1, 3, 5, 5, 5, 5, 7, 123, 125 };
		
		firstAndLast(arr,7);
	}

}
