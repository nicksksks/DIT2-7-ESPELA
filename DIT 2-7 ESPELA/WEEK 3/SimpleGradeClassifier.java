/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class SimpleGradeClassifier {
    public static void main(String args[]) {
        int score = 85;
        System.out.println("------------------------");
        System.out.println("SCORE 1");
        System.out.println("------------------------");
        System.out.println("Score: " + score);
        if (score >= 60) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
        }
        System.out.println("------------------------");
        System.out.println();
        score = 45;
        System.out.println("------------------------");
        System.out.println("SCORE 2");
        System.out.println("------------------------");
        System.out.println("Score: " + score);
        if (score >= 60) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
        }
        System.out.println("------------------------");
    }
}
