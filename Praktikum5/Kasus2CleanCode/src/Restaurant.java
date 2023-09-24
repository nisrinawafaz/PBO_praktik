
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Restaurant {
    private static final Logger logger = Logger.getLogger("Logger");
    private Produk[] produk;
    private static byte id=0;
    private Penjualan[] penjualan;

    public Produk[] getProduk() {
        return produk;
    }
    
    public Restaurant(){
        produk = new Produk[10];
        penjualan = new Penjualan[10];
    }
    
    public void pemesanan(String namaProduk, int kuantitas, byte idPesan){
        byte a =0;
        boolean find =false;
        do{
            if(produk[a].getNamaProduk().equals(namaProduk)){
                find = true;
            }else{
                a++;
            }
        }while(!find);
        if(this.isOutOfStock(a)){
            logger.log(Level.INFO, "menu sudah habis");
        }else if(kuantitas > produk[a].getQty()){
            logger.log(Level.INFO, "stok tidak mencukupi");
        }else{
            this.tambahPesanan(a, kuantitas, idPesan);
            produk[a].setQty(kuantitas);
        }
    }
    
    public boolean isOutOfMenu(String namaProduk){
        byte a =0;
        boolean find = false;
        do{
            if(produk[a].getNamaProduk().equals(namaProduk)){
                find = true;
            }else{
                a++;
            }
        }while(a <= id && !find);
        
        return find;
    }
    
    public float hitungHargaTotal(int kuantitas, double hargaProduk){
        return (float) (kuantitas * hargaProduk);
    }
    
    public void tambahPesanan(byte id, int kuantitas, byte idPesan){
        float hargaTotal;
        hargaTotal = hitungHargaTotal(kuantitas, produk[id].getHarga());
        penjualan[ idPesan] = new Penjualan( produk[id].getNamaProduk(),kuantitas,  hargaTotal );
    }
     
    public void tambahMenuMakanan(String nama, double harga, int stok){
        produk[id] = new Produk( nama, harga, stok);
    }
    
    public void tampilMenuMakanan(){
        for(int i=0; i<=id; i++){
            if(!isOutOfStock(i)){
                logger.log(Level.INFO, "{0}{1}.{2}[{3}]\t Rp.{4}", new Object[]{i, 1, produk[i].getNamaProduk(), produk[i].getQty(), produk[i].getHarga()});
            }
        }
    }
    
    private float totalBayar(float hargaTotal, float total){
        total += hargaTotal;
        
        return total;
    }
    public void tampilHasilPemesanan(byte idPesan){
        float total=0;
        for(int i=0; i<=idPesan; i++){
            logger.log(Level.INFO, "{0}({1}) dengan total = \t Rp.{2}", new Object[]{penjualan[i].getNamaProduk(), penjualan[i].getQuantity(), penjualan[i].getHargaTotal()});
            total = totalBayar(penjualan[i].getHargaTotal(), total);
        }
        logger.log(Level.INFO, "Total Pembayaran : {0}",total);
    }
    
    public boolean isOutOfStock(int id){
        return produk[id].getQty()==0;
    }
    
    public static void nextId(){
        id++;
    }
}
