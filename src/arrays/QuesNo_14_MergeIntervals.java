package arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

/*Ques No 14 -> Given an array of intervals where intervals[i] = [starti, endi],
 *  merge all overlapping intervals, and return an array of the non-overlapping
 *   intervals that cover all the intervals in the input.*/
public class QuesNo_14_MergeIntervals {
	static int[][] removeOverLapingintervals(int arr[][]){
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				if((arr[row][col] > arr[row + 1][col - 1]) && col == 1){
					backArray(arr,row,col);
				}
			}
		}
		return arr;
	}
	static void backArray(int arr[][], int i, int j) {
		for (int row = 0; row < arr.length-1; row++) {
			for (int col = 0; col < arr[row].length-1; col++) {
				arr[row][col] = arr[row+1][col]; 
			}
		}
	}
	static void mergeIntervals(Intervals arr[]) {
		if(arr.length < 0) {
			return;
		}
		Stack<Intervals> stack = new Stack<>();
		
		Arrays.sort(arr,new Comparator<Intervals>(){
            public int compare(Intervals i1,Intervals i2)
            {
                return i1.start-i2.start;
            }
        });
		stack.push(arr[0]);
		for (int i = 1; i < arr.length; i++) {
			Intervals top = stack.peek();
			if(top.end < arr[i].start) {
				stack.push(arr[i]);
			} else if(top.end < arr[i].end) {
				top.end = arr[i].end;
				stack.pop();
				stack.push(top);
			}
		}
		while(!stack.isEmpty()) {
			Intervals t = stack.pop();
			System.out.println(" [ " + t.start +  " , " + t.end + "  ] ");
		}
	}
	public static void main(String[] args) {
		Intervals arr[] = new Intervals[4];
		
		arr[0]=new Intervals(1,3);
        arr[1]=new Intervals(2,6);
        arr[2]=new Intervals(8,10);
        arr[3]=new Intervals(15,18);
        
        mergeIntervals(arr);

	}

}
class Intervals{
	int start;
	int end;
	
	Intervals(int start, int end){
		this.start = start;
		this.end = end;
	}
}
