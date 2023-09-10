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
public class FormattingOutput {
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	//menangkap 3 inputan
	String [][] simpan = new String[3][];
		
	//split inputan dan kirim ke variable store
	for(int i=0; i<3; i++) {
            String input = in.nextLine();
            simpan[i]= input.split(" ");
	}
		
	System.out.println("================================"); 
	for(String[] arrayInput:simpan) {
            if((arrayInput[0].length()<=10) && (Integer.parseInt(arrayInput[1]) >= 0 && Integer.parseInt(arrayInput[1])<=999) ) {
		System.out.printf("%-15s%03d\n", arrayInput[0],Integer.parseInt(arrayInput[1]));
            }else{
		System.out.println("Inputan tidak Sesuai");
            }
	}
	System.out.println("================================");
	}
}
