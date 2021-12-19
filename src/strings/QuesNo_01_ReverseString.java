package strings;
/*Ques No-01-->Write a function that reverses a string. 
 * The input string is given as an array of characters s.*/
public class QuesNo_01_ReverseString {
	public static void reverse(String s) {
		for(int i = s.length() -1; i >= 0; i--) {
			System.out.print(s.charAt(i) + " ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Shiraz Nazir";
		reverse(str);
	}

}
