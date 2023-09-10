/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktek3;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class bukaTutupJalan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String simpan = in.next() + in.next() + in.next() + in.next();
        
        if((Long.parseLong(simpan) - 999999)% 5 == 0 )
        {
            System.out.println("Jalan ");
        }
        else
        {
            System.out.println("Berhenti");
        }
    }
    
    
}
