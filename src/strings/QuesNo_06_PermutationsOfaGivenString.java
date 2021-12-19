package strings;
/*Ques-No-06- Given a string S. The task is to print all permutations of a given string ?*/
public class QuesNo_06_PermutationsOfaGivenString {
	public static void permute(String s, int l, int r) {
		if(l == r) {
		//	System.out.println(l + " : " + r);
			System.out.println("String : " + s);
			System.out.println("-------------------");
		} else {
			for (int i = l; i <= r; i++) {			
				s = swap(s,l,i);
				System.out.println("Step : 1");
				System.out.println(l + " : " + i);
				System.out.println("Step : 2 Initial.");
				permute(s, l + 1, r);
				System.out.println("Step : 2 Final");
			}
		}
	}
	public static String swap(String s, int l, int i) {
		char ch[] = s.toCharArray();
		char temp = ch[l];
		ch[l] = ch[i];
		ch[i] = temp;
		return String.valueOf(ch);
		
	}
	public static void main(String[] args) {
		
		String s = "ABC";
		permute(s, 0, s.length() - 1);
	}

}
