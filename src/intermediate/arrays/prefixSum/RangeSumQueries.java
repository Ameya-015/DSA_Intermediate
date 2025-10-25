package intermediate.arrays.prefixSum;

import java.util.ArrayList;
import java.util.List;

public class RangeSumQueries {

    public static long[] rangeSum(int A[], int B[][]) {
        long opList[] = new long[B.length];

        int n = A.length;
        long prefixSum[] = new long[n];
        prefixSum[0] = (long)A[0];

        for(int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + (long)A[i];
        }

        int bSize = B.length;
        for(int i = 0; i < bSize; i++) {
            int l = B[i][0];
            int r = B[i][1];
            if(l > 0) {
                long sum = prefixSum[r] - prefixSum[l - 1];
                opList[i] = sum;
            }
            else {
                long sum = prefixSum[r];
                opList[i] = sum;
            }
        }
        return opList;
    }

    public static void main(String[] args) {
        int A[] = {7,3,1,5,5,5,1,2,4,5};
        int B[][] = {{6,9}, {2,9}, {2,4}, {0,9}};
        long opArr[] = rangeSum(A,B);

        for(int i = 0; i < opArr.length; i++) {
            System.out.print(opArr[i] + " ");
        }
    }
}
