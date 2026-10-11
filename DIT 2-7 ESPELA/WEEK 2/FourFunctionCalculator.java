/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Administrator
 */
import java.util.Scanner;

public class FourFunctionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = scanner.nextInt();

        scanner.close();

        
        System.out.println("\n--- Calculator Results ---");
        System.out.println("Addition (+): " + (num1 + num2));
        System.out.println("Subtraction (-): " + (num1 - num2));
        System.out.println("Multiplication (*): " + (num1 * num2));
        System.out.println("Division (/): " + (num1 / num2));
        System.out.println("Modulo (%): " + (num1 % num2));

        /*
         * NOTE ON NEGATIVE OPERANDS:
         * Division (/) and Modulo (%) behave differently when negative operands are involved.
         * For division, truncating toward zero means the result is negative if only one operand is negative.
         * For modulo (remainder), the result takes the sign of the dividend (the first operand), 
         * meaning (-a % b) results in a negative remainder, whereas (a % -b) retains the sign of b.
         */
    }
}