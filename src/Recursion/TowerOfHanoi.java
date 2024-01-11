package Recursion;

import java.util.Scanner;

/**
 * TowerOfHanoi
 */
public class TowerOfHanoi {
    public static int solve(int n, char from, char to, char aux, int count) {
        if (n == 0) {
            return 0;
        }
        solve(n - 1, from, aux, to, count);
        System.out.println("From " + from + " to " + to);
        solve(n - 1, aux, to, from, count);
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter the number of disks ");
        int n = scanner.nextInt();
        int count = solve(n, 'A', 'C', 'B', 0);
        System.out.println("Count : " + count);
        scanner.close();
    }
}