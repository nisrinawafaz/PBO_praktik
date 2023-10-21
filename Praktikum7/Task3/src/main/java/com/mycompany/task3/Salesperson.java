/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.task3;

/**
 *
 * @author ASUS
 */
public class Salesperson implements Comparable {

    private String firstName, lastName;
    private int totalSales;

    public Salesperson(String first, String last, int sales) {
        firstName = first;
        lastName = last;
        totalSales = sales;
    }

    public String toString() {
        return lastName + ", " + firstName + ":  \t" + totalSales;
    }

    public boolean equals(Object other) {
        return (lastName.equals(((Salesperson) other).getLastName())
                && firstName.equals(((Salesperson) other).getFirstName()));
    }

    @Override
    public int compareTo(Object other) {
        // TODO Auto-generated method stub
        int result;
        if(totalSales < ((Salesperson)other).totalSales){
            result = -1;
        }
        else if(totalSales > ((Salesperson)other).totalSales){
            result = 1;
        }else{
            if(firstName.compareTo(((Salesperson)other).firstName) > 0){
                result = -1;
            }
            else{
                    result = 1;
            }
        }
        return result;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getTotalSales() {
        return totalSales;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setTotalSales(int totalSales) {
        this.totalSales = totalSales;
    }
}
