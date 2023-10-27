/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.case2;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class ParseInts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int val, sum = 0;
        Scanner scan = new Scanner(System.in);
        String line;
        System.out.println("Enter a line of text");
        Scanner scanLine = new Scanner(scan.nextLine());
        while (scanLine.hasNext()) {
            try {
                val = Integer.parseInt(scanLine.next());
                sum += val;
            } catch (NumberFormatException e) {
                //the next statement is the next iteration of the loop
            }
        }

        System.out.println("The sum of the integers on this line is " + sum);
    }

}
