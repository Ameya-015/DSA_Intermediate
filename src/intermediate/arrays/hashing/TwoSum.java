package intermediate.arrays.hashing;

import java.util.*;

public class TwoSum {
    public static ArrayList<Integer> twoSum(ArrayList<Integer> A, int B) {
        int n = A.size();
        HashMap<Integer, Integer> hm = new HashMap<>();
        int s = Integer.MAX_VALUE, e = Integer.MAX_VALUE;
        ArrayList<Integer> opList = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            if(hm.containsKey(B - A.get(i))) {
                s = hm.get(B - A.get(i));
                e = i + 1;

                opList.add(s);
                opList.add(e);

            }
            else {
                hm.put(A.get(i), i + 1);
            }
        }
        return opList;
    }

    public static void main(String[] args) {
        ArrayList<Integer> A = (ArrayList<Integer>) List.of(2,7,11,15);
        int B = 9;
        ArrayList<Integer> opList = twoSum(A, B);

        /*A = [4,7,-4,2,2,2,3,-5,-3,9,-4,9,-7,7,-1,9,9,4,1,-4,-2,3,-3,-5,4,-7,7,9,-4,4,-8]

        B = -3*/


        for(Integer i : opList) {
            System.out.print(i + " ");
        }
    }
}
