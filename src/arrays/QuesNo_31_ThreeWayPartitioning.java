package arrays;
/*Ques No--> 31 Given an array and a range [lowVal, highVal], partition 
 * the array around the range such that array is divided in three parts. */
public class QuesNo_31_ThreeWayPartitioning {
	static int[] arrangement(int arr[], int lowVal, int highVal) {
		int n = arr.length;
		int start = 0;
		int end = n-1;
		for(int i = 0; i <= end;) {
			if(arr[i] < lowVal ) {
				swap(arr,start,i);
				start++;
				i++;
			} else if(arr[i] > highVal) {
				swap(arr,i,end);
				end--;
			} else {
				i++;
			}
			
		}
		return arr;
	}
	static void swap(int arr[], int i, int j) {
		
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
	}
	public static void main(String[] args) {
		int arr[] = {1, 14, 5, 20, 4, 2, 54, 20, 87, 98, 3, 1, 32};
		int lowVal = 14;
		int highVal = 20;
		int result[] = arrangement(arr,lowVal, highVal);
		for(int i : result) {
			System.out.print(i + " ");
		}
	}

}
