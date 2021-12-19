package strings;

import java.util.*;

// Ques No- 03-->  Print all the duplicates in the input string ? 
public class QuesNo_03_PrintDuplicates {
//	 public static void printDuplicates(String s) {
//		HashMap<Integer, Integer> hashing = new HashMap<Integer, Integer>();
//		
//		for(int i = 0; i< s.length(); i++)  {
//				hashing.put((int)s.charAt(i), hashing.getOrDefault((int)s.charAt(i), 0)+1);
//		}
//		for(Map.Entry<Integer, Integer> ans: hashing.entrySet()) {
//			System.out.println("Key : " + ans.getKey().toString() + " : " + " Value : " + ans.getValue());
//		}
//		for(Map.Entry<Integer, Integer> ans: hashing.entrySet()) {
//			if(hashing.containsValue(ans.getValue()) > 1) {
//				
//			}
//		}
//	}
	public static void printDup(String str) {
		int n = str.length();
		boolean[] isVisited = new boolean[n];

		for (int i = 0; i < n - 1; i++) {
			int count = 0;
			char element = str.charAt(i);
			for (int j = i + 1; j < n; j++) {
				if (element == str.charAt(j) && (isVisited[j] == false)) {
					System.out.print(j + " ");
					isVisited[j] = true;
					count++;
				}
				if (j == n - 1 && count > 1) {
					System.out.println(element);
				}

			}
			System.out.println();
		}
		for (int k = 0; k < n; k++) {
			System.out.println(isVisited[k]);
		}
	}

	public static void main(String[] args) {
		String str = "ansansaaal";
		// printDuplicates(str);
		printDup(str);
	}
}
