/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Administrator
 */
import java.util.Scanner;
public class SentinelSumCalculator {
    public static void main(String args[]) {
      Scanner scanner = new Scanner(System.in);
        int totalSum = 0;
        System.out.println("-----------------------------------");
        System.out.println("---- Sum Until Sentinel Value -----");
        System.out.println("-----------------------------------");
        System.out.println("Enter integers to add to the total.\nEnter -1 to stop.");

        System.out.print("\nEnter an integer: ");
        int input = scanner.nextInt();

       
        while (input != -1) {
            totalSum += input;
            
            System.out.print("Enter an integer: ");
            input = scanner.nextInt();
        }

        scanner.close();

        System.out.println("-----------------------------------");
        System.out.println("Sentinel value -1 detected. Loop terminated.");
        System.out.println("Final Total: " + totalSum);
        System.out.println("-----------------------------------");
    }
}
    

