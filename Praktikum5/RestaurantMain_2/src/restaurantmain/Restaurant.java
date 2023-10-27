/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurantmain;

/**
 *
 * @author ASUS
 */
public class Restaurant {
    private Makanan[] makanan;
    private static byte id=0;
    private Pemesanan[] pesanan;

    public Makanan[] getMakanan() {
        return makanan;
    }
    
    public Restaurant(){
        makanan = new Makanan[10];
        pesanan = new Pemesanan[10];
    }
    
    public void pemesanan(String nama_makanan, int kuantitas, byte id_pesan){
        byte a =0;
        boolean find =false;
        do{
            if(makanan[a].getNama_makanan().equals(nama_makanan)){
                find = true;
            }else{
                a++;
            }
        }while(find == false);
        if(this.isOutOfStock(a)){
            System.out.println("menu sudah habis");
        }else if(kuantitas > makanan[a].getStok()){
            System.out.println("stok tidak mencukupi");
        }else{
            this.tambahPesanan(a, kuantitas, id_pesan);
            makanan[a].setStok(kuantitas);
        }
    }
    
    public boolean isOutOfMenu(String nama_makanan){
        byte a =0;
        boolean find = false;
        do{
            if(makanan[a].getNama_makanan().equals(nama_makanan)){
                find = true;
            }else{
                a++;
            }
        }while(a <= this.id && find == false);
        
        return find;
    }
    
    public void tambahPesanan(byte id, int kuantitas, byte id_pesan){
        pesanan[id_pesan] = new Pemesanan( makanan[id].getNama_makanan(), makanan[id].getHarga_makanan(), kuantitas);
    }
     
    public void tambahMenuMakanan(String nama, double harga, int stok){
        makanan[id] = new Makanan( nama, harga, stok);
    }
    
    public void tampilMenuMakanan(){
        for(int i=0; i<=id; i++){
            if(!isOutOfStock(i)){
                System.out.println(makanan[i].getNama_makanan()+ "[" + makanan[i].getStok() + "]" + "\t Rp." + makanan[i].getHarga_makanan());
            }
        }
    }
    
    public void tampilHasilPemesanan(byte id_pesan){
        int totalBayar = 0;
        for(int i=0; i<=id_pesan; i++){
            System.out.println(pesanan[i].getNama_makanan()+ "(" + pesanan[i].getKuantitas() + ") dengan total = " + "\t Rp." + pesanan[i].getTotal());
            totalBayar +=  pesanan[i].getTotal();
        }
        System.out.println("total yang harus dibayarkan : " + totalBayar);
    }
    
    public boolean isOutOfStock(int id){
        if(makanan[id].getStok()==0 ){
            return true;
        }else{
            return false;
        }
    }
    
    public static void nextId(){
        id++;
    }
}

