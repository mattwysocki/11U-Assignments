/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment4;

import java.util.Scanner;

/**
 *
 * @author wysom4034
 */
public class A4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a scanner for input
        Scanner input = new Scanner(System.in);

        //ask for four numbers
        System.out.println("Please enter in 4 numbers on separate lines:");
        double random = input.nextDouble();
        double random1 = input.nextDouble();
        double random2 = input.nextDouble();
        double random3 = input.nextDouble();

        System.out.println("Your numbers were " + random + "," + random1 + "," + random2 + "," + random3);
    }
}
