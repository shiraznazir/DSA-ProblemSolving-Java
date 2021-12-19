package arrays;

import java.util.Arrays;

/*Ques No-29 --> Given an array of n integers where each
 *  value represents the number of 
 *  chocolates in a packet. Each packet can have
 *  a variable number of chocolates. There are m students,
 *  the task is to distribute chocolate packets such that: */

public class QuesNo_29_ChocolateDistributionProblem {
	static int choDistributionPro(int arr[], int m) {
		Arrays.sort(arr);
		int min_diff = Integer.MAX_VALUE ; 
		for (int i = 0; i < arr.length - m; i++) {
			if((arr[i + m - 1] - arr[i]) < min_diff) {
				min_diff = (arr[i + m - 1] - arr[i]);
			}
		}
		return min_diff;
	}
	public static void main(String[] args) {
		int arr[] = {7, 3, 2, 4, 9, 12, 56} ;
		int m = 3;
		int result = choDistributionPro(arr,m);
		System.out.println("The min diff : " + result);
	}

}
