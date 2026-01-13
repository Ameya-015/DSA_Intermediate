package intermediate.arrays.bitmanipulation;

public class AddBinaryStrings {
    public static void main(String[] args) {
        String A = "100", B = "11";
//        int a = Integer.parseInt(A);
//        int b = Integer.parseInt(B);
        int nA = A.length(), nB = B.length();
        int n = 0;
        if(nA > nB) {
            n = nA;
        }
        else {
            n = nB;
        }
        int sum = 0, carry = 0;
        String total = "";
//        int a = 0, b = 0;
        for(int i = n - 1; i >= 0; i--) {
            int a = (int) A.charAt(i);
            int b = (int) B.charAt(i);

            sum = a % b;
            carry = a / b;

        }

    }
}
