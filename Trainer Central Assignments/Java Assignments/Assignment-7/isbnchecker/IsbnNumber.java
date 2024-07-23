package isbnchecker;

public class IsbnNumber {

    private String isbnNumber ;
    
    public IsbnNumber(String isbnNumber){
        this.isbnNumber = isbnNumber;
    }

    public void checkValidity(){
        System.out.println(isValid(isbnNumber));
    }
    
    public static boolean isValid(String stringToVerify) {
        
        stringToVerify = stringToVerify.replace("-","");
        
        if(stringToVerify.length() != 10) return false;

        int calculatedResult = 0;
        
        for(int i=0; i<10; i++){
            char curr = stringToVerify.charAt(i);
            if(Character.isDigit(curr) || (i==stringToVerify.length()-1 && curr=='X')){
                int value = (curr=='X')? 10 : Character.getNumericValue(curr);
                calculatedResult += (10-i) * value;
            }
            else{
                return false; //if Invalid Character
            }
        }

        return calculatedResult % 11 == 0;
    }
}
