package Recursion;

import java.util.ArrayList;

public class GenerateSunstrings {

    public static void generate(int ind, String str, int n, String ans, ArrayList<String> result) {
        if (ind >= n) {
            result.add(ans);
            return;
        }
        generate(ind + 1, str, n, ans + str.charAt(ind), result);
        generate(ind + 1, str, n, ans, result);
    }

    public static void main(String[] args) {
        String str = "abcd";
        ArrayList<String> result = new ArrayList<>();
        generate(0, str, str.length(), "", result);
        System.out.println("Generated Strings: " + result);
    }
}
