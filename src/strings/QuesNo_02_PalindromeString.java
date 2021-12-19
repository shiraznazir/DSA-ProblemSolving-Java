package strings;

import java.util.Arrays;

// Ques No- 02 -->Given a string S, check if it is palindrome or not. ?
public class QuesNo_02_PalindromeString {
	public static boolean palindromeUsingExtraSpace(String s) {
		char[] reverse = new char[s.length()];
		int index = 0;
		for(int i = s.length() -1; i >= 0; i--) {
			reverse[index] = s.charAt(i);
			index++;
		}
		int count = 0;
		for(int j = 0; j< s.length(); j++) {
			if(s.charAt(j) == reverse[j]) {
				System.out.println(reverse[j]);
				count++;
			}
			
		}
		System.out.println("count : " + count);
		System.out.println("length of the string : " + s.length());
		if(count == s.length()) {
			return true;
		}
		return false;
	}
	public static boolean palindrome(String s) {
		int i = 0;
		int j = s.length() -1;
		
		while(i < j) {
			if(s.charAt(i) == s.charAt(j)) {
				i++; j--;
			}
		}
		int check = s.length()/2 ;
		
		if(i == check) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		String str = "ababa";
		boolean result = palindromeUsingExtraSpace(str);
		System.out.println(result);
		System.out.println("-------------------");
		boolean res = palindrome(str);
		System.out.println(res);
	}

}
