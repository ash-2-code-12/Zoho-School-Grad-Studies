package diamond;

import java.util.ArrayList;
import java.util.List;

public class DiamondPattern {
    private char generator;

    public DiamondPattern(char generator){
        this.generator = generator;
    }
    public void printDiamondPattern(){
        List<String> pattern = generateDiamondPattern(generator);
        for(String each : pattern){
            System.out.println(each);
        }
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    public static List<String> generateDiamondPattern(char a){
        List result = new ArrayList<>();
        if(a == 'A') {
            result.add("A");
            return result;
        }
        int rowsCount = a-'A'; //topHalf rows count
        int colsCount = (2*rowsCount)+1; 
        //Generate top half
        for(int row=0; row<=rowsCount; row++){
            StringBuilder currRow = new StringBuilder();
            char currChar = (char)('A'+row);
            for(int col = 0; col<colsCount; col++){
                if(row + col == rowsCount || col - row == rowsCount){
                    currRow.append(currChar);
                }
                else{
                    currRow.append(" ");
                }
            }
            result.add(currRow.toString());
        }
        for(int row = rowsCount-1; row>=0; row--){
            result.add(result.get(row));
        }
        return result;
    }
}
