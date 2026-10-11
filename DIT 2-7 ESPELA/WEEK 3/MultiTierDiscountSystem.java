/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class MultiTierDiscountSystem {
    public static void main(String args[]) {
      double purchaseAmount = 1500.00;
        
        double discountP = 0.0;
        String discountT = "";

        if (purchaseAmount >= 5000.0) {
            discountP = 0.15; 
            discountT = "Tier 4 (15%)";
        } else if (purchaseAmount >= 3000.0) {
            discountP = 0.10; 
            discountT = "Tier 3 (10%)";
        } else if (purchaseAmount >= 1000.0) {
            discountP = 0.05; 
            discountT = "Tier 2 (5%)";
        } else {
            discountP = 0.0;  
            discountT = "Tier 1 (0%)";
        }

        double discountAmount = purchaseAmount * discountP;
        double finalPrice = purchaseAmount - discountAmount;
  
        System.out.println("Original Purchase Amount: $" + purchaseAmount);
        System.out.println("Assigned Discount Tier: " + discountT);
        System.out.println("Final Discounted Price: $" + finalPrice);
    }
    
}
