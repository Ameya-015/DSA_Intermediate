package intermediate.arrays.prime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NoOfDivisors {

    static ArrayList<Integer> countOfDivisors(ArrayList<Integer> A) {
        ArrayList<Integer> op = new ArrayList<>();
        int n = A.size();
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++) {
            if(max < A.get(i)) {
                max = A.get(i);
            }
        }

        int ar[] = new int[max + 1];
        int l = ar.length;
        Arrays.fill(ar, 1);

        for(int i = 2; i <= max; i++) {
            for(int j = i; j <= max; j = j + i) {
                ar[j] = ar[j] + 1;
            }
        }

        for(int i = 0; i < n; i++) {
            op.add(ar[A.get(i)]);
        }

        return op;
    }


    public static void main(String[] args) {
        List<Integer> a = List.of(2, 3, 4, 5);
        ArrayList<Integer> A = new ArrayList<>(a);

        ArrayList<Integer> op = countOfDivisors(A);
        for(int i : op) {
            System.out.print(i + " ");
        }
    }
}
