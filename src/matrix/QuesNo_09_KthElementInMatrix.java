package matrix;

import java.util.Arrays;

/*Ques-No-09 --> Given a N x N matrix, where every row and column is sorted
 *  in non-decreasing order. Find the kth smallest element in the matrix ?*/
public class QuesNo_09_KthElementInMatrix {
	public static int kthElements(int mat[][], int k) {
		int n = mat.length;
		int m = mat[0].length;
		int arr[] = new int[n*m];
		
		int l = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m ; j++) {
				arr[l++] = mat[i][j]; 
			}
		}
		
		Arrays.sort(arr);
		for(int items: arr) {
			System.out.print(items + " ");
		}
		System.out.println();
		return arr[k-1];
	}
	public static void main(String[] args) {
		int mat[][] =     {{10, 20, 30, 40},
        				   {15, 25, 35, 45},
        				   {24, 29, 37, 48},
        				   {32, 33, 39, 50}};
		
		int result = kthElements(mat,7);
		System.out.println(result);
	}

}
