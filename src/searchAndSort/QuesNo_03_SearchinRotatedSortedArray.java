package searchAndSort;
/*Ques-No-03 -->Search an element in a sorted and rotated array ?*/
public class QuesNo_03_SearchinRotatedSortedArray {
	public static int searching(int arr[], int target) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == target) {
				return i;
			}
		}
		return -1;
	}
	public static int binarySearch(int arr[], int key) {
		int low = 0;
		int high = arr.length;
		
		while(low <= high) {
			int mid = (low + high) / 2;
			if(arr[mid] == key) {
				return mid;
			}
			if(arr[low] < arr[mid]) {
				if(key >= arr[low] && key < arr[mid]) {
					high = mid - 1;
				} else {
					low = mid + 1; 
				}
			} else {
				if(key > arr[mid] && key <= arr[high]) {
					low = mid + 1;
				} else {
					high = mid - 1; 
				}
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[] = {30, 40, 50, 10, 20};
		int target = 10;
	//	int result = searching(arr,target);
		int result = binarySearch(arr,target);
		if(result == -1) {
			System.out.println("Number not found");
		} else {
			System.out.println(result);
		}
	}

}
