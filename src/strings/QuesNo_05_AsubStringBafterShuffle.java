package strings;

import java.util.Arrays;

/*Ques No-05 -->Check if the given string is shuffled substring of another string ?*/
public class QuesNo_05_AsubStringBafterShuffle {
	public static boolean shuffle(String str1, String str2) {
		int n = str1.length();
		int m = str2.length();
		
		if(n > m) {
			return false;
		} else {
			char ch1[] = str1.toCharArray();
			Arrays.sort(ch1);
			String s1 = ch1.toString();
			char ch2[] = str2.toCharArray();
			Arrays.sort(ch2);
			String s2 = ch2.toString();
			for(int i = 0; i < s1.length(); i++) {
				System.out.print(s1.charAt(i) + " ");
			}
			System.out.println();
			for(int i = 0; i < s2.length(); i++) {
				System.out.print(s2.charAt(i) + " ");
			}
			System.out.println();
			for(int i = 0; i < s1.length(); i++) {
				if(s1.charAt(i) != s2.charAt(i)) {
					return false;
				}
				if(i == s1.length() -1) {
					return true;
				}
			}
		}
		return false;
	}
	public static void main(String[] args) {
		String str1 = new String("onetwofour") ;
		String str2 = new String("hellofourtwooneworld") ;
		
		boolean result = shuffle(str1, str2);
		System.out.println(result);
	}

}
