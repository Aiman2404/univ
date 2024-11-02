/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment_1;

/**
 *
 * @author Ayman
 */
public class Assignment_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


 Employee obj1 = new Employee("Aiman", "JIhan", 1000);
 Employee obj2 = new Employee("Muhammed", "Yassin", 2000);



 System.out.println("Name                 Yearly Salary");
        System.out.println("----                 -------------");
        System.out.println(obj1.getfirstname() + " " + obj1.getlastname() + "             $" + obj1.getYearSalary());
        System.out.println(obj2.getfirstname() + " " + obj2.getlastname() + "         $" + obj2.getYearSalary());

        System.out.println("\n10 Raised Salary :-\n");
        obj1.raiseSalary(10);
        obj2.raiseSalary(10);

        System.out.println("Name                  Yearly Salary");
        System.out.println("----                 -------------");
        System.out.println(obj1.getfirstname() + " " + obj1.getlastname() + "             $" + obj1.getYearSalary());
        System.out.println(obj2.getfirstname() + " " + obj2.getlastname() + "         $" + obj2.getYearSalary());
    
    }
}


    
    

