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
public class A7Q7 {

    public int firstDigit(int num) {

        if (num / 10 == 0) {
            return num;
        }
        return firstDigit(num / 10);
    }

    public static void main(String[] args) {
        //create scanner
        Scanner input = new Scanner(System.in);
        A7Q7 test = new A7Q7();

        System.out.println("Enter a number, please");

        int Number = input.nextInt();

        int answer = test.firstDigit(Number);

        System.out.println("The First Digit: " + answer);
    }
}
