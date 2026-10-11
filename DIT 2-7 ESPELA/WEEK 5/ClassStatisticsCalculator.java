/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class ClassStatisticsCalculator {
    public static void main(String args[]) {
        int[] scores = {85, 92, 78, 65, 90, 88, 72, 95};


        int sum = 0;
        int highest = scores[0];
        int lowest = scores[0];


        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];

            if (scores[i] > highest) {
                highest = scores[i];
            }

            if (scores[i] < lowest) {
                lowest = scores[i];
            }
        }
        double average = (double) sum / scores.length;

        // Print all four statistics with clear labels
        System.out.println("-----------------------------------");
        System.out.println("=== Class Statistics Calculator ===");
        System.out.println("-----------------------------------");
        System.out.println("Total Sum of Scores: " + sum);
        System.out.println("Class Average Score: " + average);
        System.out.println("Highest Score: " + highest);
        System.out.println("Lowest Score: " + lowest);
    }
}
