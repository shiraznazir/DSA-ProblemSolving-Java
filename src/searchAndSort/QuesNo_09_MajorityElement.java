package searchAndSort;

import java.util.HashMap;
import java.util.Map;

/*QuesNo-09-->Write a function which takes an array and prints the majority 
 * element (if it exists), otherwise prints “No Majority Element”. A majority 
 * element in an array A[] of size n is an element that appears more than n/2 times (and hence there is at most one such element). */
public class QuesNo_09_MajorityElement {

	public static void main(String[] args) {
		int arr[] = {3, 3, 4, 2, 4, 4, 2, 4, 4};
		Map<Integer, Integer> hash = hashing(arr);
		int maxValue = 0;
		int maxKey = 0;
		for (Map.Entry<Integer, Integer> entry : hash.entrySet()) {
		    if(entry.getValue() > maxValue) {
		    	maxValue = entry.getValue();
		    	maxKey = entry.getKey();
		    }
		   // System.out.println(entry.getKey() + " : " + entry.getValue() );
		}
		System.out.println(maxKey);
	}
	public static HashMap<Integer, Integer> hashing(int arr []) {
		HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
		
			for(int val: arr) {
				if(hash.containsKey(val)) {
					hash.put(val, hash.get(val)+1);
				} else {
					hash.put(val, 1);
				}
			
		}
			return hash;
	}
	public static int majorityElement(int arr[]) {
		int n = arr.length;
		int majIndex = 0;
		int count = 0;
		for (int i = 1; i < n; i++) {
			if(arr[majIndex] == arr[i]) {
				count++;
			}else {
				count--;
			}
			if(count == 0) {
				majIndex = i;
				count = 0;
			}
		}
		return count;
	}
}
