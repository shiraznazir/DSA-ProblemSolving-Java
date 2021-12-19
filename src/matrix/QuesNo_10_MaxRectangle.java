package matrix;
/*QuesNo-10 --> Given a binary matrix M of size n X m. 
 * Find the maximum area of a rectangle formed only of 1s in the given matrix ?*/
public class QuesNo_10_MaxRectangle {
	public static int maxArea(int mat [][]) {
		int maxSize = 0;
		int currSize = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if(mat[i][j] == 1) {
					currSize++;
				}
				if(currSize > maxSize && mat[i][j] == 0) {
					maxSize = currSize;
				}
				if(mat[i][j] == 0) {
					currSize = 0;
				}
			}
		}
		return maxSize;
	}
	public static void main(String[] args) {
		int mat[][] = { {0, 1, 1, 0},
		         	    {1, 1, 1, 1},
		         	    {1, 1, 1, 1},
		         	    {1, 1, 0, 0}};
		int maxSize = maxArea(mat);
		System.out.println(maxSize);
	}

}
