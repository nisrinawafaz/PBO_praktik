/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.hashmap;

/**
 *
 * @author ASUS
 */

import java.util.Collections;
import java.util.HashMap;
import java.util.Set;
public class Exercise11and12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap<Integer, String> hash_map = new HashMap<Integer, String>();

        hash_map.put(1, "Red");
        hash_map.put(2, "Green");
        hash_map.put(3, "Black");
        hash_map.put(4, "White");
        hash_map.put(5, "Blue");

        // get keyset value from map
        Set keyset = hash_map.keySet();
        Set set = hash_map.entrySet();
        // check set values
        System.out.println("Set values: " + set);
        // check key set values
        System.out.println("Key set values are: " + keyset);
        System.out.println("Collection view is: "+ hash_map.values());
    }

}
