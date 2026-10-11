/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class UnitCastingConverter {
    public static void main(String args[]) {
     
        double totalCt = 275.85;

        int wholeMs = (int) (totalCt / 100);
        double remainingC = totalCt / 100;
        
        System.out.println("----------------------------------------");
        System.out.println("----------- Unit Conversion ------------");
        System.out.println("----------------------------------------");
        System.out.println("Total Centimeters: " + totalCt + " cm");
        System.out.println("Whole Meters:      " + wholeMs + " m");
        System.out.println("Remaining CM:      " + remainingC + " cm");
        System.out.println("----------------------------------------");
        System.out.println();
        
        int wholeD = 15;
        double exactD = wholeD;
        
        System.out.println("----------------------------------------");
        System.out.println("--- Implicit Widening Demonstration  ---");
        System.out.println("----------------------------------------");
        System.out.println("Original int value:    " + wholeD);
        System.out.println("Widened double value:  " + exactD);
        System.out.println("----------------------------------------");
        System.out.println();

        
        double preciseM = 98.765;
        
        int truncatedM = (int) preciseM;
        System.out.println("----------------------------------------");
        System.out.println("--- Explicit Narrowing Demonstration ---");
        System.out.println("----------------------------------------");
        System.out.println("Original double value:  " + preciseM);
        System.out.println("Narrowed int value:     " + truncatedM);
        System.out.println("Data Lost:             (.765)");
        System.out.println("-----------------------------------------");
    }
}
/* Implicit Widening Cast - Converting a smaller data type (int) to a larger data type (double) happens automatically. 
No explicit cast is needed because double has a wider range and higher precision, ensuring no data or precision is lost during the conversion.
*/
/* Explicit Narrowing Cast - Converting a larger data type (double) to a smaller data type (int) requires a manual cast - (int). 
Data lost - The decimal or fractional portion is completely truncated (cut off), not rounded.
*/