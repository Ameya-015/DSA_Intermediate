package intermediate.arrays.hashing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class ColourfulNumber {

    public static int isColourful(int A) {
        List<Integer> numbers = new ArrayList<>();
        while(A != 0) {
            int num = A % 10;
            numbers.add(num);
            A = A / 10;
        }
        Collections.reverse(numbers);

        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0; i < numbers.size(); i++) {
            int prod = 1;
            for(int j = i; j < numbers.size(); j++) {
                prod *= numbers.get(j);
                if(hs.contains(prod)) {
                    return 0;
                }
                hs.add(prod);
            }
        }

        return 1;
    }


    public static void main(String[] args) {
        int A = 2345;
        System.out.println(isColourful(A));
    }
}
