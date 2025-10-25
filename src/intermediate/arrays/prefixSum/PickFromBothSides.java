package intermediate.arrays.prefixSum;

import java.util.ArrayList;
import java.util.List;

public class PickFromBothSides {

    public static int maxSum(ArrayList<Integer> A, int B) {
        int n = A.size();

        int prefixSum[] = new int[n];
        int suffixSum[] = new int[n];

        prefixSum[0] = A.get(0);
        suffixSum[n - 1] = A.get(n - 1);

        for(int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + A.get(i);
        }

        for(int i = n - 2; i >= 0; i--) {
            suffixSum[i] = suffixSum[i + 1] + A.get(i);
        }

        int maxSum = Math.max(prefixSum[B - 1], suffixSum[n - B]);

        for(int i = 1; i < B; i++) {
            int sum = prefixSum[i - 1] + suffixSum[n - (B - i)];
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        List<Integer> a = List.of(2, 3, -1, 4, 2, 1);
        ArrayList<Integer> A = new ArrayList<>(a);
        int B = 4;
        System.out.println(maxSum(A, B));
    }
}
