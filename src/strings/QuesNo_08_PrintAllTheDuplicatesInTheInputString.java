package strings;

import java.util.HashMap;

public class QuesNo_08_PrintAllTheDuplicatesInTheInputString {

	public static void main(String[] args) {
		

	}
	public static HashMap<String, Integer> duplicates(String s){
		
		HashMap<String, Integer> hash = new HashMap<String, Integer>();
		
		for (int i = 0; i < s.length(); i++) {
			if(hash.containsKey(s.charAt(i))) {
		//		hash.put(s.charAt(i), hash.containsValue(s.charAt(i))+1);
			}
		}
	}

}
