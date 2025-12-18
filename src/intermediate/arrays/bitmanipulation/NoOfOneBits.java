package intermediate.arrays.bitmanipulation;

public class NoOfOneBits {

    public static int oneBits(int A) {
        int oneBits = 0;
        while(A > 0) {
            int bit = A & 1;
            oneBits += bit;
            A = A >> 1;
        }
        return oneBits;
    }

    public static void main(String[] args) {
        int A = 11;
        System.out.println(oneBits(A));
    }
}
