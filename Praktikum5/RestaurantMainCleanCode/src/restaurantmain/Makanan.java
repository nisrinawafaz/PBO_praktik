/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurantmain;

/**
 *
 * @author ASUS
 */
public class Makanan {
    
    private String namaMakanan;
    private double hargaMakanan;

    public String getNamaMakanan() {
        return namaMakanan;
    }

    public void setNamaMakanan(String namaMakanan) {
        this.namaMakanan = namaMakanan;
    }

    public double getHargaMakanan() {
        return hargaMakanan;
    }

    public void setHargaMakanan(double hargaMakanan) {
        this.hargaMakanan = hargaMakanan;
    }
    private int stok;
    
    public Makanan(String namaMakanan, double hargaMakanan,int stok){
        this.namaMakanan = namaMakanan;
        this.hargaMakanan = hargaMakanan;
        this.stok = stok;
    }
    
    public int getStok() {
        return stok ;
    }

    public void setStok(int kuantitas) {
        this.stok = this.stok - kuantitas;
    }
    
}
