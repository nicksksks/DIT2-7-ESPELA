/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class IncrementTracker {
    public static void main(String args[]) {
        double balance = 1000.0;
        System.out.println("Initial Balance: $" + balance);

        balance += 250.0;
        System.out.println("After Deposit (+= 250): $" + balance);

        balance *= 1.05;
        System.out.println("After 5% Interest (*= 1.05): $" + balance);

        balance += 100.0;
        System.out.println("After Bonus (+= 100): $" + balance);

        System.out.println("\n-----------------------------------\n");
        int count = 5;

       
        System.out.println("Postfix Execution:");
        System.out.println("Inside println(count++): " + count++); 
        System.out.println("Immediately after:       " + count);

        System.out.println();
        count = 5;

        
        System.out.println("Prefix Execution:");
        System.out.println("Inside println(++count): " + ++count);
        System.out.println("Immediately after:       " + count);
    }
    
}
