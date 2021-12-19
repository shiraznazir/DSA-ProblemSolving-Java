package arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*Ques No 17 -> Given an array of integers, and a number ‘sum’, find the number of pairs of integers 
 * in the array whose sum is equal to ‘sum’ ? .*/
public class QuesNo_17_CountPairsWithGivenSum {
	static int bruteForce(int arr[], int sum) {
		
		int count = 0;
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = i + 1; j < arr.length; j++) {
				
				if(arr[i] + arr[j] == sum) {
					count++;
				}
			}
		}
		return count;
	}
	static HashMap<Integer, Integer> hashing(int arr[], int sum) {
		int n = arr.length;
		HashMap<Integer,Integer> hash = new HashMap<>();
		
		for (int i = 0; i < n; i++) {
				hash.put(arr[i], hash.getOrDefault(arr[i], 0) + 1);
		}
		int count = 0;
		for (int i = 0; i < n; i++) {
			if(hash.get(sum - arr[i]) != null) {
				count += (hash.get(sum - arr[i]));
			}
			if(sum - arr[i] == arr[i]) {
				count--;
			}
		}
		System.out.println("By using hashMap : " + count / 2);
		System.out.println();
		return hash;
	}
	public static void main(String[] args) {
		int arr[] = { 1, 5, 7, -1, 5};
		int sum = 6;
		int count = bruteForce(arr,sum);
		System.out.println("The count of Pair sum  by brute force : " + count);
		System.out.println();
		
		HashMap<Integer,Integer> hash = hashing(arr,sum);
		
		System.out.println(hash.get(sum - arr[4]));
		
		Set<Map.Entry<Integer,Integer>> val = hash.entrySet();
		for (Map.Entry<Integer, Integer> e: val) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}
		
	}
}
