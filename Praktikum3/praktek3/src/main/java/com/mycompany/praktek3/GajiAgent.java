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
public class GajiAgent {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        int gajiPokok = 500000;
        float bonus_penjualan = 0;
        float denda = 0;
        float bonusItem = input >=15 ?(float) (0.10 * (input * 50000)) :0;
        
        if(input >= 40)
        {
            bonus_penjualan= (float) (0.25 * (input *  50000));
            denda = 0;
        }
        else if(input > 80){
            bonus_penjualan = (float) (0.35 * (input *  50000));
            denda = 0;
        }
        else if( input < 15){
            input = 15 - input;
            bonus_penjualan = 0;
            denda = (float) (0.15 * (input * 50000));
        }
        int gaji = (int) (gajiPokok + bonus_penjualan + bonusItem - denda) ;
        System.out.println(gaji);
    }
    
    
}
