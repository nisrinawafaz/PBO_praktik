/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inheritance2;

/**
 *
 * @author ASUS
 */
public class Inheritance2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Shape s1 = new Shape();
        System.out.println("objek 1 tanpa argumen" + '\n' );
        System.out.println("Shape:"
        + " color=" + s1.getColor()
        + " filled=" + s1.isFilled());
        System.out.println(s1.toString());
        System.out.println('\n' );
        
        System.out.println("setelah perubahan dengan setter :" );
        s1.setColor("red");
        s1.setFilled(false);
        System.out.println(s1.toString());
        System.out.println('\n' );

        // Declare and allocate a new instance of cylinder
        // specifying height, with default color and radius
        System.out.println("objek 2 dengan argumen" + '\n' );
        Shape s2 = new Shape("Pink", false);
        System.out.println("Shape:"
        + " color=" + s2.getColor()
        + " filled=" + s2.isFilled());
        System.out.println(s2.toString());
        System.out.println('\n' );
        System.out.println("setelah perubahan dengan setter :" );
        s2.setColor("red");
        s2.setFilled(true);
        System.out.println(s2.toString());
    }
    
}
