/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.menentukantipedata;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class MenentukanTipeData {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan Jumlah Test Case : ");
        int jmlTestCase = sc.nextInt();
        
        for (int i = 1 ; i <= jmlTestCase; i++) {
            try 
            {
                System.out.print("Masukkan Nilai ke-" + i + ": ");
                long nilai = sc.nextLong();
                System.out.println(nilai + " can be fitted in:");
                if(nilai >= Byte.MIN_VALUE && nilai <= Byte.MAX_VALUE)
                {
                    System.out.println("* Byte");
                }
                if(nilai >= Short.MIN_VALUE && nilai <= Short.MAX_VALUE)
                {
                    System.out.println("* Short");
                }
                if(nilai >= Integer.MIN_VALUE && nilai <= Integer.MAX_VALUE)
                {
                    System.out.println("* Int");
                }
                if(nilai >= Long.MIN_VALUE && nilai <= Long.MAX_VALUE)
                {
                    System.out.println("* Long");
                }
            }catch (Exception e) {
                System.out.println(sc.next()  + " can't be fitted anywhere.");
            }
        }

    }
}
