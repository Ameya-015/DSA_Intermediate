package intermediate.arrays.bitmanipulation;

import java.util.ArrayList;
import java.util.List;

public class BitCompression {

    public static int compressBit(int A[]) {
        int xor = 0;
        int n = A.length;
        for(int i = 0, j = i + 1; i < n - 1; i++, j++) {
            int and = A[i] & A[j];
            int or = A[i] | A[j];
            A[i] = and; A[j] = or;
        }

        for(int i : A) {
            xor ^= i;
        }
        return xor;
    }


    public static void main(String[] args) {
//        List<Integer> a = List.of(1,3,5);
        int A[] = {1,3,5};
//        ArrayL.ist<Integer> A = new ArrayList<>(a);
        System.out.println(compressBit(A));

    }
}
