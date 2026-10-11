/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class NumberSquarePrinter {
   public static void main(String args[]) {
       System.out.println("--------------------------------------------");
       System.out.println("--------- Number & Square Printer ----------");
       System.out.println("--------------------------------------------");
      
        for (int i = 1; i <= 20; i++) {
            int square = i * i;
            System.out.println("Number: " + i + " - Square: " + square);
        }
    }
}
