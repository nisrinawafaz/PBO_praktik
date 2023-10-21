/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.task2;

/**
 *
 * @author ASUS
 */
public class Rectangle extends Shape{
    private double length;
    private double width;
    
    public Rectangle(double length, double width ) {
        super("Rectangle ");
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        double result = length*width;
        return result;
    }
    
    @Override
    public String toString(){
        String result = super.toString()+  "of length " + length + " and of width " + width;
        return result;
    }
    
}
