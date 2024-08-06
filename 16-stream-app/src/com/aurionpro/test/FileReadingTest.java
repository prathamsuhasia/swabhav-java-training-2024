package com.aurionpro.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileReadingTest {
	public static void main(String[] args) throws IOException {

		FileInputStream fileInputStream = new FileInputStream(
				"D:\\aurionpro\\16-stream-app\\src\\com\\aurionpro\\test\\myfile");
		FileOutputStream fileOutputStream = new FileOutputStream(
				"D:\\aurionpro\\16-stream-app\\src\\com\\aurionpro\\test\\myfile2");
		int ch;

		while ((ch = fileInputStream.read()) != -1) {
			fileOutputStream.write(ch);
		}
		System.out.println("File Copied successfully");
		fileInputStream.close();

	}

}
