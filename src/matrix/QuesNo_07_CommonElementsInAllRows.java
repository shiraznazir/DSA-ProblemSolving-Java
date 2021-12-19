package matrix;

import java.util.*;

/* Ques No- 07 --> Given an m x n matrix, find all common elements present 
 * in all rows in O(m n) time and one traversal of matrix ? */
public class QuesNo_07_CommonElementsInAllRows {
	public static void printCommonElements(int mat[][]) {
			Set<Integer> set = new HashSet<Integer>();
			int n = mat.length;
			for(int k = 0; k < mat[0].length; k++) {
				int count = 1;
			for(int row = 1; row < n; row++) {
				for(int col = 0; col < mat[row].length; col++) {
					if(mat[0][k] == mat[row][col]) {
						count++;
						break;
					}
				}
		   }
			
			if(count == n) {
				set.add(mat[0][k]);
			}
		}
		for(int items: set) {
			System.out.println(items);
		}
	}
	public static void usingHashMap(int mat[][]) {
		HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>();
		int n = mat.length;
//		System.out.println(n);
		int m = mat[0].length;
		for(int i = 0; i < m; i++) 
			hash.put(mat[0][i], 1);
		for(int row = 1; row < n; row++) {
			for(int col = 0; col < m; col++) {
				if(hash.get(mat[row][col]) != null && hash.get(mat[row][col]) == row) {
					hash.put(mat[row][col], row+1);	
					if(row == n-1) {
						System.out.print(mat[row][col] + " ");
					}
				}
			}
   	}
		System.out.println();
}
	public static void main(String[] args) {
	int matrix[][] = { {1, 2, 1, 4, 8},
					   {3, 7, 8, 5, 1},
					   {8, 7, 7, 3, 1},
					   {8, 1, 2, 7, 9},
	            };
	
		printCommonElements(matrix);
		System.out.println("----------------------------");
		usingHashMap(matrix);
	}

}
