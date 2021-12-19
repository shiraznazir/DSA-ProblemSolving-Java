package matrix;
/*Ques No 06 --> Given a square matrix, turn it by 90 degrees in a 
 * clockwise direction without using any extra space. ?*/
public class QuesNo_06_RotateAMatrixBy90Degree {
	public static void rotateClockwise(int mat[][]) {
		int n = mat.length;
		int m = mat[0].length;
		for(int col = 0; col < m; col++) {
			for(int row = n -1; row >= 0; row--){
				System.out.print(mat[row][col] + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int matrix[][] = {{ 1, 2, 3},
				          { 4, 5, 6},
				          { 7, 8, 9}};
		
		rotateClockwise(matrix);
		
	}

}
