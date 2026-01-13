package intermediate.arrays;

public class Flip {

    static int[] flip(String A) {
        int ans[] = new int[2];
        int l = 0, r = 0, cSum = 0, maxSum = 0, n = A.length();

        for(int i = 0; i < n; i++) {
            if(A.charAt(i) == '1') {
                cSum -= 1;
            }
            else {
                cSum += 1;
            }

            if(cSum > maxSum) {
                maxSum = cSum;
                ans[0] = l + 1;
                ans[1] = r + 1;
            }

            if(cSum < 0) {
                cSum = 0;
                l = i + 1;
                r = i + 1;
            }
            else {
                r = r + 1;
            }
        }

        if(maxSum == 0) {
            return new int[0];
        }
        else {
            return ans;
        }
    }


    public static void main(String[] args) {
        String A = "010";
        int op[] = flip(A);

        for(int i : op) {
            System.out.print(i + " ");
        }
    }
}
