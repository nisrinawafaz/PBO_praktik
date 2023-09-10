/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktek3;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class bigNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String A = in.next();
        String B = in.next();
        
        if(Integer.parseInt(A)>=0 && Integer.parseInt(B)>=0 && A.length() <= 200 && B.length() <= 200)
        {
            BigInteger a = new BigInteger(A);
            BigInteger b = new BigInteger(B);
            
            System.out.println(a.add(b));
            System.out.println(a.multiply(b));
        }
    }
}
