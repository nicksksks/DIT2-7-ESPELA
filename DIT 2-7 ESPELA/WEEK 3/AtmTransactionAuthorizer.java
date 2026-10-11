/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class AtmTransactionAuthorizer {
    public static void main(String args[]) {
        String inputUsername = "althea";
        int inputPin = 1204;
        
        String correctUsername = "althea";
        int correctPin = 1204;
        double accBalance = 15000.00;
        double withdrawalAmount = 4000.00;
        double dailyWithdrawn = 1000.00;

        System.out.println("--------------------------------------------");
        System.out.println("=== ATM Transaction Authorization System ===");
        System.out.println("--------------------------------------------");
         if (inputUsername.equals(correctUsername)) {
            if (inputPin == correctPin) {
        System.out.println("Username and PIN verified successfully.");
        System.out.println("--------------------------------------------");

        System.out.println("Target User: " + inputUsername);
        System.out.println("Requested Withdrawal: $" + withdrawalAmount);
       
                

                
                String accountTier;
                if (accBalance >= 50000.00) {
                    accountTier = "Platinum";
                } else if (accBalance >= 20000.00) {
                    accountTier = "Gold";
                } else if (accBalance >= 5000.00) {
                    accountTier = "Silver";
                } else {
                    accountTier = "Bronze";
                }
                System.out.println("Account Tier determined: " + accountTier);

                double dailyLimit;
                if (accountTier.equals("Platinum")) {
                    dailyLimit = 20000.00;
                } else if (accountTier.equals("Gold")) {
                    dailyLimit = 10000.00;
                } else if (accountTier.equals("Silver")) {
                    dailyLimit = 5000.00;
                } else {
                    dailyLimit = 2000.00; 
                }

               
                boolean withdrawalPassed = false;
                String denialReason = "";

                if (withdrawalAmount <= accBalance) {
                    if ((dailyWithdrawn + withdrawalAmount) <= dailyLimit) {
                        withdrawalPassed = true;
                    } else {
                        denialReason = "Denied: Withdrawal exceeds daily limit for tier (" + accountTier + " limit: $" + dailyLimit + ").";
                    }
                } else {
                    denialReason = "Denied: Insufficient account balance.";
                }

                
                double feePercentage = 0.0;
                switch (accountTier) {
                    case "Platinum":
                        feePercentage = 0.00; 
                        break;
                    case "Gold":
                        feePercentage = 0.01; 
                        break;
                    case "Silver":
                        feePercentage = 0.02;
                        break;
                    case "Bronze":
                        feePercentage = 0.03; 
                        break;
                    default:
                        feePercentage = 0.03;
                        break;
                }

                System.out.println("--------------------------------------------");
                if (withdrawalPassed) {
                    double transactionFee = withdrawalAmount * feePercentage;
                    double totalDeduction = withdrawalAmount + transactionFee;
                    
                    if (totalDeduction <= accBalance) {
                        System.out.println("STATUS: TRANSACTION APPROVED");
                        System.out.println("Withdrawn Amount: $" + withdrawalAmount);
                        System.out.println("Transaction Fee (" + (feePercentage * 100) + "%): $" + transactionFee);
                        System.out.println("Total Deducted from Account: $" + totalDeduction);
                        System.out.println("Remaining Balance: $" + (accBalance - totalDeduction));
                    } else {
                        System.out.println("STATUS: TRANSACTION DENIED");
                        System.out.println("Reason: Insufficient funds to cover withdrawal amount plus the transaction fee.");
                    }
                } else {
                    System.out.println("STATUS: TRANSACTION DENIED");
                    System.out.println("Reason: " + denialReason);
                }

            } else {
                System.out.println("--------------------------------------------");
                System.out.println("STATUS: TRANSACTION DENIED");
                System.out.println("Reason: Incorrect 4-digit PIN.");
                System.out.println("--------------------------------------------");
            }
        } else {
            System.out.println("--------------------------------------------");
            System.out.println("STATUS: TRANSACTION DENIED");
            System.out.println("Reason: Invalid username.");
            System.out.println("--------------------------------------------");
        }
    }
}

