package intermediate.arrays.hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommonElements {

    public static ArrayList<Integer> commonElements(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> op = new ArrayList<>();
        int n = A.size(), m = B.size();
        HashMap<Integer, Integer> hmA = new HashMap<>();
        HashMap<Integer, Integer> hmB = new HashMap<>();

        for(int i = 0; i < n; i++) {
            if(hmA.containsKey(A.get(i))) {
               hmA.put(A.get(i), hmA.get(A.get(i)) + 1);
            }
            else {
                hmA.put(A.get(i), 1);
            }
        }

        for(int i = 0; i < n; i++) {
            if(hmB.containsKey(B.get(i))) {
                hmB.put(B.get(i), hmA.get(B.get(i)) + 1);
            }
            else {
                hmB.put(B.get(i), 1);
            }
        }
        int n1 = hmA.size(), m1 = hmB.size();
        int limit = n1 < m1 ? n1 : m1;
        for(int i = 0; i < limit; i++) {
            if(hmA.get(i) == hmB.get(i)) {
//                Map.Entry<Integer, Integer> entry =
            }
        }

        return op;
    }

    public static void main(String[] args) {
        List<Integer> a = List.of(1, 2, 2, 1);
        ArrayList<Integer> A = new ArrayList<>(a);

        List<Integer> b = List.of(2, 3, 1, 2);
        ArrayList<Integer> B = new ArrayList<>(b);

        ArrayList<Integer> commElms = commonElements(A, B);

        for(Integer i : commElms) {
            System.out.println(i + " ");
        }
    }
}
