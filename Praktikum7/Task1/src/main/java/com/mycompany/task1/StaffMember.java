/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.task1;

/**
 *
 * @author ASUS
 */
public abstract class StaffMember {
    protected String name;
    protected String address;
    protected String phone;
	
    public StaffMember(String eName, String eAddress, String ePhone) {
	name = eName;
	address = eAddress;
	phone = ePhone;
    }
	
	// returns basic employee info
    @Override
    public String toString() {
	String result = "Name: " + name + "\n";
	result += "Address: " + address + "\n";
	result += "Phone: " + phone;
	return result;
    }
	
    // children must implement the pay method
    public abstract double pay();
}
