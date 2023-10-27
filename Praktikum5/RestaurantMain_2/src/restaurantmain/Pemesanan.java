/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurantmain;

/**
 *
 * @author ASUS
 */
public class Pemesanan {
    private String nama_makanan;
    private double harga_makanan;
    private int kuantitas;
    private float total;
    
    public Pemesanan(String nama_makanan, double harga_makanan, int kuantitas){
        this.nama_makanan = nama_makanan;
        this.harga_makanan = harga_makanan;
        this.kuantitas = kuantitas;
        this.total = (float) kuantitas * (float)harga_makanan;
        
    }

    public String getNama_makanan() {
        return nama_makanan;
    }

    public void setNama_makanan(String nama_makanan) {
        this.nama_makanan = nama_makanan;
    }

    public void setHarga_makanan(double harga_makanan) {
        this.harga_makanan = harga_makanan;
    }
    
    public double getHarga_makanan() {
        return harga_makanan;
    }

    public int getKuantitas() {
        return kuantitas;
    }

    public void setKuantitas(int kuantitas) {
        this.kuantitas = kuantitas;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    
}
