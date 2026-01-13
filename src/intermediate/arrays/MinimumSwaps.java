package intermediate.arrays;

import java.util.ArrayList;
import java.util.List;

public class MinimumSwaps {

    public static int minSwaps(ArrayList<Integer> A, int B) {
        int n = A.size();
        int x = 0;

        for(int i = 0; i < n; i++) {
            if(A.get(i) <= B) {
                x++;
            }
        }

        int minSwaps = Integer.MAX_VALUE;
        for(int i = 0; i <= n - x; i++) {
            int tempSwap = 0;
            for(int j = i; j < x + i; j++) {
                if(A.get(j) > B) {
                    tempSwap++;
                }
            }
            minSwaps = Math.min(tempSwap, minSwaps);
        }
        return minSwaps;
    }


    public static void main(String[] args) {
        List<Integer> a = List.of(1, 12, 10, 3, 14, 10, 5);
        ArrayList<Integer> A = new ArrayList<>(a);
        int B = 8;
        System.out.println(minSwaps(A, B));
    }
}
