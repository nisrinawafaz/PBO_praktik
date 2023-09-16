/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package upinipin;

/**
 *
 * @author ASUS
 */
public class Item {
    private String name;
    
    private Item() {
        name = "Ipin";
    }
    
    public Item(String name) { 
        this(); // karena Item() constructor private dan hanya bisa dipanggil di dalam class yang sama.
                //untuk dipanggil ke class yang beda di panggil dulu di constructor yang public
        System.out.println(this.name); // this karena variabelnya di dalam class tsersebut
    }
}
