/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.treemap;

/**
 *
 * @author ASUS
 */
import java.util.SortedMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Exercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TreeMap< Integer, String> tree_map = new TreeMap< Integer, String>();
        SortedMap< Integer, String> sub_tree_map = new TreeMap< Integer, String>();
        // Put elements to the map 
        tree_map.put(10, "Red");
        tree_map.put(20, "Green");
        tree_map.put(30, "Black");
        tree_map.put(40, "White");
        tree_map.put(50, "Pink");
        System.out.println("Orginal TreeMap content: " + tree_map);
        System.out.println("Keys greater than or equal to 20: " + tree_map.ceilingKey(20));
        System.out.println("Keys greater than or equal to 30: " + tree_map.ceilingKey(30));
        System.out.println("Keys greater than or equal to 50: " + tree_map.ceilingKey(50));
        System.out.println();
        System.out.println("Orginal TreeMap content: " + tree_map);
        System.out.println("Keys greater than or equal to 20: " + tree_map.ceilingEntry(20));
        System.out.println("Keys greater than or equal to 40: " + tree_map.ceilingEntry(40));
        System.out.println("Keys greater than or equal to 50: " + tree_map.ceilingEntry(50));
        System.out.println();
        System.out.println("Orginal TreeMap content: " + tree_map);
        System.out.println("Keys are greater than 20: " + tree_map.tailMap(20, false));
        System.out.println();
        System.out.println("Orginal TreeMap content: " + tree_map);
        System.out.println("Keys are greater than or equal to 20: " + tree_map.tailMap(20));
        System.out.println();
        System.out.println("Orginal TreeMap content: " + tree_map);
        sub_tree_map = tree_map.subMap(20, true, 40, true);
        System.out.println("Sub map key-values: " + sub_tree_map);
        System.out.println();
        System.out.println("Orginal TreeMap content: " + tree_map);
        sub_tree_map = tree_map.subMap(20, 40);
        System.out.println("Sub map key-values: " + sub_tree_map);
        System.out.println();
        System.out.println("Value before poll: " + tree_map);
        System.out.println("Value returned: " + tree_map.pollLastEntry());
        System.out.println("Value after poll: " + tree_map);
    }

}
