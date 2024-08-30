// 2. Write a Java program that creates a `Vector` of doubles. 
// Add five random double values to the vector. 
// Check if the value 10.5 is in the vector. 
// Print the size of the vector before and after adding an additional value.

import java.util.Enumeration;
import java.util.Vector;

public class DoubleVector {
    
    public static void main(String[] args) {
        
        Vector<Double> dbls = new Vector<>();
        
        dbls.add(11.2);
        dbls.add(35.33);
        dbls.add(931.77);
        dbls.add(10.5);
        dbls.add(13.13);

        System.out.println( "10.5 is" + ((checkPresence(dbls,10.5) == true) ? "present":"not present"));

        System.out.println("size before adding an additional value : " + dbls.size());
        dbls.add(121.97);
        System.out.println("size after adding an additional value : " + dbls.size());

    }

    private static  boolean checkPresence(Vector<Double> dbls, double d){
        
        Enumeration<Double> itr = dbls.elements();

        while ((itr.hasMoreElements())) {
            double curr = itr.nextElement();
            if(curr == d){
                return true;
            }
        }
        return false;

    }

}
