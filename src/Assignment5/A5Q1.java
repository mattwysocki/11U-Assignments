/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment5;

import java.util.Scanner;

/**
 *
 * @author wysom4034
 */
public class A5Q1 {

    static boolean isVowel(char v) {
        if (v == 'a' || v == 'e' || v == 'i'
                || v == 'o' || v == 'u') {
            return true;
        }
        return false;
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //ask for word to translate
        System.out.println("Plaese enter a word");
        String word = input.nextLine();
        StringBuilder result = new StringBuilder();
        boolean prevVowel = false;

        //convert to lowercase
        word = word.toLowerCase();
        String translate = "";
       
                //find all the vowels in the word
            for (int i = 0; i < word.length(); i++) {
                //find all the vowels in the word
                if (isVowel(word.charAt(i))) {
                    if (prevVowel == false) {
                        result.append("ub");
                    }

                    prevVowel = true;
                } else {
                    prevVowel = false;
                }
                result.append(word.charAt(i));



            }
            System.out.println("the word " + word + " is said " + result + " in Ubbi Dubbi");
        }
    }

