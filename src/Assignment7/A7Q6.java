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
public class A7Q6 {

    public int lastDigit(int Num) {

        int answer = Num % 10;
        //send back the answer
        return answer;

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner
        Scanner input = new Scanner(System.in);
        A7Q6 test = new A7Q6();

        System.out.println("Enter a number, please");

        int Number = input.nextInt();

        int answer = test.lastDigit(Number);
        
        System.out.println("The Last Digit: " + answer);
    }
}
