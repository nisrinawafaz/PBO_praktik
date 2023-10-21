/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.task2;

/**
 *
 * @author ASUS
 */
public class Cylinder extends Shape{
    
    private double radius;
    private double height;
    
    public Cylinder(double radius, double height ) {
        super("Cylinder ");
        this.height = height;
        this.radius = radius;
    }

    @Override
    public double area() {
        double result = Math.PI *Math.pow(radius, 2)*height;
        return result;
    }
    
    @Override
    public String toString(){
        String result = super.toString()+  "of radius " + radius + " and of height " + height;
        return result;
    }
    
}
