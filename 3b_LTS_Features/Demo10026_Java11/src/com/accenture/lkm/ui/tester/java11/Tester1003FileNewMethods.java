package com.accenture.lkm.ui.tester.java11;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

//Note: Make sure jre compliance is Java 11. 
public class Tester1003FileNewMethods {
	//Write product names to the file and read back.
	public static void main(String[] args) throws IOException {
		File productInfo = new File("productInfo.txt");
		
		//Creates a new file if not exist and writes the contents.
		//If file already exists, overwrites the contents.
		Files.writeString(productInfo.toPath(), "IPad, IPhone, IPod");
		
		//Append the contents if file exist or creates a new file.
		//Uncomment below line and comment above line. -> Files.writeString(productInfo.toPath(), "IPad, IPhone, IPod");
		//Files.writeString(productInfo.toPath(), "IPad, IPhone, IPod", StandardOpenOption.APPEND);
		
		String productNames = Files.readString(productInfo.toPath());
		System.out.println(productNames);
	}
}

	