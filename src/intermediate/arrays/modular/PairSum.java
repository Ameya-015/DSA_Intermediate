package intermediate.arrays.modular;

import java.util.ArrayList;
import java.util.List;

public class PairSum {

    static int numberOfPairs(ArrayList<Integer> A, int B) {
        int pairs = 0;
        int n = A.size();
        int mod = 1000000007;
        int freq[] = new int[B];

        for(int i = 0; i < n; i++) {
            int rem = A.get(i) % B;
            freq[rem] = (freq[rem] + 1) % mod;
//            (freq[A.get(i) % B]++;
        }

        int a = freq[0];
        pairs = (pairs + ((a * (a - 1))/2) % mod) % mod;

        if(B % 2 == 0) {
            int b = freq[B / 2];
            pairs = (pairs + ((b * (b - 1))/2) % mod) % mod;
        }

        int i = 1, j = B - 1;
        while(i < j) {
            pairs = (pairs + (freq[i] * freq[j]) % mod) % mod;
            i++;
            j--;
        }

        return pairs;
    }


    public static void main(String[] args) {
        List<Integer> a = List.of(5,17,100,11);
        ArrayList<Integer> A = new ArrayList<>(a);
        int B = 28;
        System.out.println(numberOfPairs(A, B));
    }
}
