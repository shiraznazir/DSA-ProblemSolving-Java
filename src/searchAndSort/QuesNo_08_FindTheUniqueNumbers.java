package searchAndSort;

public class QuesNo_08_FindTheUniqueNumbers {
	
	public static void main(String[] args) {
		int arr [] = { 1 , 2, 3, 4, 4, 6, 3, 2, 1, 7};
		uniqueNos(arr);
	}
	public static void uniqueNos(int arr[]) {
		int xor = 0;
		for(int val: arr) {
			xor = xor ^ val;
		}
		int rsbm = xor & -xor;
		
		int x = 0;
		int y = 0;
		for(int val: arr) {
			if((val & rsbm) == 0) {
				x = x ^ val;
			} else {
				y = y ^ val;
			}
		}
		System.out.println("The first number is : " + x);
		System.out.println("The second number is : " + y);
	}
}
