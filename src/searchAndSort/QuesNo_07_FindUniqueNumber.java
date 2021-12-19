package searchAndSort;
/*Ques No - 07 --> Find the unique number in the array ?*/
public class QuesNo_07_FindUniqueNumber {
	
	public static void main(String[] args) {
		int arr [] = { 1 , 2, 3, 4, 4, 6, 3, 2, 1};
		int result = uniqueNo(arr);
		System.out.println(result);
	}
	public static int uniqueNo(int arr[]) {
		int xor = 0;
		for(int val: arr) {
			xor = xor ^ val;
		}
		return xor;
	}
}
