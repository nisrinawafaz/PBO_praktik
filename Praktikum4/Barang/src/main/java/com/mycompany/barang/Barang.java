/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.barang;

/**
 *
 * @author ASUS
 */
public class Barang {

    String kode_barang;
    String nama_barang;
    private int stok;
    
    public Barang(String kode, String nama, int stk) { 
    kode_barang = kode;
    nama_barang = nama; 
    stok = stk;
    }
    
    public void addStok(int stk){
        this.stok += stk;
    }
    
    public int getStok(){
        return stok;
    }
}
