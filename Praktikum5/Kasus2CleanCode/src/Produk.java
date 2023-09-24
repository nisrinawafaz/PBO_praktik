/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Produk {
    
    private String namaProduk;
    private double harga;
    private int qty;
    
    public Produk(String namaProduk, double harga,int qty){
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.qty = qty;
    }
    
    public String getNamaProduk() {
        return namaProduk;
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty -= qty;
    }
    
    
    
}
