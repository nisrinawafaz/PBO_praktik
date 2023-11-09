/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.linkedlist;

/**
 *
 * @author ASUS
 */
import java.util.LinkedList;
import java.util.Collections;

public class Exercise25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<String> c1 = new LinkedList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        System.out.println("Original linked list: " + c1);
        System.out.println("Check the above linked list is empty or not! " + c1.isEmpty());
        c1.removeAll(c1);
        System.out.println("Linked list after remove all elements " + c1);
        System.out.println("Check the above linked list is empty or not! " + c1.isEmpty());
    }

}
