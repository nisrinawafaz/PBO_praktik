/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Restaurant {
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
    
    public void pemesanan(String namaProduk, int kuantitas, byte id_pesan){
        byte a =0;
        boolean find =false;
        do{
            if(produk[a].getNama_produk().equals(namaProduk)){
                find = true;
            }else{
                a++;
            }
        }while(find == false);
        if(this.isOutOfStock(a)){
            System.out.println("menu sudah habis");
        }else if(kuantitas > produk[a].getQty()){
            System.out.println("stok tidak mencukupi");
        }else{
            this.tambahPesanan(a, kuantitas, id_pesan);
            produk[a].setQty(kuantitas);
        }
    }
    
    public boolean isOutOfMenu(String namaProduk){
        byte a =0;
        boolean find = false;
        do{
            if(produk[a].getNama_produk().equals(namaProduk)){
                find = true;
            }else{
                a++;
            }
        }while(a <= this.id && find == false);
        
        return find;
    }
    
    public float hitungHargaTotal(int kuantitas, double hargaProduk){
        return (float) (kuantitas * hargaProduk);
    }
    
    public void tambahPesanan(byte id, int kuantitas, byte id_pesan){
        float harga_total;
        harga_total = hitungHargaTotal(kuantitas, produk[id].getHarga());
        penjualan[id_pesan] = new Penjualan( produk[id].getNama_produk(),kuantitas,  harga_total );
    }
     
    public void tambahMenuMakanan(String nama, double harga, int stok){
        produk[id] = new Produk( nama, harga, stok);
    }
    
    public void tampilMenuMakanan(){
        for(int i=0; i<=id; i++){
            if(!isOutOfStock(i)){
                System.out.println((i+1) +"." + produk[i].getNama_produk()+ "[" + produk[i].getQty() + "]" + "\t Rp." + produk[i].getHarga());
            }
        }
    }
    
    private float totalBayar(float hargaTotal, float total){
        total += hargaTotal;
        
        return total;
    }
    public void tampilHasilPemesanan(byte id_pesan){
        float total=0;
        for(int i=0; i<=id_pesan; i++){
            System.out.println(penjualan[i].getNama_produk()+ "(" + penjualan[i].getQuantity() + ") dengan total = " + "\t Rp." + penjualan[i].getHarga_total());
            total = totalBayar(penjualan[i].getHarga_total(), total);
        }
        System.out.println("Total Pembayaran :" + total);
    }
    
    public boolean isOutOfStock(int id){
        if(produk[id].getQty()==0 ){
            return true;
        }else{
            return false;
        }
    }
    
    public static void nextId(){
        id++;
    }
}
