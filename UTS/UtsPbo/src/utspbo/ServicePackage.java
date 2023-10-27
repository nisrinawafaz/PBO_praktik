/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utspbo;

/**
 *
 * @author ASUS
 */
public class ServicePackage {

    private String service;
    private int value;
    
    public ServicePackage(String service, int value){
        this.service = service;
        this.value = value;
    }
    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    
}
