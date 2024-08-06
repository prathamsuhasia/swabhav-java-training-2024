package com.aurionpro.test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		Set<Integer> set =  new HashSet<Integer>();
		LinkedHashSet<Integer> set1 = new LinkedHashSet();
		set.add(4);
		set.add(2);
		set.add(8);
		set.add(3);
		System.out.println(set);
		System.out.println(set.hashCode());
		System.out.println(set.contains(9));
		TreeSet<String> set2 =  new TreeSet();
		set2.add("Pratham");
		set2.add("Jateen");
		set2.add("Suhas");
		set2.add("Subodh");
		System.out.println(set2);
		TreeSet<String> set3 =  new TreeSet();
		set3.addAll(set2);
		System.out.println(set3);
		System.out.println(set3.size());
		System.out.println(set3.containsAll(set2));
		
		
		
		
		
	}
}
