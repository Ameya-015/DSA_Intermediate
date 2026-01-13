package intermediate.arrays.combinatorics;

public class SortedRank {
    static int mod = 1000003;
    static int factorial(int A) {
        if(A == 0) {
            return 1;
        }
        return (factorial(A - 1) * A) % mod;
    }


    static int getRank(String A) {
        int rank = 0;
        int n = A.length();

        for(int i = 0; i < n - 1; i++) {
            int count = 0;
            for(int j = i + 1; j < n; j++) {
                if(A.charAt(j) < A.charAt(i)) {
                    count++;
                }
            }
            rank += (count * factorial(n - i - 1)) % mod;
        }

        return (rank + 1) % mod;
    }

    public static void main(String[] args) {
        String A = "cab";
        int rank = getRank(A);
        System.out.println(rank);
    }
}
