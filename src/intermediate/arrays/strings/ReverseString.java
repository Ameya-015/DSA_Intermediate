 package intermediate.arrays.strings;

import java.util.Arrays;

public class ReverseString {

    public static String reverseString(String A) {

        String s[] = A.split(" ");

        int i = 0, j = s.length - 1;
        while(i < j) {
            String temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++; j--;
        }

        String op = String.join(" ", s);

        return op.trim();
    }

    public static void main(String[] args) {
        String A = "the sky is blue";
        System.out.println(reverseString(A));
        /*String reversed = (reverseString(A));;
        for(int i = 0; i < reversed.length(); i++) {
            System.out.print(reversed.charAt(i));
        }*/
    }
}
