/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.task2;

/**
 *
 * @author ASUS
 */
public abstract class Shape {
    private String shapeName;
    
    public Shape(String shapeName){
        this.shapeName = shapeName;
    }
    
    public abstract double area();
    
    public String toString()
    {
	String result = "Shape Name : " + this.shapeName;
	return result;
    }
}
