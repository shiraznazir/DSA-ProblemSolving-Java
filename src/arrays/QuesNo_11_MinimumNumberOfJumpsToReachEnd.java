package arrays;
/*Ques No -> 10 Given an array of integers where each element represents the max number of steps
 * that can be made forward from that element.
 * Write a function to return the minimum number of jumps 
 * to reach the end of the array (starting from the first element). 
 * If an element is 0, they cannot move through that element. 
 * If the end isn’t reachable, return -1.*/
public class QuesNo_11_MinimumNumberOfJumpsToReachEnd {
	static int jumps(int arr[]) {
		int n = arr.length;
		if(n <= 0) {
			return -1;
		}
		int count = 0;
		int nextStep = 0;
		for (int i = 0; i < n; i = arr[nextStep]) {
			count++;
		}
		return count;
	}
	public static void main(String[] args) {
		int arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
		int steps = jumps(arr);
		System.out.println("Total Steps : " + steps);
	}

}
