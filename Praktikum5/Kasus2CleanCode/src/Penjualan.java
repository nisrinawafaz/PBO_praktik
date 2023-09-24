/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Penjualan {
    private String namaProduk;
    private int quantity;
    private float hargaTotal;
    
    public Penjualan(String namaProduk, int quantity, float hargaTotal){
        this.namaProduk = namaProduk;
        this.quantity = quantity;
        this.hargaTotal = hargaTotal;
        
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getHargaTotal() {
        return hargaTotal;
    }

    public void setHargaTotal(float hargaTotal) {
        this.hargaTotal = hargaTotal;
    }
}
