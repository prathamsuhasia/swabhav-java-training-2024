package com.aurionpro.structural.composite.model;

public interface IEmployee {
	public int getId();

	public String getName();

	public double getSalary();

	public void print();

	public void add(IEmployee employee);

	public void remove(IEmployee employee);

	public IEmployee getChild(int i);
	
	
}