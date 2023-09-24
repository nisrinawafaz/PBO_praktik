/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurantmain;

import java.util.logging.Logger;
import java.util.logging.Level;
/**
 *
 * @author ASUS
 */
public class Restaurant {
    private static final Logger logger = Logger.getLogger("Logger");
    private Makanan[] makanan;
    private static byte id=0;

    public Makanan[] getMakanan() {
        return makanan;
    }
    
    public Restaurant(){
        makanan = new Makanan[10];
    }
    
    public void pemesanan(String namaMakanan, int kuantitas){
        byte a =0;
        boolean find =false;
        do{
            if(makanan[a].getNamaMakanan().equals(namaMakanan)){
                find = true;
            }else{
                a++;
            }
        }while(!find);
        if(this.isOutOfStock(a)){
            logger.log(Level.INFO, "menu sudah habis");
        }else if(kuantitas > makanan[a].getStok()){
            logger.log(Level.INFO, "stok tidak mencukupi");
        }else{
            makanan[a].setStok(kuantitas);
        }
    }
    
    
    public void tambahMenuMakanan(String nama, double harga, int stok){
        makanan[id] = new Makanan( nama, harga, stok);
    }
    
    public void tampilMenuMakanan(){
        for(int i=0; i<=id; i++){
            if(!isOutOfStock(i)){
                logger.log(Level.INFO, "{0}[{1}]\t Rp.{2}", new Object[]{makanan[i].getNamaMakanan(), makanan[i].getStok(), makanan[i].getHargaMakanan()});
            }
        }
    }
    
    public boolean isOutOfStock(int id){
        return makanan[id].getStok()==0;
    }
    
    public static void nextId(){
        id++;
    }
}

