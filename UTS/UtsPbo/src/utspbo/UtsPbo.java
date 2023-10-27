/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package utspbo;

/**
 *
 * @author ASUS
 * 
 * 
 */
import java.io.InputStream;
import java.io.InputStreamReader;
import com.google.gson.Gson;
public class UtsPbo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        InputStream inputStream = Delivery.class.getResourceAsStream("data.json");
        if (inputStream != null) {
            InputStreamReader reader = new InputStreamReader(inputStream);
            Delivery[] deliveries = new Gson().fromJson(reader, Delivery[].class);
            System.out.println(String.format("%-30s %-10s %-10s %-20s %-30s %-20s %s",
                    "Product Name", "Quantity", "Weight", "Destination", "Service Package", "Service Price" ,"Total"));
            
            int totalAmount = 0;
            for (Delivery delivery : deliveries) {
                int total = delivery.getQuantity() * delivery.getPriceItem()+ delivery.getServicePackage().getValue();
                totalAmount += total;
                System.out.println(String.format("%-30s %-10s %-10s %-20s %-30s %-20s %s",
                    delivery.getProductName(), delivery.getQuantity(), delivery.getWeight(), delivery.getCity().getDestination(), delivery.getServicePackage().getService(), delivery.getServicePackage().getValue() ,total));
    }
        } else {
            System.out.println("File not found.");
        }
    }
         
         
        
        
        
    }
