package Recursion;

public class matrix {
    public static void usingloops(int arr[][], int n) {
        System.out.println("Using Loops");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void mix(int arr[][], int n, int row) {
        if (row > n - 1) {
            return;
        }
        for (int col = 0; col < arr[row].length; col++) {
            System.out.print(arr[row][col] + " ");
        }
        System.out.println("");
        mix(arr, n, row + 1);
    }

    public static void traverse(int arr[][], int n, int row, int col) {
        if (col > arr[row].length - 1) {
            row++;
            col = 0;
            System.out.println("");
            if (row > n - 1) {
                return;
            }
        }
        System.out.print(arr[row][col] + " ");
        col++;
        traverse(arr, n, row, col);
    }

    public static void main(String[] args) {
        int arr[][] = { { 0, 0, 1, 0 }, { 1, 0, 1, 1 }, { 0, 1, 1, 0 }, { 1, 1, 0, 1 }, { 1, 0, 1, 0 } };
        usingloops(arr, arr.length);
        System.out.println("Using both recursion and loop");
        mix(arr, arr.length, 0);
        System.out.println("Using recursion only");
        traverse(arr, arr.length, 0, 0);
    }
}
