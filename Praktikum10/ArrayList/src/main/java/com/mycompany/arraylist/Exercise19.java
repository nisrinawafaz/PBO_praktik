/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.arraylist;

/**
 *
 * @author ASUS
 */

import java.util.ArrayList;
import java.util.Collections;
public class Exercise19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> c1= new ArrayList<String>();
          c1.add("Red");
          c1.add("Green");
          c1.add("Black");
          c1.add("White");
          c1.add("Pink");
          System.out.println("Original array list: " + c1);
          System.out.println("Let trim to size the above array: ");
          c1.trimToSize();
          System.out.println(c1);
    }
    
}
