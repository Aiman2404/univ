/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment_1;

/**
 *
 * @author Ayman
 */
public class Employee {
    private String firstName;
    private String lastName;
    private double monthleySalary;
    
    
    
    
    public Employee(String fName, String lName, double mSalary){
    
         firstName = fName;
         lastName = lName;
         
         if (mSalary > 0){
         
         monthleySalary = mSalary;
         
         
         }else{monthleySalary=0.0;}
    
    }
  
      public  String getfirstname(){
        return firstName;
    }
    
    public  void setfirstname(String fname){
        firstName = fname;
    }
    
    
     public  String getlastname(){
        return lastName;
    }
    
    public  void setlastname(String lname){
        lastName = lname;
    }
    
      public  double getmonthleySalary(){
        return monthleySalary;
    }
    
   public void setMonthlySalary( double Salary){
monthleySalary=Salary ;
if (Salary > 0) {
            monthleySalary = Salary;}
   }
 
   
   public double getYearSalary() {
        return monthleySalary * 12;
    }
   
   public void raiseSalary(double percentage) {
        if (percentage > 0) {
            monthleySalary += monthleySalary * percentage / 100;
        }
    }
}
   

