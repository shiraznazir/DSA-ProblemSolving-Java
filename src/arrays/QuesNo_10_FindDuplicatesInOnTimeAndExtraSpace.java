package arrays;

import java.util.HashMap;
import java.util.List;

/*Ques No 10 :- Given an array of n elements that contains elements from 0 to n-1, 
 * with any of these numbers appearing any number of times. 
 * Find these repeating numbers in O(n) and using only constant memory space.*/
public class QuesNo_10_FindDuplicatesInOnTimeAndExtraSpace {
	static HashMap<Integer, Integer> repeatingElementsUsingHashMap(int arr[]) {
		
		HashMap<Integer,Integer> list = new HashMap<Integer,Integer>();
		
		for (int i = 0; i < arr.length; i++) {
				list.put(arr[i], list.getOrDefault(arr[i], 0) + 1);
		}
		return list;
	}
	static void repeatingElements1(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			arr[arr[i] / n] += n;
		}
		for (int i = 0; i < n; i++) {
			if((arr[i]/n) >= 2) {
				System.out.print(i + " ");
			}
		}
	}
	static void repeatingElements2(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			int j = Math.abs(arr[i]);
			if(arr[j] > 0) {
				arr[j] = - arr[j];
			} else {
				System.out.print(j + " ");
			}
		}
	}
	public static void main(String[] args) {
		int arr [] = {1, 2, 3, 6, 3, 6, 1};
		
//		HashMap<Integer,Integer> list = repeatingElementsUsingHashMap(arr);
//		
//		list.entrySet().forEach(entry -> {
//		    if(list.containsValue(2)) {
//		    	if(entry.getValue() > 1) {
//		    		System.out.print(entry.getKey() + " ");
//		    	}
//		    }
//		});
		System.out.println();
		repeatingElements2(arr);
	}

}
