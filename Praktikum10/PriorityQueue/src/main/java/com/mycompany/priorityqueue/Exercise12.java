/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.priorityqueue;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 *
 * @author ASUS
 */
public class Exercise12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PriorityQueue<Integer> pq1 = new PriorityQueue<>(10, Collections.reverseOrder());

        // Add numbers in the Queue
        pq1.add(10);
        pq1.add(22);
        pq1.add(36);
        pq1.add(25);
        pq1.add(16);
        pq1.add(70);
        pq1.add(82);
        pq1.add(89);
        pq1.add(14);
        System.out.println("\nOriginal Priority Queue: " + pq1);

        System.out.print("\nMaximum Priority Queue: ");
        Integer val = null;
        while ((val = pq1.poll()) != null) {
            System.out.print(val + "  ");
        }
        System.out.print("\n");
    }

}
