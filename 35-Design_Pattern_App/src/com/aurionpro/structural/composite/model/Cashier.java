package com.aurionpro.structural.composite.model;

public  class Cashier implements IEmployee{  
  
        private int id;  
            private String name;  
        private double salary;  
        public Cashier(int id,String name,double salary)  {  
            this.id=id;  
            this.name = name;  
            this.salary = salary;  
        }  
        @Override  
        public void add(IEmployee employee) {  
  
        }  
        @Override  
        public IEmployee getChild(int i) {  
           
            return null;  
        }  
        @Override  
        public int getId() {  
           
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
        }  
        @Override  
        public void remove(IEmployee employee) {  
 
        }  
} 
