package arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*Ques No 18 -> Given three arrays sorted in non-decreasing order, 
 * print all common elements in these arrays ?*/
public class QuesNo_18_FindCommomElementsInThreeSortedArrays {
	static void bruteForceSol(int arr1[], int arr2[], int arr3[]) {
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				for (int k = 0; k < arr3.length; k++) {
					if(arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
						System.out.println(arr1[i]);
					}
				}
			}
		}
	}
	static void printCommonElements(int arr1[], int arr2 [], int arr3[]){
		int n1 = arr1.length;
		int n2 = arr2.length;
		int n3 = arr3.length;
		
		int i = 0,j = 0, k = 0;
		while(i < n1 && j < n2 && k < n3) {
			if(arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
				System.out.println(arr1[i]);
				i++; j++; k++;
			}
			if(arr1[i] < arr2[j]) {
				i++;
			}
			if(arr2[j] < arr3[k]) {
				j++;
			} else {
				k++;
			}
		}
		
	}
	public static void main(String[] args) {
		int arr1[] = {1, 5, 10, 20, 40, 80}; 
		int arr2[] = {6, 7, 20, 80, 100};
		int arr3[] = {3, 4, 15, 20, 30, 70, 80, 120};
		
		System.out.println("The common elements using brute force : ");
		bruteForceSol(arr1,arr2,arr3);
		
		System.out.println("The common elements using optimized method : ");
		printCommonElements(arr1, arr2, arr3);
	}

}
