/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.task2;

/**
 *
 * @author ASUS
 */
public class Paint {
    private double coverage;
    
    public Paint(double c) 
    {
	this.coverage = c;
    }
    
    public double amount(Shape s)
    {
        System.out.println("Computing amount for " + s);
        return s.area() / coverage;
    }
}
