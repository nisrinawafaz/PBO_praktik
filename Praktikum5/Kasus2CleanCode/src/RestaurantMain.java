
import java.util.Scanner;
import java.util.logging.Logger;
import java.util.logging.Level;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class RestaurantMain {
    private static final Logger logger = Logger.getLogger("Logger");
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        char again;
        byte idPesan=0;
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
        logger.log(Level.INFO, "Daftar Menu : ");
        logger.log(Level.INFO, "=========================================================");
        
        do{
            menu.tampilMenuMakanan();
            logger.log(Level.INFO, "Masukkan pesanan anda (nama menu) : ");
            String namaMenu = sc.nextLine();
            find = menu.isOutOfMenu(namaMenu);
            if(find){
                logger.log(Level.INFO, "Masukkan kuantitas pesanan anda:");
                int kuantitas = sc.nextInt();
                menu.pemesanan(namaMenu, kuantitas, idPesan);
            }else{
                logger.log(Level.INFO, "menu tidak terdaftar");
            }
            logger.log(Level.INFO, "apakah mau memesan kembali?");
            again = sc.next().charAt(0);
            if(again == 'y' || again == 'Y'){
                idPesan +=1;
                sc.nextLine();
            }
        }while(again == 'y' || again == 'Y');
        logger.log(Level.INFO, "Berikut adalah pesanan anda :");
        menu.tampilHasilPemesanan(idPesan);
    }
    
}
