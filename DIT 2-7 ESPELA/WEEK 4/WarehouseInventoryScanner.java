/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Administrator
 */
import java.util.Scanner;

public class WarehouseInventoryScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] warehouse = {
            {45, 12, 3},
            {-1, 50, 22},
            {8, 15, 30}
        };

        int choice;
        do {System.out.println("\n-----------------------------------");
            System.out.println("=== WAREHOUSE INVENTORY SYSTEM ===");
            System.out.println("-----------------------------------");
            System.out.println("1. Total Inventory (Skip Damaged Shelves)");
            System.out.println("2. Find First Critically Low Shelf (< 5 items)");
            System.out.println("3. Simulate Restocking Shelf");
            System.out.println("4. Exit");
            System.out.println("-----------------------------------");
            System.out.print("Enter your choice (1-4): ");
            
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    int totalItems = 0;
                    for (int i = 0; i < warehouse.length; i++) {
                        for (int j = 0; j < warehouse[i].length; j++) {
                            if (warehouse[i][j] == -1) {
                                continue; 
                            }
                            totalItems += warehouse[i][j];
                        }
                    }
                    System.out.println("-> Total valid items in warehouse: " + totalItems);
                    break;

                case 2:
                    boolean foundLow = false;
                    for (int i = 0; i < warehouse.length; i++) {
                        for (int j = 0; j < warehouse[i].length; j++) {
                            if (warehouse[i][j] != -1 && warehouse[i][j] < 5) {
                                System.out.println("-> Critically low shelf found at Row " + i + ", Col " + j + " with count: " + warehouse[i][j]);
                                foundLow = true;
                                break;
                            }
                        }
                        if (foundLow) {
                            break; 
                        }
                    }
                    if (!foundLow) {
                        System.out.println("-> No critically low shelves found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter amount to restock: ");
                    int restockAmount = scanner.nextInt();
                    simulateRestocking(restockAmount);
                    break;

                case 4:
                    System.out.println("Exiting system. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }

        } while (choice != 4);

        scanner.close();
    }

    
    public static void simulateRestocking(int restockAmount) {
        int currentStock = 3;
        int maxCapacity = 100;

        System.out.println("-> Starting Restock Simulation for Shelf with " + currentStock + " items...");

        while (restockAmount < 0 || (currentStock + restockAmount) > maxCapacity) {
            System.out.println("Validation Error: Invalid restock amount. Must be non-negative and not exceed capacity (" + maxCapacity + "). Restock aborted.");
            return; 
        }

        currentStock += restockAmount;
        System.out.println("-> Restock successful! New stock count: " + currentStock);
    }
}