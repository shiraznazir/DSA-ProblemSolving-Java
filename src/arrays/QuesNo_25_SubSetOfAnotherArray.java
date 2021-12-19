package arrays;
import java.util.*;
/*Ques No--> 25 Find whether an array is subset of another array*/
public class QuesNo_25_SubSetOfAnotherArray {
	
	// Brute Force Solution :
	static boolean arrASubsetarrB(int arr1[], int arr2[]) {
		int count = 0;
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				if(arr2[i] == arr1[j]) {
					count++;
					break;
				}
			}
		}
		return count == arr2.length ? true : false; 
	}
	// Using a HashSet
	static void usingHashSet(int arr1[], int arr2 []) {
		HashSet<Integer> hash = new HashSet<Integer>();
		
		for (int i = 0; i < arr1.length; i++) {
			hash.add(arr1[i]);
		}
		int p = hash.size();
		for (int i = 0; i < arr2.length; i++) {
			hash.add(arr2[i]);
		}
		if(p == hash.size()) {
			System.out.println("arr2 is the subset of the arr1");
		}else {
			System.out.println("It is not the subset");
		}
	}
	public static void main(String[] args) {
		int arr1 [] = {11, 1, 13, 21, 3, 7};
		int arr2 [] = {11, 3, 7, 13};
		System.out.println("Using Brute Force Solution : ");
		boolean result = arrASubsetarrB(arr1,arr2);
		System.out.println(result);
		
		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println("Using a HashSet dataStructure : ");
		
		usingHashSet(arr1, arr2);
	}

}
