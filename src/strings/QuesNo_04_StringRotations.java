package strings;
/*Ques No-05 --> Given a string s1 and a string s2, write a snippet to say whether s2 is a 
 * rotation of s1? (eg given s1 = ABCD and s2 = CDAB, return true, given s1 = ABCD, and s2 
 * = ACBD , return false)*/
public class QuesNo_04_StringRotations {
	public static boolean checkRotational(String str1, String str2) {
		
		String temp = str1.concat(str1) ;
	
		int n = temp.length();
		int m = str2.length();
		
		for(int i = 0; i <= n-m; i++) {
			for(int j = 0; j < m; j++) {
				if(temp.charAt(i + j) != str2.charAt(j)) {
					break;
				}
				
				if(j == m -1) {
					return true;
				}
			}
		}
				
		return false;
	}
	public static void main(String[] args) {
		String str1 = "ABCD";
		String str2 = "DACB";
		
		boolean res = checkRotational(str1, str2);
		System.out.println(res);
		
	}

}
