package com.aurionpro.test;

public class StringClassDemo {
	public static void main(String[] args) {
//		String name1 = "at";
//		String name2 = "at";
//		// at is stored as an object in the heap memory so name1 and name2 have same
//		// hashcode
//		System.out.println(name1.hashCode());
//		System.out.println(name2.hashCode());
//		System.out.println(name1 == name2);
//
//		String name3 = "b";
//		// hashcode changing after modifying
//		System.out.println(name3.hashCode());
//		name3 = name3 + "m";
//		System.out.println(name3.hashCode());
//		 String string1 = new String("at");
//		 String string2 = new String("at");
////		 2 different objects so false
//		 System.out.println(string1==string2);
//
//		StringBuffer name4 = new StringBuffer("Pratham");
//		System.out.println(name4.hashCode());
//		name4 = name4.append("Suwasia");
//		System.out.println(name4.hashCode());
//		
		StringBuilder name5 = new StringBuilder("Pratham");
		System.out.println(name5.hashCode());
		name5 = name5.append("Suwasia");
		System.out.println(name5.hashCode());
	}
}
