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
public class operatorMenghitung {
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
        String[] simpan = new String[3];
        String input = in.nextLine();
        simpan= input.split(" ");
        int A  = Integer.parseInt(simpan[0]);
	int B  = Integer.parseInt(simpan[2]);
        int hasilHitung = 0;
        
        if((A >= 1 && A <= 1000) && (B >= 1 && B <= 1000))
        {
                switch (simpan[1]) {
                    case "+":
                        hasilHitung = A + B;
                        break;
                    case "-":
                        hasilHitung = A - B;
                        break;
                    case "*":
                        hasilHitung = A * B;
                        break;
                    case "/":
                        if(A%B != 0)
                        {
                            System.out.println("A tidak habis dibagi B");
                        }
                        else
                        {
                            hasilHitung = A / B;
                        }       break;
                    case "%":
                        hasilHitung = A % B;
                        break;
                    default:
                        break;
                }
            System.out.println(hasilHitung);
        }
        
    }
    
}
