package com.aurionpro.test;

enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}

public class EnumDemo {
    public static void main(String[] args) {
        Day today = Day.WEDNESDAY;

       
        System.out.println("Name: " + today.name());

      
        System.out.println("Ordinal: " + today.ordinal());

     
        Day anotherDay = Day.FRIDAY;
        System.out.println("CompareTo FRIDAY: " + today.compareTo(anotherDay));


        System.out.println("Equals MONDAY: " + today.equals(Day.MONDAY));


        System.out.println("Declaring Class: " + today.getDeclaringClass());


        System.out.println("ToString: " + today.toString());


        Day dayFromString = Day.valueOf("MONDAY");
        System.out.println("Day from String: " + dayFromString);


        Day[] allDays = Day.values();
        System.out.println("All Days:");
        for (Day day : allDays) {
            System.out.println(day);
        }
    }
}
