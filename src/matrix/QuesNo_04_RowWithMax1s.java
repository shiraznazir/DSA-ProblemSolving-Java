package matrix;
/*QuesNo-04 --> Find the row with maximum number of 1s ? */
public class QuesNo_04_RowWithMax1s {
	public static int maxCount(int mat[][], int n, int m) {
		int ans = 0;
		int maxCoun = 0;
		for(int row = 0; row < n; row++) {
			int count = 0;
			for(int col = 0; col < m; col++) {
				if(mat[row][col] == 1) {
					count++;
				}
			}
			if(count > maxCoun) {
				maxCoun = count;
				ans = row;
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		int matrix [][] = { {0, 0, 1, 1},
		                   	{0, 0, 1, 1},
		                   	{1, 1, 0, 1},
		                   	{1, 1, 1, 1} };
		
		int n = 4;
		int m = 4;
		
		int row = maxCount( matrix, n, m);
		
		System.out.println(row);
	}

}
