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
public class A7Q2 {

    public double examGrade(double mark) {

        return 0;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create scanner
        Scanner input = new Scanner(System.in);

        System.out.println("What percentage did you get on the exam");
        double mark = input.nextDouble();

        if (mark < 50) {
            System.out.println("You got a F");
        }
        if (mark == 50 - 59) {
            System.out.println("You got a D");
        }
        if (mark == 60 - 69) {
            System.out.println("You got a C");
        }
        if (mark == 70 - 79) {
            System.out.println("You got a B");
        }
        if (mark == 80-100) {
            System.out.println("You got a A");
        }


    }
}
