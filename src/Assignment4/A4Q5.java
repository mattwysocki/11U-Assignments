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
public class A4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Scanner input
        Scanner input = new Scanner(System.in);
        // ask for grades
        System.out.println("Please enter your name");
        String firstName = input.nextLine();
        System.out.println("What was the first test out of?");
        double markOut1 = input.nextDouble();
        System.out.println("What mark did you get?");
        double mark1 = input.nextDouble();
        System.out.println("What was the second test out of?");
        double markOut2 = input.nextDouble();
        System.out.println("What mark did you get?");
        double mark2 = input.nextDouble();
        System.out.println("What was the third test out of?");
        double markOut3 = input.nextDouble();
        System.out.println("What mark did you get?");
        double mark3 = input.nextDouble();
        System.out.println("What was the fourth test out of?");
        double markOut4 = input.nextDouble();
        System.out.println("What mark did you get?");
        double mark4 = input.nextDouble();
        System.out.println("What was the fifth test out of?");
        double markOut5 = input.nextDouble();
        System.out.println("What mark did you get?");
        double mark5 = input.nextDouble();
        //caculating marks
        double testMark = mark1 / markOut1 * 100;
        double testMark2 = mark2 / markOut2 * 100;
        double testMark3 = mark3 / markOut3 * 100;
        double testMark4 = mark4 / markOut4 * 100;
        double testMark5 = mark5 / markOut5 * 100;
        double testAverage = (testMark + testMark2 + testMark3 + testMark4 + testMark5) / 5;

        // output grades
        System.out.println("Test 1: " + testMark + " percent");
        System.out.println("Test 2: " + testMark2 + " percent");
        System.out.println("Test 3: " + testMark3 + " percent");
        System.out.println("Test 4: " + testMark4 + " percent");
        System.out.println("Test 5: " + testMark5 + " percent");
        System.out.println("Average: " + testAverage + " percent");



    }
}
