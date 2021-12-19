package arrays;
import java.util.*;

/*Ques No- 24 Given an array of size n and a number k, 
 * find all elements that appear more than n/k times*/

public class QuesNo_24_CountTheElements {

	// using HashMap
	
	static HashMap<Integer,Integer> hashing(int arr []) {
		HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>();
		for (int i = 0; i < arr.length; i++) {
			hash.put(arr[i], hash.getOrDefault(arr[i], 0) +1);
		}
		for(Map.Entry<Integer,Integer> value: hash.entrySet() ) {
			
			System.out.println(value.getKey() + " : " + value.getValue());
			
		}
		return hash;
	}
	static void bruteForceSoln(int arr[], int k) {
		int n = arr.length;
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			int element = arr[i];
			for (int j = i + 1; j < arr.length; j++) {
				if(element == arr[j]) {
					count++;
					arr[j] = 0;
				}
			}
			if(count > n / k && element != 0) {
				System.out.println(element);
			}
		}
	}
	public static void main(String[] args) {
		int arr [] = { 3, 1, 2, 2, 2, 1, 4, 3, 3};
		int n = arr.length;
		int k = 4;
		
		System.out.println("Using Hashmap Data Structure : ");
		HashMap<Integer,Integer> result = hashing(arr);
		for(Map.Entry<Integer, Integer> value: result.entrySet()) {
			if(value.getValue() > n/k ) {
				System.out.print(value.getKey() + " ");
			}
		}
		System.out.println();
		System.out.println("----------------------------------------");
		
		System.out.println("Brute Force solution :  ");
		bruteForceSoln(arr,k);
	}

}
