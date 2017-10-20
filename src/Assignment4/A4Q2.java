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
public class A4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a scanner for input
        Scanner input = new Scanner(System.in);
        // ask user fore measurements (In Inches)
        System.out.println("Please enter the measurement in inches you wish to convert");
        double measurement = input.nextDouble();

        //calculate measurement
        double meters = 2.54 * measurement;

        System.out.println(measurement + " inches is the same as " + meters + "cm");







    }
}
