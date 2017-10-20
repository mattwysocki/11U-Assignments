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
public class A4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Scanner input
        Scanner input = new Scanner(System.in);
        int currentplace = 0;
        while (true) {
            System.out.println("ENTER SUM OF DICE:");
            int diceNumber = input.nextInt();



            if (diceNumber == 0) {
                System.out.println("DON'T CHEAT!!");
            }

            if (diceNumber == 1) {
                System.out.println("DON'T CHEAT!!");
            }

            if (diceNumber == 2) {
                currentplace = currentplace + 2;
                System.out.println("you are currently at " + currentplace);
                System.out.println("Roll again");
            }

            if (diceNumber == 3) {
                currentplace = currentplace + 3;
                System.out.println("you are currently at " + currentplace);
                System.out.println("Roll again");

            }
            if (diceNumber == 4) {
                currentplace = currentplace + 4;
                System.out.println("you are currently at " + currentplace);
                System.out.println("Roll again");
            }
            if (diceNumber == 5) {
                currentplace = currentplace + 5;
                System.out.println("you are currently at " + currentplace);
                System.out.println("Roll again");
            }
            if (diceNumber == 6) {
                currentplace = currentplace + 6;
                System.out.println("you are currently at " + currentplace);
                System.out.println("Roll again");
            }
            if (diceNumber == 7) {
                currentplace = currentplace + 7;
                System.out.println("you are currently at " + currentplace);
                System.out.println("Roll again");
            }
            if (diceNumber == 8) {
                currentplace = currentplace + 8;
                System.out.println("you are currently at " + currentplace);
                System.out.println("Roll again");
            }
            if (diceNumber == 9) {
                currentplace = currentplace + 9;
                System.out.println("you are currently at " + currentplace);
                System.out.println("Roll again");
            }
            if (diceNumber == 10) {
                currentplace = currentplace + 10;
                System.out.println("you are currently at " + currentplace);
                System.out.println("Roll again");
            }
            if (diceNumber == 11) {
                currentplace = currentplace + 11;
                System.out.println("you are currently at " + currentplace);
                System.out.println("Roll again");
            }
            if (diceNumber == 12) {
                currentplace = currentplace + 12;
                System.out.println("you are currently at " + currentplace);
                System.out.println("Roll again");
            }

            if (currentplace == 9) {
                currentplace = currentplace + 25;
                System.out.println("you are currently at " + currentplace);
                System.out.println("Roll again");
            }
            if (currentplace == 40) {
                currentplace = currentplace + 24;
                System.out.println("you are currently at " + currentplace);
                System.out.println("Roll again");

            }
            if (currentplace == 67) {
                currentplace = currentplace + 19;
                System.out.println("you are currently at " + currentplace);
                System.out.println("Roll again");

            }
            if (currentplace == 54) {
                currentplace = currentplace - 35;
                System.out.println("you are currently at " + currentplace);
                System.out.println("Roll again");

            }
            if (currentplace == 90) {
                currentplace = currentplace - 42;
                System.out.println("you are currently at " + currentplace);
                System.out.println("Roll again");

            }
            if (currentplace == 99) {
                currentplace = currentplace - 22;
                System.out.println("you are currently at " + currentplace);
                System.out.println("Roll again");

            }

            if (currentplace == 100) {
                System.out.println("CONGRATULATIONS!!!");
                System.out.println("You Win");

            }

        }
    }
}
