package intermediate.arrays.recursion;

public class IsStringPalindrome {

    public static int isPal(String A, int s, int e) {
        if(s > e) {
            return 1;
        }
        if(A.charAt(s) == A.charAt(e)) {
            return isPal(A, s + 1, e - 1);
        }
        return 0;
    }


    public static void main(String[] args) {
        String A = "strings";
        int s = 0, e = A.length() - 1;
        System.out.println(isPal(A, s, e));
    }
}
