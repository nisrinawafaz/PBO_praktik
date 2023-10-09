/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance2;

/**
 *
 * @author ASUS
 */
public class Square extends Rectangle{
    public Square(){
        super(1.0, 1.0);
    }
    public Square(double side){
        super(side, side);
    }
    public Square(double side, String color, boolean filled){
        super(side, side, color,filled);
    }
    
    @Override
    public double getArea() {
        return super.getLength() * super.getWidth();
    }
    
    @Override
    public double getPerimeter(){
        return 4 * (super.getWidth());
    }
    
    @Override
    public String toString(){
        return "A Square with side=" + super.getWidth() + 
                "which is a subclass of" + super.toString();
    }
    
    @Override
    public void setWidth(double side) {
        super.setWidth(side);
    }
    
    @Override
    public void setLength(double side) {
        super.setLength(side);
    }
}
