/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package restaurantmain;

import java.util.Scanner;
import java.util.logging.Logger;
import java.util.logging.Level;

/**
 *
 * @author ASUS
 */
public class RestaurantMain {
    private static final Logger logger = Logger.getLogger("Logger");
    public static void main(String[] args) {
        String namaMenu;
        int kuantitas;
        
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
        logger.log(Level.INFO, "Masukkan pesanan anda (Nama Makanan) :");
        namaMenu = sc.nextLine();
        logger.log(Level.INFO, "Masukkan kuantitas pesanan anda:");
        kuantitas = sc.nextInt();
        menu.pemesanan(namaMenu, kuantitas);
        menu.tampilMenuMakanan();
    }
    
    
}
