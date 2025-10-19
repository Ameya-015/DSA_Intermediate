package intermediate.arrays;

import java.util.ArrayList;

public class GoodPair {
    public int solve(ArrayList<Integer> A, int B) {
        int n = A.size();
        for(int i = 0; i < n - 1; i++) {
            for(int j = i + 1; j < n; j++) {
                if(A.get(i) + A.get(j) == B) {
                    return 1;
                }
            }
        }
        return 0;
    }
}
