package intermediate.arrays.modular;

public class DivisibleByEight {

    public static int divideByEight(String A) {
        int n = A.length();
        int power = 0, sum = 0;

        if(n == 1) {
            if(Integer.valueOf(A.charAt(0)) % 8 == 0) {
                return 1;
            }
            else {
                return 0;
            }
        }
        else if(n == 2) {
            int i = n - 1;
            while(power < 2) {
                int num = Integer.valueOf(A.charAt(i));
                //(int) A.charAt(i);
                int factor = (int)Math.pow(10, power);
                sum = sum + (num * factor);
                power++; i--;
            }
        }
        else {
            int i = n - 1;
            while(power < 3) {
                int num = Integer.valueOf(i);
                //(int) A.charAt(i);
                int factor = (int)Math.pow(10, power);
                sum = sum + (num * factor);
                power++; i--;
            }
        }

        if(sum % 8 == 0) {
            return 1;
        }
        else {
            return 0;
        }
    }

    public static void main(String[] args) {
        String A = "16";
        System.out.println(divideByEight(A));
    }
}
