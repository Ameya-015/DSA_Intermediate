package intermediate.arrays;

import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int T = ip.nextInt();
        while (T > 0) {
            int arraySize = ip.nextInt();
            ip.nextLine();
            String elms = ip.nextLine();
            int B = ip.nextInt();

            String elements[] = elms.split(" ");
            int A[] = new int[arraySize];

            for(int i = 0; i < arraySize; i++) {
                A[i] = Integer.valueOf(elements[i]);
            }
            boolean isPresent = false;
            for(int i = 0; i < arraySize; i++) {
                if(A[i] == B) {
                    isPresent = true;
                }
            }
            if(isPresent) {
                System.out.println(1);
            }
            else {
                System.out.println(0);
            }
            /*for(int i = 0; i < arraySize; i++) {
                if(A[i] == B) {
                    System.out.println(1);
                }
            }*/
            T--;
        }
    }
}
