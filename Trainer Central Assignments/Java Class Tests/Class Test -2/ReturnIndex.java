
public class ReturnIndex {
    public static void main(String[] args) {
        
        int[] a = {1,3,5,6,9,45};
        System.out.println(searchVal(a, 7));

    }
    public static int searchVal(int[] myArr,int searchVal){
        int start = 0;
        int end = myArr.length;

        if(searchVal>myArr[end-1]) return myArr.length;

        while (start <= end) {
            int middle = (start + end)/2;

            if ( myArr[middle] < searchVal)
                start = middle + 1;

            else if ( myArr[middle] > searchVal)
                end = middle - 1;

            else //equal case
                return middle;
        }

        return start;  
    }
}
