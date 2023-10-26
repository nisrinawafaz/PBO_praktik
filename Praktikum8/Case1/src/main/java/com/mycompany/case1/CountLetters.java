/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.case1;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class CountLetters {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] counts = new int[26];
        char huruf = 0;
        Scanner scan = new Scanner(System.in);
//get word from user
        System.out.print("Enter a single word (letters only, please): ");
        String word = scan.nextLine();
//convert to all upper case
        word = word.toUpperCase();
//count frequency of each letter in string
        try {
            for (int i = 0; i < word.length(); i++) {
                huruf = ((char) word.charAt(i));
                counts[word.charAt(i) - 'A']++;
            }
            //print frequencies
            System.out.println();
            for (int i = 0; i < counts.length; i++) {
                if (counts[i] != 0) {
                    System.out.println((char) (i + 'A') + ": " + counts[i]);
                }
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Not a Letter");
            System.out.println(huruf);
        }

    }

}
