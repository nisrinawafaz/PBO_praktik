/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.case3;

/**
 *
 * @author ASUS
 */
public class MathUtils {

    public static int factorial(int n) throws IllegalArgumentException {
        int fac = 1;
        
        if(n < 0){
            throw new IllegalArgumentException("Faktorial tidak bisa menghitung bilangan negative seperti " + n);
        }
        else if(n >16){
            throw new IllegalArgumentException("Faktorial tidak bisa menghitung nilai lebih dari 16 seperti " + n);
        }
        for (int i = n; i > 0; i--) {
            fac *= i;
        }
        return fac;
    }
}
