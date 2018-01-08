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
public class A7Q4 {

    public double compoundInterest(double P, double r, double n) {

        //calculate area
        double moneyOwned = Math.pow(P * (1 + r), n);

        return moneyOwned;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create scanner
        Scanner input = new Scanner(System.in);

        System.out.println("How much do you have in your account initially?");
        double P = input.nextDouble();

        System.out.println("What is the intrest rate?");
        double r = input.nextDouble();

        System.out.println("How many years have you waited?");
        double n = input.nextDouble();

        double A = Math.pow((1 + r), n);
        double moneyOwned = A*P; 
        System.out.println("Therefore you will have " + moneyOwned);
    }
}
