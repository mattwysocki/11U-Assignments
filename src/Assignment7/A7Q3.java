/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment7;

import java.util.Scanner;

/**
 *
 * @author wysom4034
 */
public class A7Q3 {

    public double factors(double integer) {

        return 0;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create scanner
        Scanner input = new Scanner(System.in);

        System.out.println("Print the integer that you would like to find the factors of?");
        double integer = input.nextDouble();

        System.out.print("The possible factors of " + integer + " are: ");
        for (int i = 1; i <= integer; ++i) {
            if (integer % i == 0) {
                System.out.print(i + " ");
            }
        }

    }
}
