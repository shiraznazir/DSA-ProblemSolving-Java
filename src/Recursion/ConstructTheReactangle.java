package Recursion;

public class ConstructTheReactangle {
    static int result[] = new int[2];

    public static void findRectangle(int ind, int n) {
        if (ind >= n) {
            result[0] = n;
            result[1] = 1;
            return;
        }
        if (n % ind == 0) {
            result[0] = ind;
            result[1] = n / ind;
        }
        findRectangle(ind + 1, n);
    }

    public static void main(String[] args) {
        findRectangle(2, 122122);
        System.out.println("Result");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
