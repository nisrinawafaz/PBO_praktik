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

    public Makanan[] getMakanan() {
        return makanan;
    }
    
    public Restaurant(){
        makanan = new Makanan[10];
    }
    
    public void pemesanan(String nama_makanan, int kuantitas){
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
            makanan[a].setStok(kuantitas);
        }
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

