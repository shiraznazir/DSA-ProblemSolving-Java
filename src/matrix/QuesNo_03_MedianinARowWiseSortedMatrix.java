package matrix;

import java.util.Arrays;

/*Ques No-03-->Given a row wise sorted matrix of size RxC where R and C
 *  are always odd, find the median of the matrix.*/
public class QuesNo_03_MedianinARowWiseSortedMatrix {
	public static int median(int mat[][], int n, int m) {
		int [] arr = new int[n*m];
		int k = 0;
 		for(int row = 0; row < n; row++) {
 			for(int col = 0; col < m; col++) {
 				arr[k] = mat[row][col];
 				k++;
 			}
 		}
 		Arrays.sort(arr);
 		System.out.println("After Sorting : ");
 		for(int i: arr) {
 			System.out.print(i + " ");
 		}
 		System.out.println();
 		int mid  = arr.length / 2;
 		
 		int median = arr[mid];
 		
		return median;
	}
	public static void main(String[] args) {
		int matrix[][] = {{1, 3, 5}, 
		                  {2, 6, 9}, 
		                  {3, 6, 9}};
		int row = 3;
		int col = 3;
		
		int ans = median(matrix, row, col);
		System.out.println("Median : " + ans);
	}

}
