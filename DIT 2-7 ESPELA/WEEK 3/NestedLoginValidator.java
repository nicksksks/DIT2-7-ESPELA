/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class NestedLoginValidator {
    public static void main(String args[]) {
      String correctUsername = "althea";
        String correctPassword = "thea123";
        boolean isAccountLocked = false;

        System.out.println("-----------------------------------");
        System.out.println("--- Test Case 1: Wrong Username ---");
        System.out.println("-----------------------------------");
        validateLogin("wrong_username", "SecurePassword123", isAccountLocked, correctUsername, correctPassword);
        System.out.println();
                System.out.println("-----------------------------------");
                System.out.println("--- Test Case 2: Wrong Password ---");
                System.out.println("-----------------------------------");
        validateLogin("admin_user", "WrongPassword", isAccountLocked, correctUsername, correctPassword);
        System.out.println();

        System.out.println("-----------------------------------");
        System.out.println("--- Test Case 3: Account Locked ---");
        System.out.println("-----------------------------------");
        validateLogin("admin_user", "SecurePassword123", true, correctUsername, correctPassword);
        System.out.println();

        System.out.println("-----------------------------------");
        System.out.println("-- Test Case 4: Successful Login --");
        System.out.println("-----------------------------------");
        validateLogin("althea", "thea123", false, correctUsername, correctPassword);
    }

    public static void validateLogin(String inputUser, String inputPass, boolean accountLocked, 
                                     String correctUsername, String correctPassword) {
        
        if (inputUser.equals(correctUsername)) {
            
            
            if (inputPass.equals(correctPassword)) {
                
               
                if (!accountLocked) {
                    System.out.println("Success: Login complete! Welcome, " + inputUser + ".");
                } else {
                    System.out.println("Error: Account is locked. Please contact support.");
                }
                
            } else {
                System.out.println("Error: Incorrect password.");
            }
            
        } else {
            System.out.println("Error: Username not found.");
        }
    }
}
