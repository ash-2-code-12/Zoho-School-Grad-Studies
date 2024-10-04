// 4.Find if a String2 is substring of String1. If it is, return the index of the first occurrence. else return -1.
// Sample Input-1 thistest123string123 123
// Sample Output-1 8

public class SubstringIndex {
    public static void main(String[] args) {
        
        String str1 = "thistest123string123";//"malayalam";
        String str2 = "st";//"yalam";

        int index = findResult(str1, str2);

        System.out.println(index==-1? "Not Found": "Found at index : " + index);
    }

    public static int findResult(String str1, String str2){
        int n = str1.length();
        int l = str2.length();
        
        for (int i = 0; i <= n - l; i++) {
            int j;
            for (j = 0; j < l; j++) {
                if (str1.charAt(i + j) != str2.charAt(j)) {
                    break;
                }
            }
            if (j == l) {
                return i;
            }
        }
        return -1;
    }
}

