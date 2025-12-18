package intermediate.arrays.hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class DistinctNosInWindow {

    public static ArrayList<Integer> dNums(ArrayList<Integer> A, int B) {
        ArrayList<Integer> op = new ArrayList<>();
        int n = A.size();
        HashMap<Integer, Integer> hm = new HashMap<>();
        int distinct = 0;

        for(int i = 0; i < B; i++) {
            hm.put(A.get(i), hm.getOrDefault(A.get(i), 0) + 1);
            if(hm.get(A.get(i)) == 1) {
                distinct++;
            }
        }

        op.add(distinct);

        for(int i = B; i < n; i++) {
            int out = A.get(i - B);
            hm.put(out, hm.getOrDefault(out, 0) + 1);
            if(hm.get(out) == 0) {
                hm.remove(out);
                distinct--;
            }

            int in = A.get(i);
            hm.put(in, hm.getOrDefault(in, 0) + 1);
            if(hm.get(in) == 1) {
                distinct++;
            }
            op.add(distinct);
        }

        return op;
    }

    public static void main(String[] args) {
        List<Integer> a = List.of(2,7,7,81,81);
        ArrayList<Integer> A = new ArrayList<>(a);
        int B = 1;
        ArrayList<Integer> op = dNums(A, B);

        for(int i : op) {
            System.out.print(i + " ");
        }
    }
}
