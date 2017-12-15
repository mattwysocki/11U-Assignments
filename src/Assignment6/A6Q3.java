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
public class A6Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n, temp;
        //create scanner
        Scanner input = new Scanner(System.in);
         int a[] = new int[2];
        System.out.println("List your two integers");
        for (int i = 0; i < 2; i++) {
            a[i] = input.nextInt();
        }
        for (int i = 0; i < 2; i++) {
            for (int j = i + 1; j < 2; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("Ascending Order:");
        for (int i = 0; i < 2 - 1; i++) {
            System.out.print(a[i] + ",");
        }
        System.out.print(a[2 - 1]);
    }
}


