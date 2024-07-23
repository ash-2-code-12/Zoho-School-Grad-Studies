package proteintranslation;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProteinTranlator translator = new ProteinTranlator();
        List<String> proteinSequence = new ArrayList<>();
        try{
            translator.setRnaSequence("AUGUUUUAA");  //AUGUUUUAA    AUGUUUUGG UGGUGUUAUUAAUGGUUU
            proteinSequence = translator.translate();
        }
        catch(Exception e){
            System.out.println("Invalid Sequence. Please provide a valid sequence.");
        }
        
        for(String protein : proteinSequence){
            System.out.println(protein);
        }
    }
}
