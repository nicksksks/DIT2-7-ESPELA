/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class ClassRankingSystem {
       static class Student {
        String name;
        int[] quizzes;
        double average;

        public Student(String name, int[] quizzes) {
            this.name = name;
            this.quizzes = quizzes;
            this.average = calculateAverage();
        }

        private double calculateAverage() {
            int sum = 0;
            for (int score : quizzes) {
                sum += score;
            }
            return (double) sum / quizzes.length;
        }
    }

    public static void main(String[] args) {
        String[] names = {"Althea", "Bianca", "Carlos", "Diana", "Ethan"};
        int[][] rawQuizData = {
            {85, 90, 88, 92},
            {95, 92, 96, 94},
            {75, 80, 82, 78},
            {95, 92, 96, 94},
            {88, 85, 90, 87}
        };

        
        Student[] students = new Student[names.length];
        for (int i = 0; i < names.length; i++) {
            students[i] = new Student(names[i], rawQuizData[i]);
        }

       
        bubbleSortByAverage(students);

        
        System.out.println("=== CLASS LEADERBOARD ===");
        System.out.printf("%-6s | %-12s | %-8s\n", "Rank", "Name", "Average");
        System.out.println("------------------------------------");

        int currentRank = 1;
        for (int i = 0; i < students.length; i++) {
            
            if (i > 0 && students[i].average != students[i - 1].average) {
                currentRank = i + 1;
            }
            System.out.printf("%-6d | %-12s | %-8.2f\n", currentRank, students[i].name, students[i].average);
        }

        
        String targetName = "Diana";
        int foundRank = findStudentRank(students, targetName);
        
        System.out.println("------------------------------------");
        if (foundRank != -1) {
            System.out.println("Search Result: Student '" + targetName + "' is at Rank " + foundRank + ".");
        } else {
            System.out.println("Search Result: Student '" + targetName + "' not found.");
        }
    }

    
    public static void bubbleSortByAverage(Student[] list) {
        int n = list.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list[j].average < list[j + 1].average) {
                    Student temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
    }

   
    public static int findStudentRank(Student[] list, String targetName) {
        int currentRank = 1;
        for (int i = 0; i < list.length; i++) {
            if (i > 0 && list[i].average != list[i - 1].average) {
                currentRank = i + 1;
            }
            if (list[i].name.equalsIgnoreCase(targetName)) {
                return currentRank;
            }
        }
        return -1; 
    }
    }

