package arrays;
/*Ques No 19 -> Given an array of positive and negative numbers, arrange them in an 
 * alternate fashion such that every positive number is followed by negative and 
 * vice-versa maintaining the order of appearance.*/
public class QuesNo_19_RearrangeArrayInAlternatingPositiveNegativeItems {
	static int [] reArrange(int arr[]) {
		int pos [] = new int[6];
		int neg [] = new int[6];
		int po = 0;
		int ne = 0;
		for (int i = 0; i < neg.length; i++) {
			if(arr[i] > 0) {
				pos[po++] = arr[i]; 
			} else {
				neg[ne++] = arr[i];
			}
		}
		System.out.println("Positive elements : ");
		for(int it: pos) {
			System.out.print(it +" ");
		}
		System.out.println();
		System.out.println("negative Elements : ");
		for(int ite: neg) {
			System.out.print(ite + " ");
		}
		int p = 0;
		int n = 0;
		for (int j = 0; j < arr.length; j++) {
			if(j % 2 == 0) {
				arr[j] = neg[n++];
			} else {
				arr[j] = pos[p++];
			}
		}
		return arr;
	}
	static int[] optimisedMethod(int arr[]) {
		int n = arr.length;
		int i = -1;
		for (int j = 0; j < arr.length; j++) {
			if(arr[j] < 0) {
				i++;
				swap(arr,i,j);
			}
		}
		int pos = i + 1;
		int neg = 1;
		while(pos < n && neg < pos && arr[neg] < 0) {
			swap(arr,pos,neg);
			pos++;
			neg += 2;
		}
		return arr;
	}
	static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, -4, -1, 4};
		
		int res[] = reArrange(arr); 
		System.out.println();
		System.out.println("Rearrange Elements : ");
		for(int i: res) {
			System.out.print(i + " ");
		}
		
		int[] ans = optimisedMethod(arr);
		System.out.println();
		System.out.println("Second Method : ");
		for(int j: ans) {
			System.out.print(j + " ");
		}
	}

}
