/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class GradeThresholdChecker {
    public static void main(String args[]) {
       
        double aveGrade = 80.5;
        int absences = 3;

        boolean Passed = (aveGrade >= 75 && absences <= 3) || (aveGrade >= 90);

        System.out.println("-------------------------------");
        System.out.println("--- Grade Threshold Checker ---");
        System.out.println("-------------------------------");
        System.out.println("Average Grade: " + aveGrade);
        System.out.println("Absences:      " + absences);
        System.out.println("-------------------------------");

        
        if (Passed) {
            System.out.println("Status: PASS");
            if (aveGrade >= 90) {
                System.out.println("Reason: Excellent performance!");
            } else {
                System.out.println("Reason: Met passing criteria");
            }
        } else {
            System.out.println("Status: FAIL");
            System.out.println("Reason: Did not meet passing criteria");
            System.out.println("(Average below 75 or excessive absences)");
        }
        System.out.println("-------------------------------");
    }
}
