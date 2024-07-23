package proteintranslation;

import java.util.ArrayList;
import java.util.List;

public class ProteinTranlator {
    private static final List<String> stopCodons = List.of("UAA", "UAG", "UGA");
    public static String rnaSequence;
    
    public void setRnaSequence(String sequence){
        ProteinTranlator.rnaSequence = sequence;
    }
    
    public List<String> translate() {
        List<String> protein = new ArrayList<>();
        while(rnaSequence.length()>=3){
            String codon = rnaSequence.substring(0,3);
            if(stopCodons.contains(codon)) return protein;
            switch(codon){
                case "AUG" :
                    protein.add("Methionine");
                    break;
                case "UUU" :
                case "UUC" :
                    protein.add("Phenylalanine");
                    break;
                case "UUA" :
                case "UUG" :
                    protein.add("Leucine");
                    break;
                case "UCU" :
                case "UCC" :
                case "UCA" :
                case "UCG" :
                    protein.add("Serine");
                    break;
                case "UAU" :
                case "UAC" :
                    protein.add("Tyrosine");
                    break;
                case "UGU" :
                case "UGC" :
                    protein.add("Cysteine");
                    break;
                case "UGG" :
                    protein.add("Tryptophan");
                    break;
                default :
                    throw new IllegalArgumentException("Invalid codon");
            }
            rnaSequence = rnaSequence.substring(3, rnaSequence.length());
        }
        if (rnaSequence.length() > 0) throw new IllegalArgumentException("Invalid codon");
        return protein;
    }
}
