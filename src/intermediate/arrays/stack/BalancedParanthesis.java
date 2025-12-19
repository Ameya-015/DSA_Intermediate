package intermediate.arrays.stack;

import java.util.Stack;

public class BalancedParanthesis {

    public static int isBalanced(String A) {
        int n = A.length();
        Stack<Character> st = new Stack<>();

        for(int i = 0; i < n; i++) {
            if(A.charAt(i) == '(') {
                st.push(A.charAt(i));
            }
            else if(st.isEmpty()) {
                return 0;
            }
            else {
                st.pop();
            }
        }

        if(st.empty()) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        String A = "(()";
        System.out.println(isBalanced(A));
    }
}
