package matrix;

import java.util.Arrays;

/*Ques No-05-->Print all elements in sorted order from row and 
 * column wise sorted matrix ? */
public class QuesNo_05_SortedMatrix {
	public static void printSortedMatrix(int mat[][]) {
		int k = 0;
		int n = mat.length;
		int m = mat[0].length;
		int arr[] = new int[n*m];
		
		for(int row = 0; row < n; row++) {
			for(int col = 0; col < m; col++) {
				arr[k] = mat[row][col];
				k++;
			}
		}
		Arrays.sort(arr);
		for(int items: arr) {
			System.out.print(items + " ");
		}
		
	}
	public static void main(String[] args) {
	int	matrix[][]  =  { {10, 20, 30, 40},
					  {15, 25, 35, 45},
					  {27, 29, 37, 48},
					  {32, 33, 39, 50},
              		};
		printSortedMatrix(matrix);
	}

}
