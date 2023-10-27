
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class RestaurantMain {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        char again;
        byte id_pesan=0;
        boolean find;
        
        Scanner sc = new Scanner(System.in);
        Restaurant menu = new Restaurant();
        
        String[] namaProduk ={
            "Bala-Bala", "Gehu", "Tempe", "Molen", "Risol",
            "Nasi Goreng", "Onde-Onde", "Air Mineral", "Makaroni", "Coklat"
        };
        double[] harga ={
            1_500, 1_500, 1_500, 2_000, 3_000,
            10_000, 1_000, 2_500, 3_000, 5_000
        };
        int[] qty = {
            20,10, 5, 10, 9,
            3, 10, 5, 15, 20
        };
        
        for(int i=0; i<10; i++){
            menu.tambahMenuMakanan(namaProduk[i], harga[i], qty[i]);
            if(i < 9){
                menu.nextId();
            }
        }
        
        System.out.println("Daftar Menu : ");
        System.out.println("=============================================== ");
        
        do{
            menu.tampilMenuMakanan();
            System.out.print("Masukkan pesanan anda (Nama menu) : ");
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
