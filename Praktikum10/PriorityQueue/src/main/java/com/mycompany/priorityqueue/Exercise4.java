/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.priorityqueue;

/**
 *
 * @author ASUS
 */
import java.util.Collections;
import java.util.PriorityQueue;

public class Exercise4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create Priority Queue
        PriorityQueue<String> pq1 = new PriorityQueue<String>();
        // use add() method to add values in the Priority Queue
        pq1.add("Red");
        pq1.add("Green");
        pq1.add("Black");
        pq1.add("White");
        System.out.println("Original Priority Queue: " + pq1);

        // Inserts the specified element into this priority queue.
        pq1.offer("Blue");

        System.out.println("The New Priority Queue: " + pq1);
    }

}
