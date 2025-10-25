package intermediate.arrays;

import java.util.ArrayList;

public class LittlePonnyandMaxElement {
    public int solve(ArrayList<Integer> A, int B) {
        int n = A.size();
        boolean isPresent = false;

        for(int i = 0; i < n; i++) {
            if(A.get(i) == B) {
                isPresent = true;
                break;
            }
        }

        int minOps = 0;
        if(isPresent) {
            for(int i = 0; i < n; i++) {
                if(B < A.get(i)) {
                    minOps++;
                }
            }
        }
        if(minOps > 0) {
            return minOps;
        }
        else {
            return -1;
        }
    }
}
