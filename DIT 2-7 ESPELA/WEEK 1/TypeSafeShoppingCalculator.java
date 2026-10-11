/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class TypeSafeShoppingCalculator {
    public static void main(String args[]) {
        
        String storeN = "Althea's Store";
        int quantity = 18;
        double unitP = 30.48;

       
        double totalC = quantity * unitP;

        System.out.println("------------------------");
        System.out.println("--- Receipt Summary ---");
        System.out.println("------------------------");
        System.out.println("Store Name:  " + storeN);
        System.out.println("Quantity:    " + quantity);
        System.out.println("Unit Price:  $" + unitP);
        System.out.println("Total Cost:  $" + totalC);
        System.out.println("------------------------");
    }
}

/* totalCost should NOT be declared as an int because unitPrice is a double (a floating-point number). Multiplying an int by a double results in a double.
If totalCost were an int, fractional cents or decimal values would be lost due to truncation (truncation is getting the whole number and trowing exest number), resulting in inaccurate monetary calculations.
*/
    

