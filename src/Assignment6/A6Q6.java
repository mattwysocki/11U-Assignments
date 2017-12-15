 /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment6;

import java.util.Scanner;

/**
 *
 * @author wysom4034
 */
public class A6Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int s, min;
        int n, max;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students in the class");
        n = input.nextInt();

        int total = 0;
        int a[] = new int[n];

        System.out.println("Enter the mark of the students:");
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }

        max = a[0];
        for (int i = 0; i < n; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        System.out.println("The Highest mark in the class was " + max);

        for (int i = 0; i < a.length; i++) {
            total = total + a[i];
        }
        double averageMark = total / n;
        System.out.println("The Average for the class was " + averageMark);
        
            
        
        min = a[0];
        for (int i = 0; i < n; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }


        System.out.println("The Lowest mark in the class was " + min);
}
}
