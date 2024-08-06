package com.swabahav.test;

import java.util.Scanner;

public class CharacterShifter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String string = sc.next();

        System.out.println("Enter shifting value:");
        int shiftValue = sc.nextInt();

        char asciiCharacters[] = new char[string.length()];
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) >= 'a' && string.charAt(i) <= 'z') {
                if (string.charAt(i) + shiftValue > 'z') {
                    asciiCharacters[i] = (char) (string.charAt(i) + shiftValue - 26);
                } else {
                    asciiCharacters[i] = (char) (string.charAt(i) + shiftValue);
                }
            } else if (string.charAt(i) >= 'A' && string.charAt(i) <= 'Z') {
                if (string.charAt(i) + shiftValue > 'Z') {
                    asciiCharacters[i] = (char) (string.charAt(i) + shiftValue - 26);
                } else {
                    asciiCharacters[i] = (char) (string.charAt(i) + shiftValue);
                }
            } else {
           
                asciiCharacters[i] = string.charAt(i);
            }
        }

     
        String shiftedString = new String(asciiCharacters);
        System.out.println("String after shifting is: " + shiftedString);


    }
}
