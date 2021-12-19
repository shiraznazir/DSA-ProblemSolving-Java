package arrays;
import java.util.*;
/*
 * Ques No - > 20 Given an array of positive and negative numbers, 
 * find if there is a subarray (of size at-least one) with 0 sum.
 * */
public class QuesNo_20_RearrangeArrayInAlternatingPositiveNegativeItems {
	static boolean bruteForce(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			int sum = arr[i];
			for (int j = i + 1; j < n; j++) {
				sum += arr[j];
				if(sum == 0) {
					return true;
				}
				
			}
		}
		return false;
	}
	static boolean optimisedMethod(int arr[]) {
		int n = arr.length;
		Set<Integer> set = new HashSet<>();
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += arr[i];
			if(arr[i] == 0 || sum == 0 || set.contains(sum)) {
				return true;
			}
			set.add(sum);
		}
		return false;
	}
	public static void main(String[] args) {
	int arr[] = {1, 2, 3, -4, -1, 4};
	boolean res = bruteForce(arr);
	System.out.println("Brute force solution: ");
	System.out.println(res);
	System.out.println("Optimised Method : ");
	boolean ans = optimisedMethod(arr);
	System.out.println(ans);
	
	}
}
