package com.aurionpro.test;

import java.io.File;
import java.io.IOException;

public class FileDemo {
	public static void main(String[] args) throws IOException {

		File file = new File("D:\\aurionpro\\16-stream-app\\src\\com\\aurionpro\\test\\myfile3.txt");

		if (!file.exists()) {

			boolean created = file.createNewFile();
			if (created) {
				System.out.println("File created: " + file.getName());
			} else {
				System.out.println("File already exists.");
			}
		}

		System.out.println("Absolute path: " + file.getAbsolutePath());
		System.out.println("Path: " + file.getPath());
		System.out.println("Name: " + file.getName());
		System.out.println("Parent: " + file.getParent());
		System.out.println("Exists: " + file.exists());
		System.out.println("Is directory: " + file.isDirectory());
		System.out.println("Is file: " + file.isFile());
		System.out.println("Is absolute: " + file.isAbsolute());
		System.out.println("Is hidden: " + file.isHidden());
		System.out.println("Last modified: " + file.lastModified());
		System.out.println("Length: " + file.length() + " bytes");

		File renamedFile = new File("myfile3_renamed.txt");
		if (file.renameTo(renamedFile)) {
			System.out.println("File renamed to: " + renamedFile.getName());
		} else {
			System.out.println("Failed to rename file.");
		}

	}
}
