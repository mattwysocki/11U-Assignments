/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment7;

import Quiz.MethodsExamples;
import java.util.Scanner;

/**
 *
 * @author wysom4034
 */
public class A7Q1 {

    public double circleArea(double radius) {
        //calculate area
        double answer = Math.pow(radius, 2) * 3.14159;
        //send back the answer
        return answer;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MethodsExamples test = new MethodsExamples();

        Scanner input = new Scanner(System.in);
        
        double pie = 3.14159;
        
        System.out.println("What is the radius of the circle");
        double radius = input.nextDouble();

        double area =  Math.pow(radius,2) * pie;

        System.out.println("Therfore the area of the circle is " + area);
    }
}
