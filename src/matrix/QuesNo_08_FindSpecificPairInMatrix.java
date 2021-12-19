package matrix;
/* QuesNo-08 -->Given an n x n matrix mat[n][n] of integers, find the
 *  maximum value of mat(c, d) – mat(a, b) over all choices of indexes
 *   such that both c > a and d > b.*/
public class QuesNo_08_FindSpecificPairInMatrix {
	
	public static int maxDifference(int mat[][]) {
		int maxdiff = 0;
		int n = mat.length;
		int currDiff = 0;
		
		for(int row = 0; row < n -1; row++) {
			
			for(int col = 0; col < mat[row].length -1; col++) {
				currDiff = mat[row + 1][col + 1] - mat[row][col];
				if(maxdiff < currDiff) {
					maxdiff = currDiff;
				}
		
			}
		}

		return maxdiff;
	}
	public static void main(String[] args) {
	int	matrix[][] = {{ 1, 2, -1, -4, -20 },
	             { -8, -3, 4, 2, 1 }, 
	             { 3, 8, 6, 1, 3 },
	             { -4, -1, 1, 7, -6 },
	             { 0, -4, 10, -5, 1 }};
	
	int result = maxDifference(matrix);
	System.out.println(result);
	
	}

}
