/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Employee  implements Sortable {
    public Employee(String n, double s, int day, int month, int year){ 
        name = n;
        salary = s;
        hireday = day;
        hiremonth = month;
        hireyear = year;
   }
   public void print(){ 
        System.out.println(name + " " + salary + " " + hireYear());
   }
   public void raiseSalary(double byPercent){ 
        salary *= 1 + byPercent / 100;
   }
   public int hireYear(){ 
        return hireyear;
   }
   
   private String name;
   private double salary;
   private int hireday;
   private int hiremonth;
   private int hireyear;

   @Override
   public int compare(Sortable b){
    Employee eb = (Employee) b;
    if (salary<eb.salary) return -1;
    if (salary>eb.salary) return +1;
    return 0;
    }

    @Override
    public void shell_sort(Sortable[] a) {
        int n = a.length;
        for (int interval = n / 2; interval > 0; interval /= 2) {
            for (int i = interval; i < n; i += 1) {
                Sortable temp = a[i];

                int j;
                for (j = i; j >= interval && a[j - interval].compare(temp) > 0; j -= interval) {
                    a[j] = a[j - interval];
                }
                a[j] = temp;
            }
        }
        }
    }

