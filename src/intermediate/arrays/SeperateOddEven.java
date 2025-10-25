package intermediate.arrays;

import java.util.Scanner;

public class SeperateOddEven {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int testCases = ip.nextInt();

        while (testCases > 0) {
            int arraySize = ip.nextInt();
            ip.nextLine();
            String arrayElms = ip.nextLine();
            StringBuffer evenNos = new StringBuffer();
            StringBuffer oddNos = new StringBuffer();

            String ipArray[] = arrayElms.split(" ");
            int nosArray[] = new int[ipArray.length];
            int n = nosArray.length;

            for(int i = 0; i < n; i++) {
                nosArray[i] = Integer.valueOf(ipArray[i]);
            }

            for(int i = 0; i < n; i++) {
                if(nosArray[i] % 2 == 0) {
                    evenNos.append(nosArray[i] + " ");
                }
                else {
                    oddNos.append(nosArray[i] + " ");
                }
            }
            evenNos.trimToSize();
            System.out.println(oddNos.toString());
            System.out.println(evenNos.toString());
            testCases--;
        }
    }
}
