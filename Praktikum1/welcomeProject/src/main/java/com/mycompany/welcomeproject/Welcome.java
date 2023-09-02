/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.welcomeproject;

/**
 *
 * @author ASUS
 */
public class Welcome
{
    public static void main(String[] args)
    {
        String greeting = "Welcome to Core Java!"; // menyimpan data berupa kalimat ke tipe data string
        System.out.println(greeting); // perintah untuk print, println berarti output selanjutnya akan berada di baris baru
        for (int i=0; i < greeting.length(); i++) // .length adalah fungsi untuk menghitung panjang suatu var
            System.out.print("=");
        System.out.println();
    }
}
