package intermediate.arrays.prime;

import java.util.Arrays;
import java.util.HashSet;

public class PrimeSum {

    public static void main(String[] args) {
//        int A = 16777214;
        int A = 10;
        boolean sieve[] = new boolean[A + 1];
        Arrays.fill(sieve, true);

        for(int i = 2; i <= A; i++) {
            if(sieve[i] == true) {
                for(int j = 2 * i; j <= A; j = j + i) {
                    sieve[j] = false;
                }
            }
        }
        int op[] = new int[2];

        for(int i = 2; i <= A; i++) {
            if(sieve[i] == true && sieve[A - i] == true && i + (A - i) == A) {
                op[0] = Math.min(i, A - i);
                op[1] = Math.max(A - i, i);
            }
        }

        System.out.println(op[0]);
        System.out.println(op[1]);
    }
}
