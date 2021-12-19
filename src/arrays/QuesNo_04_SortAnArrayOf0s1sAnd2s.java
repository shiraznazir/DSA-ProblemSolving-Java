package arrays;
/* Ques-No-04-Given an array which consists of only 0, 1 and 2. 
 * Sort the array without using any sorting algo
 */
public class QuesNo_04_SortAnArrayOf0s1sAnd2s {
	static int [] sorting(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				if(arr[i] > arr[j] && arr[i] != arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
	static int [] sort012(int arr[]) {
		int n = arr.length;
		int low = 0;
		int high = n - 1;
		int mid = 0;
		int temp;
		
		while(mid<=high) {
		switch(arr[mid]) {
		case 0:{
			temp = arr[low];
			arr[low] = arr[mid];
			arr[mid] = temp;
			low++;
			mid++;
			break;
		}
		case 1:{
			mid++;
			break;
		}
		case 2:{
			temp = arr[high];
			arr[high] = arr[mid];
			arr[mid] = temp;
			high--;
			break;
		  }
		}
	}
		return arr;
}
	public static void main(String... s) {
		int arr[] = { 1, 2, 0, 1, 1, 0, 1, 2, 2, 1, 0};
		int res[] = sort012(arr);
		for(int i :res) {
			System.out.print(i + " ");
		}
	}
}
