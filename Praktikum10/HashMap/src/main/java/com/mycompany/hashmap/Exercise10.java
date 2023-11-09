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
public class Exercise10 {

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
        // get value of key 3
        String val = (String) hash_map.get(3);
        // check the value
        System.out.println("Value for key 3 is: " + val);
    }

}
