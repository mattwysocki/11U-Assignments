/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment6;

import java.util.Scanner;

/**
 *
 * @author wysom4034
 */
public class A6Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("");
        int z, i, s, swap;
        

        System.out.println("Input the number of integers you would like to sort");
        int x = input.nextInt();

        int array[] = new int[x];

        System.out.println("Enter the " + x + " integers");

        for (i = 0; i < x; i++) {
            array[i] = input.nextInt();
        }

        for (i = 0; i < (x - 1); i++) {
            for (s = 0; s < x - i - 1; s++) {
                if (array[s] > array[s + 1]){
                    swap = array[s];
                    array[s] = array[s + 1];
                    array[s + 1] = swap;
                }
            }
        }

        System.out.println("These Are The Integers Sorted, Enjoy");

        for (i = 0; i < x; i++) {
            System.out.println(array[i]);
        }
    }
}
