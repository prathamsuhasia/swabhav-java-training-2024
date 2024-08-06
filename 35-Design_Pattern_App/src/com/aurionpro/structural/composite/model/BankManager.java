package com.aurionpro.structural.composite.model;
import java.util.ArrayList;  
import java.util.Iterator;  
import java.util.List;  

public class BankManager implements IEmployee {  
     private int id;  
     private String name;  
     private double salary;  
  
     public BankManager(int id,String name,double salary) {  
      this.id=id;      
      this.name = name;  
      this.salary = salary;  
     }  
         List<IEmployee> employees = new ArrayList<IEmployee>();  
     @Override  
     public void add(IEmployee employee) {  
        employees.add(employee);  
     }  
        @Override  
     public IEmployee getChild(int i) {  
      return employees.get(i);  
     }  
     @Override  
     public void remove(IEmployee employee) {  
      employees.remove(employee);  
     }    
     @Override  
     public int getId()  {  
      return id;  
     }  
     @Override  
     public String getName() {  
      return name;  
     }  
    @Override  
     public double getSalary() {  
      return salary;  
     }  
     @Override  
     public void print() {  
      System.out.println("==========================");  
      System.out.println("Id ="+getId());  
      System.out.println("Name ="+getName());  
      System.out.println("Salary ="+getSalary());  
      System.out.println("==========================");  
        
      Iterator<IEmployee> it = employees.iterator();  
        
          while(it.hasNext())  {  
            IEmployee employee = it.next();  
            employee.print();  
         }  
     }  
}
