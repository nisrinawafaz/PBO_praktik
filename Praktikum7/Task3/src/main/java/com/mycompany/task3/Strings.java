/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.task3;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Strings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] stringList;
        int size;

        Scanner scan = new Scanner(System.in);

        System.out.println("\nHow many strings do you want to sort? ");
        size = scan.nextInt();
        stringList = new String[size];

        System.out.println("\nEnter the word...");
        for (int i = 0; i < size; i++) {
            stringList[i] = scan.next();
        }

        Sorting.insertionSort(stringList);

        System.out.println("\nYour numbers in sorted order ...");
        for (int i = 0; i < size; i++) {
            System.out.println(stringList[i] + " ");
        }
        System.out.println();
    }
    
}
