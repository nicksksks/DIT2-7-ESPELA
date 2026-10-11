/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class PatternGeneratorWithEarlyExit {
    public static void main(String args[]) {
     int size = 5;
        System.out.println("-----------------------------------");
        System.out.println("--- Advanced Pattern Generator (Square Pattern) ---");
        System.out.println("-----------------------------------");
        
        for (int row = 1; row <= size; row++) {
            
            
            if (row == 3) {
                System.out.println("-----");
                continue; 
            }

            
            for (int col = 1; col <= size; col++) {
                
                
                if (col == 4) {
                    break; 
                }

                System.out.print("* ");
            }

            System.out.println(); 
        }
    }
}
