package arrays;
/*
 * Ques No -> 22 Factorial of a non-negative integer, 
 * is the multiplication of all integers smaller than or equal to n.
 * */
public class QuesNo_21_FactorialOfaLargeNumber {
	static long factorial(int n) {
		if(n == 1) {
			return 1;
		}
		return n * factorial(n-1);
	}
	public static void main(String[] args) {
		
		System.out.println(factorial(50));
	}

}
