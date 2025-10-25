package intermediate.arrays.prefixSum;

import java.util.ArrayList;
import java.util.List;

public class EquilibriumIndex {

    public static int equilibriumIndex(ArrayList<Integer> A) {
        int n = A.size();
        int prefixSum[] = new int[n];
        prefixSum[0] = A.get(0);

        for(int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + A.get(i);
        }

        int equilibriumIdx = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++) {
            int leftSum = 0, rightSum = 0;
            if(i == 0) {
                leftSum = 0;
                rightSum = prefixSum[n - 1] - prefixSum[i];
            }
            else if(i == n - 1) {
                leftSum = prefixSum[i - 1];
                rightSum = 0;
            }
            else {
                leftSum = prefixSum[i - 1];
                rightSum = prefixSum[n - 1] - prefixSum[i];
            }
            if(leftSum == rightSum) {
                equilibriumIdx = Math.min(i, equilibriumIdx);
            }
        }
        if(equilibriumIdx != Integer.MAX_VALUE) {
            return equilibriumIdx;
        }
        return -1;
    }

    public static void main(String[] args) {
        List<Integer> a = List.of(-7, 1, 5, 2, -4, 3, 0);
        ArrayList<Integer> A = new ArrayList<>(a);
        System.out.println(equilibriumIndex(A));
    }
}
