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
public class A4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a scanner for input
        Scanner input = new Scanner(System.in);

        System.out.println("How much does the food for prom cost? ");
        double cost = input.nextDouble();
        System.out.println("How much does the DJ cost? ");
        double cost1 = input.nextDouble();
        System.out.println("How much does it cost to rent the hall? ");
        double cost2 = input.nextDouble();
        System.out.println("How much does decorations cost? ");
        double cost3 = input.nextDouble();
        System.out.println("How much does it cost for staff? ");
        double cost4 = input.nextDouble();
        System.out.println("How much for miscellaneous costs? ");
        double cost5 = input.nextDouble();

        double total = cost + cost1 + cost2 + cost3 + cost4 + cost5;

        double tickets = total / 35;

        System.out.println("Your total cost will be" + total + " You will need" + tickets + "tickets");

    }
}
