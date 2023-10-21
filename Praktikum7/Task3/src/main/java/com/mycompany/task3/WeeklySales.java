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
public class WeeklySales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Salesperson[] salesStaff;
        int size;

        Scanner scan = new Scanner(System.in);

        System.out.println("\nHow many person? ");
        size = scan.nextInt();
        salesStaff = new Salesperson[size];
        
        for (int i = 0; i < size; i++) {
            scan.nextLine();
            System.out.println("\nFirst Name : ");
            String first = scan.nextLine();
            System.out.println("\nLast Name :");
            String last = scan.nextLine();
            System.out.println("\nTotal Sales :");
            int total = scan.nextInt();
            salesStaff[i] = new Salesperson(first, last, total);
        }
        
        Sorting.insertionSort(salesStaff);
        System.out.println("\nRanking of Sales for the week with sorting\n");
        for (Salesperson s : salesStaff) {
            System.out.println(s);
        }
        
        /*System.out.println("\nRanking of Sales for the week with compare \n");
        for (int index = 1; index < salesStaff.length; index++) {
            Comparable key = salesStaff[index];
            int position = index;
            
            
            while (position >0 && key.compareTo(salesStaff[position - 1]) == 1) {
                salesStaff[position] = salesStaff[position - 1];
                position--;
            }

            salesStaff[position] = ((Salesperson)key);
        }
        
        for (Salesperson s : salesStaff) {
            System.out.println(s);
        }*/
    }

}
