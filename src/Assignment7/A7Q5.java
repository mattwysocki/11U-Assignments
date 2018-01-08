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
public class A7Q5 {

    public void chaotic(int dotNumber) {


        if (dotNumber == 1) {
            System.out.println("*");
        }
        if (dotNumber == 2) {
            System.out.println("**");
        }
        if (dotNumber == 3) {
            System.out.println("***");
        }
        if (dotNumber == 4) {
            System.out.println("****");
        }
        if (dotNumber == 5) {
            System.out.println("*****");
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create scanner

        A7Q5 test = new A7Q5();

        Scanner input = new Scanner(System.in);


        System.out.println("Enter the number of lines");
        int dotNumber = input.nextInt();
        
        for (int i = 0; i < dotNumber; i++) {
            int Number = (int) (Math.random() * (5 - 1 + 1)) + 1;
            test.chaotic(Number);
        }
        


    }
}
