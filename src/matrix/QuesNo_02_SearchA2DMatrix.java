package matrix;
/*Ques No 02--> Write an efficient algorithm that searches for a 
 * value in an m x n matrix. This matrix has the following properties:
 * Integers in each row are sorted from left to right.
 * The first integer of each row is greater than the last integer of the previous row.*/
public class QuesNo_02_SearchA2DMatrix {
	public static boolean linearSearch(int mat[][], int target) {
		int n = mat.length;
		int m =  mat[0].length;
		for(int row = 0; row < n; row++) {
			for(int col = 0; col < m; col++) {
				if((mat[row][col]) == target) {
					return true;
				}
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int matrix[][] = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
		int target = 11;
		boolean result = linearSearch(matrix, target);
		System.out.println(result);
	}

}
