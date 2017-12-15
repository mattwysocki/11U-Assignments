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
public class A6Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create svanner
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the number of athletes: ");
        int n = input.nextInt();

        int total = 0;

        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter the heights of each athlete " + (i + 1) + " :");
            int Height = input.nextInt();
            total = total + Height;
        }

        double averageheight = total / (double) n;
        
        System.out.println("The Average height of the athletes are " + averageheight);
            
        
    }
}
