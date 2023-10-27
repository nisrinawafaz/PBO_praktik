/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.case2;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Case2 {

    public static void main(String[] args) {
        int val, sum = 0;
        Scanner scan = new Scanner(System.in);
        String line;
        System.out.println("Enter a line of text");
        Scanner scanLine = new Scanner(scan.nextLine());
        try {
            while (scanLine.hasNext()) {
                val = Integer.parseInt(scanLine.next());
                sum += val;
            }
        } catch (NumberFormatException e) {

        }
        System.out.println("The sum of the integers on this line is " + sum);
    }

}
