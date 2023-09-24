/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Penjualan {
    private String nama_produk;
    private int quantity;
    private float harga_total;
    
    public Penjualan(String nama_produk, int quantity, float harga_total){
        this.nama_produk = nama_produk;
        this.quantity = quantity;
        this.harga_total = harga_total;
        
    }

    public String getNama_produk() {
        return nama_produk;
    }

    public void setNama_produk(String nama_produk) {
        this.nama_produk = nama_produk;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getHarga_total() {
        return harga_total;
    }

    public void setHarga_total(float harga_total) {
        this.harga_total = harga_total;
    }
}
