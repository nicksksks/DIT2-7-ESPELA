/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class PrecedencePuzzleSolver {
    public static void main(String args[]) {
        
        // Prediction: false
        // Explanation: Multiplication happens first (5 * 2 = 10). Then addition 
        // (3 + 10 = 13). Then relational comparison (13 > 15 is false).
        boolean rt1 = 3 + 5 * 2 > 15;
        System.out.println("Puzzle 1 Result: " + rt1);

        
        // Prediction: true
        // Explanation: Post-increment (++x) evaluates with the current value (4) first, 
        // then increments x to 5. Then 4 < 10 is true. Logical AND (&&) checks the 
        // second condition: pre-increment (++y) increments y from 2 to 3 first, then 
        // checks 3 < 5, which is true. True && true evaluates to true.
        int x = 4;
        int y = 2;
        boolean rt2 = x++ < 10 && ++y < 5;
        System.out.println("Puzzle 2 Result: " + rt2);

        
        // Prediction: true
        // Explanation: Unary minus (-a) negates 6 to -6. Then subtraction (-6 - 4) yields -10. 
        // Relational check (-10 != 0) evaluates to true. Finally, the logical OR (||) 
        // sees true on the left side, so short-circuits and skips evaluating the right side.
        int a = 6;
        int b = 8;
        boolean rt3 = -a - 4 != 0 || b++ > 10;
        System.out.println("Puzzle 3 Result: " + rt3);
    
    }
}

