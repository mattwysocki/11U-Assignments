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
public class A4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Scanner input
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the speed limit:");
        double speedLimit = input.nextDouble();

        System.out.println("Enter the recorded speed of the car:");
        double carsSpeed = input.nextDouble();

        double speedFine = (carsSpeed - speedLimit);

        if (carsSpeed > 0) {

            if (carsSpeed < speedLimit) {
                System.out.println("Congratulations, you are within the speed limit!");
            }

            if (speedFine >= 20) {

                System.out.println("You are speeding and your fine is $100.");
            }

            if (speedFine >= 30) {

                System.out.println("You are speeding and your fine is $270");
            }

            if (speedFine >= 31) {

                System.out.println("You are speeding and your fine is $500");

            }
        }


    }
}
