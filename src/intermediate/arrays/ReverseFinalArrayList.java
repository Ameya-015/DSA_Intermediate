package intermediate.arrays;

import java.util.ArrayList;
import java.util.List;

public class ReverseFinalArrayList {
    public ArrayList<Integer> solve(final List<Integer> A) {
        ArrayList<Integer> opList = new ArrayList<>();
        int n = A.size();

        for(int i = n - 1; i >= 0; i--) {
            opList.add(A.get(i));
        }

        return opList;
    }
}
