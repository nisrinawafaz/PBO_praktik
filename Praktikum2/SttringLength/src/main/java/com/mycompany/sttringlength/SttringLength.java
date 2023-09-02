/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sttringlength;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class SttringLength {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan kata pertama : ");
        String A = sc.next();
        System.out.print("Masukkan kata kedua : ");
        String B = sc.next();
        
        int lenString = A.length()+  B.length();
        System.out.println(lenString);
        
        if(A.compareTo(B) > 0)
        {
            System.out.println("Yes");
        }
        else if(A.compareTo(B) < 0)
        {
            System.out.println("No");
        }
        else
        {
            System.out.println("Kata " + A + " dan kata " + B + " berada pada urutan yang sama");
        }
        
        A = (A.substring(0, 1)).toUpperCase()+ A.substring(1);
        B = (B.substring(0, 1)).toUpperCase()+ B.substring(1);
        System.out.println(A + " " + B);
    }
}
