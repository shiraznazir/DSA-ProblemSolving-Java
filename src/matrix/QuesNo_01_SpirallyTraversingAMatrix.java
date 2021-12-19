package matrix;
/* Ques No -01 -->      Print a given matrix in spiral form ?     */
public class QuesNo_01_SpirallyTraversingAMatrix {
	public static void printMatrix(int mat[][]) {
		int n = mat.length;
		int m = mat[0].length;
//		System.out.println(m);
		for(int row = 0; row < n; row++) {
			for(int col = row; col < m - row; col++) {
			//	System.out.println(row + " : " + col);
				System.out.println(mat[row][col]);
				if(col == (m - row)-1) {
					for(int row2 = row +1; row2 < n - row; row2++) {
						System.out.println(mat[row2][col]);
						if(row2 == col) {
							for(int col2 = row2 -1; col2 >= row; col2--) {
								System.out.println(mat[row2][col2]);
//								System.out.println("row2 : " + row2 + "  col2 : " + row2);
//								System.out.println();
//								System.out.println("row : " + row + " col : " + col);
								if(row2 == col && col2 == row) {
									for(int row3 = col -1; row3 >= row + 1; row3--) {
									//	System.out.println("******");
										System.out.println(mat[row3][row]);
									//	System.out.println(row3 +  " : "  +row);
									}
								}
							}
						}
					}
					
				}
			}
		}
	}
	public static void main(String[] args) {
		int matrix[][] = {{1, 2, 3, 4},
		           {5, 6, 7, 8},
		           {9, 10, 11, 12},
		           {13, 14, 15,16}} ;
		printMatrix(matrix);
	}

}
