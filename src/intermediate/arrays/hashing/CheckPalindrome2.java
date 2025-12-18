package intermediate.arrays.hashing;

import java.util.HashMap;

public class CheckPalindrome2 {

    public static int solve(String A) {
        int n = A.length();
        HashMap<Character, Integer> hm = new HashMap<>();

        if(n % 2 == 0) {
            for(int i = 0; i < n; i++) {
                if(hm.containsKey(A.charAt(i))) {
                    hm.put(A.charAt(i), hm.get(A.charAt(i)) + 1);
                }
                else {
                    hm.put(A.charAt(i), 1);
                }
            }
        }


        return 1;
    }

    public static void main(String[] args) {
        String A = "abbaee";
        System.out.println(solve(A));
    }
}
