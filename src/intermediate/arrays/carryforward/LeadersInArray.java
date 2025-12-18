package intermediate.arrays.carryforward;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeadersInArray {

    public static ArrayList<Integer> leadersInArray(ArrayList<Integer> A) {
        ArrayList<Integer> opList = new ArrayList<>();
        int n = A.size();
        int max = A.get(n - 1);
        opList.add(max);
        for(int i = n - 2; i >= 0; i--) {
            if(A.get(i) > max) {
                max = A.get(i);
                opList.add(max);
            }
        }
        Collections.reverse(opList);
        return opList;
    }

    public static void main(String[] args) {
        List<Integer> a = List.of(16, 17, 4, 3, 5, 2);
        ArrayList<Integer> A = new ArrayList<>(a);
        ArrayList<Integer> opList = leadersInArray(A);
        for(int i : opList) {
            System.out.print(i+ " ");
        }
    }
}
