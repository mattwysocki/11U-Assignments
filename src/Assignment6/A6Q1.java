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
public class A6Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of Students: ");
        int n = input.nextInt();

        int total = 0;

        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter the marks of student " + (i + 1) + " :");
            int mark = input.nextInt();
            total = total + mark;
        }

        double averagemark = total / (double) n;
        
        System.out.println("The Average of the students marks comes to " + averagemark);
    }
}
