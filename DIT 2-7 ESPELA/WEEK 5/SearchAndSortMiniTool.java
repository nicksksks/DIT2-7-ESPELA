/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Administrator
 */
import java.util.Arrays;
public class SearchAndSortMiniTool {
    public static void main(String args[]) {
        int[] scores = {85, 92, 78, 65, 90, 88, 72, 95};
        System.out.println("\t-----------------------------------");
        System.out.println("\t===== Search & Sort Mini-Tool =====");
        System.out.println("\t-----------------------------------");
       
        int targetValue = 90;
        int foundIndex = -1;
        
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == targetValue) {
                foundIndex = i;
                break;
            }
        }
        
        System.out.println("Searching for target value: " + targetValue);
        if (foundIndex != -1) {
            System.out.println("Result: Found at index " + foundIndex);
        } else {
            System.out.println("Result: Value not found in the array.");
        }
        System.out.println();

        int[] sortedScores = Arrays.copyOf(scores, scores.length);
        Arrays.sort(sortedScores);

        
        System.out.println("Original Array:       " + Arrays.toString(scores));
        System.out.println("Sorted Copy of Array: " + Arrays.toString(sortedScores));
        
        /*
         * EXPLANATION: Why sorting a copy (rather than the original) matters here.
         * 
         * In many applications, the original order of data holds specific meaning, 
         * association, or chronological sequence (such as student IDs corresponding 
         * directly to their names or input order). Sorting the original array in-place 
         * would permanently destroy that initial sequence. By copying the array first, 
         * we can safely perform sorting operations for viewing or specialized algorithms 
         * without altering or losing the integrity of the source data.
         */
    }
}
