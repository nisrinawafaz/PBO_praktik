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
        char again;
        byte id_pesan=0;
        boolean find;
        
        Scanner sc = new Scanner(System.in);
        Restaurant menu = new Restaurant();
        menu.tambahMenuMakanan("Bala-Bala", 1_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Gehu", 1_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Tahu", 1_000, 0);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Molen", 1_000, 20);
        
        
        do{
            menu.tampilMenuMakanan();
            System.out.print("Masukkan pesanan anda (ID menu) : ");
            String nama_menu = sc.nextLine();
            find = menu.isOutOfMenu(nama_menu);
            if(find){
                System.out.print("Masukkan kuantitas pesanan anda:");
                int kuantitas = sc.nextInt();
                menu.pemesanan(nama_menu, kuantitas, id_pesan);
            }else{
                System.out.println("menu tidak terdaftar");
            }
            System.out.print("apakah mau memesan kembali?");
            again = sc.next().charAt(0);
            if(again == 'y' || again == 'Y'){
                id_pesan +=1;
                sc.nextLine();
            }
        }while(again == 'y' || again == 'Y');
        System.out.println("");
        System.out.println("Berikut adalah pesanan anda :");
        menu.tampilHasilPemesanan(id_pesan);
    }
    
    
}
