package intermediate.arrays.recursion;

public class ReverseString {

    public static void reverseString(String A) {
        if(A.length() == 0) {
            return;
        }
        reverseString(A.substring(1));
        System.out.print(A.charAt(0));
    }

    public static void main(String[] args) {
        String A = "scaler";
        reverseString(A.substring(0));
    }
}
