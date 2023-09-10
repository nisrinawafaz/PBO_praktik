/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.praktek3;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Praktek3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String[] output = input.split("[\\s ! , ? . _ ' @]");
        int lengthElement = output.length;
        System.out.println(lengthElement);
        for(int i=0; i < lengthElement; i++)
        {
            System.out.println(output[i]);
        }
    }
}
