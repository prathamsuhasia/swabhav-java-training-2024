package com.aurionpro.list;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList();
		System.out.println(names.size());
		System.out.println(names);
		names.add("Pratham");
		names.add("Suhas");
		names.add("jateen");
		names.add("Subodh");
		System.out.println(names);
		names.clear();
		System.out.println(names);
		names.add("Pratham");
		names.add("Suhas");
		names.add("jateen");
		names.add("Subodh");
		System.out.println(names.equals(names));
		System.out.println(names.hashCode());
		System.out.println(names.get(2));
		System.out.println(names.isEmpty());
		
		
		
	}
}
