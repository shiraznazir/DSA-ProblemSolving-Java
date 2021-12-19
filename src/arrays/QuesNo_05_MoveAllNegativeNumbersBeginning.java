package arrays;
/*Ques-No-05-Move all negative numbers to beginning and positive to end with constant extra space*/
public class QuesNo_05_MoveAllNegativeNumbersBeginning {
	static int [] moveElements(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] >= 0) {
				for (int j = i+1; j < arr.length; j++) {
					if(arr[j] < 0) {
						swap(arr,i,j);
						break;
					}
				}
			}
		}
		return arr;
	}
	static int [] partationProcess(int arr[]) {
		int low = 0;
		int high = arr.length - 1;
		while(low <= high) {
			if(arr[low] < 0) low++;
			if(arr[high] >= 0) high--;
			swap(arr,low,high);
		}
		return arr;
	}
	static int [] reArrange(int arr[]) {
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] < 0) {
				if(i != j) {
					swap(arr,i,j);
				}
				j++;
			}
		}
		return arr;
	}
	static int [] gfg(int arr[]) {
		int left = 0;
		int right = arr.length - 1;
		while(left <= right) {
			if(arr[left] < 0 && arr[right] < 0) {
				left++;
			} else if(arr[left] > 0 && arr[right] < 0) {
				swap(arr,left,right);
				left++;
				right--;
			} else if(arr[left] > 0 && arr[right] > 0) {
				right--;
			} else {
				left++;
				right--;
			}
		}
		return arr;
	}
	static int[] swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return arr;
	}
	public static void main(String[] args) {
		int arr[] = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
	//	int arr[] = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
		int ans [] = gfg(arr);
		for(int i: ans) {
			System.out.print(i + " ");
		}
	}

}
