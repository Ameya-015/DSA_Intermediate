package intermediate.arrays;

import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        // Splitting the line by whitespace
        String ipArr[] = input.split(" ");
        // Fetching the size of the Array
        int n = Integer.valueOf(ipArr[0]);

        int A[] = new int[ipArr.length - 1];

        for(int i = 1; i < ipArr.length; i++) {
            A[i - 1] = Integer.valueOf(ipArr[i]);
        }

        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

        for(int i = 0; i < A.length; i++) {
            if(A[i] > max) {
                max = A[i];
            }
        }

        for(int i = 0; i < A.length; i++) {
            if(A[i] < min) {
                min = A[i];
            }
        }

        System.out.print(max + " " + min);

    }
}
