package intermediate.arrays.hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KOccurrences {

    public static int getSum(int A, int B, ArrayList<Integer> C) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int sum = 0;

        for(int i = 0; i < A; i++) {
            if(hm.containsKey(C.get(i))) {
                hm.put(C.get(i), hm.get(C.get(i)) + 1);
            }
            else {
                hm.put(C.get(i), 1);
            }
        }

        for(Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            int key = entry.getKey();
            if(hm.get(key) == B) {
                sum += key;
            }
        }
        if(sum == 0) {
            return -1;
        }

        return sum;
    }

    public static void main(String[] args) {
        int A = 6;
        int B = 2;
        List<Integer> c = List.of(1000000000,1000000000,999999999,999999999,999999998,1);
        ArrayList<Integer> C = new ArrayList<>(c);
        System.out.println(getSum(A,B,C));
    }
}
