/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package restaurantmain;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class RestaurantMain {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Restaurant menu = new Restaurant();
        menu.tambahMenuMakanan("Bala-Bala", 1_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Gehu", 1_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Tahu", 1_000, 0);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Molen", 1_000, 20);
        menu.tampilMenuMakanan();
        
        System.out.print("Masukkan pesanan anda (Nama Makanan) : ");
        String nama_menu = sc.nextLine();
        System.out.print("Masukkan kuantitas pesanan anda:");
        int kuantitas = sc.nextInt();
        menu.pemesanan(nama_menu, kuantitas);
        menu.tampilMenuMakanan();
    }
    
    
}
