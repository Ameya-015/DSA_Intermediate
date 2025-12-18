package intermediate.arrays.bitmanipulation;

public class AddBinaryString {

    public String addBinary(String A, String B) {
        int a = A.length();
        int b = B.length();
        StringBuffer reverseString;

        if(a < b) {
            reverseString = new StringBuffer(A);
            reverseString.reverse();
            int diff = b - a;
            for(int i = 1; i <= diff; i++) {
                reverseString = reverseString.append(0);
            }
            reverseString.reverse();
        }
        else {
            reverseString = new StringBuffer(A);
            reverseString.reverse();
            int diff = a - b;
            for(int i = 1; i <= diff; i++) {
                reverseString = reverseString.append(0);
            }
            reverseString.reverse();
        }
        int b1, b2;
        String carry = "0", sum = "0";
        String modified = reverseString.toString();
        for(int i = 0; i < modified.length(); i++) {
//            sum
        }


        return null;
    }

    public static void main(String[] args) {
        String A = "100";
        String B = "11";
    }
}
