package intermediate.arrays.strings;

public class StringOperations {

    public static String stringOps(String A) {
        int n = A.length();

//        String temp = "";
//        //Concatenating String
//        for(int i = 0; i < n; i++) {
//            A = A + (char)(A.charAt(i));
//        }
//
//        for(int i = 0; i < A.length(); i++) {
//            if(A.charAt(i) >= 97 && A.charAt(i) <= 122) {
//                temp = temp + (char)(A.charAt(i));
//            }
//        }
//        String concat = "";
//        for(int i = 0; i < temp.length(); i++) {
//            if(temp.charAt(i) == 'a' || temp.charAt(i) == 'e' || temp.charAt(i) == 'i'
//                    || temp.charAt(i) == 'o' || temp.charAt(i) == 'u') {
//                concat = concat + '#';
//            }
//            else {
//                concat = concat + (char)(temp.charAt(i));
//            }
//        }
        String concat = "";

        for(int i = 0; i < n; i++) {
            if(A.charAt(i) == 'a' || A.charAt(i) == 'e' || A.charAt(i) == 'i'
                    || A.charAt(i) == 'o' || A.charAt(i) == 'u') {
                concat = concat + '#';
//                        (char)A.charAt(i);
            }
            else if(A.charAt(i) >= 65 && A.charAt(i) <= 90){
                continue;
            }
            else {
                concat = concat + (char)A.charAt(i);
            }
        }

        return concat + concat;
    }

    public static void main(String[] args) {
        String A = "aeiOUz";
        System.out.println(stringOps(A));
    }
}
