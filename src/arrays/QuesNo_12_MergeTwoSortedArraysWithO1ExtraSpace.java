package arrays;
/*QuesNo-12 ->We are given two sorted arrays. 
 * We need to merge these two arrays such that the initial numbers (after complete sorting) 
 * are in the first array and the remaining numbers are in the second array. 
 * Extra space allowed in O(1).*/
public class QuesNo_12_MergeTwoSortedArraysWithO1ExtraSpace {
	static int [] mergeUsingSpace(int arr1[], int arr2[]) {
		
		int n1 = arr1.length;
		int n2 = arr2.length;
		int n = n1 + n2;
		
		int arr[] = new int[n];
		int j = 0, k = 0;
		for (int i = 0; i < n; i++) {
			
			if(arr1[j] < arr1[k]) {
				
				arr[i] = arr1[j];
				i++;j++;
				
			} else if(arr1[j] > arr2[k]) {
				
				arr[i] = arr2[k];
				i++;k++;
				
			} else if(n1 > n2){
				
				arr[i] = arr1[j];
				i++;j++;
			
			} else {
				
				arr[i] = arr2[k];
				i++;k++;
			}
		}
		return arr;
	}
	static void merge(int arr1[], int arr2[]) {
		int i = 0;
		int j = 0;
		while(i < arr1.length && j < arr2.length) {
			if(arr1[i] < arr2[j]) {
				i++;
			} else if(arr1[i] > arr2[j] && i > j) {
				j++;
			} else {
				int temp = arr1[i];
				arr1[i] = arr2[j];
				arr2[j] = temp;
				i++;
			}
		}
		for(int item: arr1) {
			System.out.print(item + " ");
		}
		System.out.println();
		for(int ele: arr2) {
			System.out.print(ele + " ");
		}
	}
	public static void main(String[] args) {
		int arr1[] = {1, 5, 9, 10, 15, 20};
	    int arr2[] = {2, 3, 8, 13};
	    int [] res = mergeUsingSpace(arr1,arr2);
	    System.out.println("Using Extra space : ");
	    for(int i: res) {
	    	System.out.print(i + " ");
	    }
	    System.out.println();
	    System.out.println("Using constant space : ");
	    merge(arr1,arr2);
	}

}
