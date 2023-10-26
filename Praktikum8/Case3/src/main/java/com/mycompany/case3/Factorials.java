/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.case3;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Factorials {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String keepGoing;
        keepGoing = "y";
        Scanner scan = new Scanner(System.in);
        while (keepGoing.equals("y") || keepGoing.equals("Y")) {
            System.out.print("Enter an integer: ");
            int val = scan.nextInt();
            try {
                System.out.println("Factorial(" + val + ") = " + MathUtils.factorial(val));
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
            System.out.print("Another factorial? (y/n) ");
            keepGoing = scan.next();

        }
    }

}
