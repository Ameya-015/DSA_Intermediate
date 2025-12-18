package intermediate.arrays.hashing;

import java.util.HashSet;

public class SubArrayZeroSum {

    public static int subArrayWithZero(int A[]) {
        int n = A.length;
        int pf[] = new int[n];
        pf[0] = A[0];

        for(int i = 1; i < n; i++) {
            pf[i] = pf[i - 1] + A[i];
        }

        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0; i < n; i++) {
            if(pf[i] == 0) {
                return 1;
            }
            hs.add(pf[i]);
        }
        if(hs.size() < n) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        int A[] = {-1, 1};
        System.out.println(subArrayWithZero(A));
    }
}
