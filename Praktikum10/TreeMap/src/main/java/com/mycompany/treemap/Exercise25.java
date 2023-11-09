/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.treemap;

/**
 *
 * @author ASUS
 */
import java.util.Map.Entry;
import java.util.TreeMap;

public class Exercise25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TreeMap< Integer, String> tree_map = new TreeMap< Integer, String>();
        // Put elements to the map 
        tree_map.put(10, "Red");
        tree_map.put(30, "Black");
        tree_map.put(40, "White");
        tree_map.put(50, "Pink");
        System.out.println("Orginal TreeMap content: " + tree_map);
        System.out.println("Keys greater than or equal to 20: " + tree_map.ceilingEntry(20));
        System.out.println("Keys greater than or equal to 40: " + tree_map.ceilingEntry(40));
        System.out.println("Keys greater than or equal to 50: " + tree_map.ceilingEntry(50));
    }

}
