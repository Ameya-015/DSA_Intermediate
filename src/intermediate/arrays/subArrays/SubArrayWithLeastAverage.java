package intermediate.arrays.subArrays;

import java.util.ArrayList;
import java.util.List;

public class SubArrayWithLeastAverage {

    public static int leastAverageIndex(ArrayList<Integer> A, int B) {
        int minIdx = -1;
        int n = A.size();
        int minSum = Integer.MAX_VALUE;

        for(int i = 0; i <= n - B; i++) {
            int sum = 0;
            for(int j = i; j < B + i; j++) {
                sum += A.get(j);
            }
            if(sum < minSum) {
                minSum = sum;
                minIdx = i;
            }
        }
        return minIdx;
    }

    public static void main(String[] args) {
//        List<Integer> a = List.of(3, 7, 90, 20, 10, 50, 40);
        List<Integer> a = List.of(3, 7, 5, 20, -10, 0, 12);
        int B = 2;
        ArrayList<Integer> A = new ArrayList<>(a);
        System.out.println(leastAverageIndex(A, B));
    }
}
