package intermediate.arrays;

import java.util.Collections;
import java.util.Scanner;

public class RotateArray {

    public static void rotateArray(int inputArray[], int s, int e) {
        int n = inputArray.length;
        int p1 = s, p2 = e;
        // 1,2,3,4,5
        while(p1 < p2) {
            int temp = inputArray[p1];
            inputArray[p1] = inputArray[p2];
            inputArray[p2] = temp;
            p1++;
            p2--;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size and elements of the Array: ");
        String ip = s.nextLine();

        System.out.println("Enter the times the array should rotate from right");
        int B = s.nextInt();

        String ipAr[] = ip.split(" ");
        int n = Integer.valueOf(ipAr[0]);
        int intArr[] = new int[ipAr.length - 1];

        for(int i = 1; i < ipAr.length; i++) {
            intArr[i - 1] = Integer.valueOf(ipAr[i]);
        }

        rotateArray(intArr, 0 , intArr.length - 1);

        int k = B % n;

        rotateArray(intArr, 0 , k - 1);
        rotateArray(intArr, k , n - 1);

        for(int i = 0; i < intArr.length; i++) {
            System.out.print(intArr[i]+" ");
        }
    }
}
