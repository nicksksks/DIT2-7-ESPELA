/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Administrator
 */
import java.util.Arrays;
public class OverflowReferenceInvestigator {
    public static void main(String args[]) {

        byte maxByte = 127;
        byte overf = (byte) (maxByte + 1);
        System.out.println("-----------------------------------");
        System.out.println("-------- Primitive Overflow -------");
        System.out.println("-----------------------------------");
        System.out.println("Original max byte: " + maxByte);
        System.out.println("After incrementing by 1: " + overf);
        System.out.println("-----------------------------------\n");
        System.out.println();

        
        String s1 = new String("thea");
        String s2 = new String("thea");
        String sL = "thea";
        System.out.println("-----------------------------------");
        System.out.println("------- String Comparisons --------");
        System.out.println("-----------------------------------");
        System.out.println("s1 == s2: " + (s1 == s2));
        System.out.println("s1.equals(s2): " + s1.equals(s2));
        
        System.out.println("s1 == sL: " + (s1 == sL));
        System.out.println("s1.equals(sL): " + s1.equals(sL));
        
        System.out.println("s2 == sL: " + (s2 == sL));
        System.out.println("s2.equals(sL): " + s2.equals(sL));
        System.out.println();

        /*
         * EXPLANATION OF == COMPARISONS FOR STRINGS:
         * 
         * - s1 == s2 is FALSE: 
         *   Both `s1` and `s2` were created using the `new` keyword. This forces Java 
         *   to create two distinct objects in the heap memory, even though their contents 
         *   are identical. The `==` operator compares memory addresses (reference equality), 
         *   and since they point to different memory locations, it evaluates to false.
         * 
         * - s1 == sL is FALSE: 
         *   `s1` points to a separate object in the heap allocated by `new`. `sL` is a 
         *   string literal, which is stored in the JVM's String Pool for efficiency. 
         *   Because `s1` points to the heap object and `sL` points to the pool instance, 
         *   their memory addresses differ.
         * 
         * - s2 == sL is FALSE: 
         *   For the exact same reason as `s1 == sL`, `s2` resides in the general heap 
         *   due to the `new` operator, while `s3` resides in the String Pool, resulting 
         *   in different memory references.
         * 
         * Note: .equals() evaluates to true in all cases because it compares the actual 
         * character sequences rather than the memory references.
         */

        
        int[] originalArray = {10, 20, 30};
        int[] sharedArray = originalArray; 
        System.out.println("\n-----------------------------------");
        System.out.println("----- Array Reference Sharing -----");
        System.out.println("-----------------------------------");
        System.out.println("Before modification:");
        System.out.println("originalArray: " + Arrays.toString(originalArray));
        System.out.println("sharedArray:   " + Arrays.toString(sharedArray));
        System.out.println("-----------------------------------");
       
        sharedArray[0] = 99;
        
        System.out.println("After modifying sharedArray[0] to 99:");
        System.out.println("originalArray: " + Arrays.toString(originalArray));
        System.out.println("sharedArray:   " + Arrays.toString(sharedArray));
        System.out.println("-----------------------------------");
    }
}
    
