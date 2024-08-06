package com.aurionpro.test;

import java.io.FileInputStream;
import java.io.IOException;

public class FileStatistics {
    public static void main(String[] args) throws IOException {

        String file = "D:\\aurionpro\\16-stream-app\\src\\com\\aurionpro\\test\\myfile";
        FileInputStream fileInputStream = new FileInputStream(file);
        int ch;
        int characterCount = 0;
        int wordCount = 0;
        int lineCount = 1;
        boolean inWord = false;

        while ((ch = fileInputStream.read()) != -1) {

            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                characterCount++;
            }

            if (ch == '\n') {
                lineCount++;
            }


            if (Character.isWhitespace(ch)) {
                if (inWord) {
                    wordCount++;
                    inWord = false;
                }
            } else {
                inWord = true;
            }
        }

    
        if (inWord) {
            wordCount++;
        }

        fileInputStream.close();

        System.out.println("Letters: " + characterCount);
        System.out.println("Words: " + wordCount);
        System.out.println("Lines: " + lineCount);
    }
}
