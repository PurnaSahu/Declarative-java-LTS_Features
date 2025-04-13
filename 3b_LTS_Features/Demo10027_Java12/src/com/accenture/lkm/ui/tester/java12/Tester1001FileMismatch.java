package com.accenture.lkm.ui.tester.java12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

// Make sure JRE compliance pointing to JRE12.
public class Tester1001FileMismatch {
    public static void main(String[] args) throws IOException {
    	//Check if the files are having same content.
    	// Java 9 - createTempFile() 
        Path filePath1 = Files.createTempFile("productinfo1", ".txt");
        Path filePath2 = Files.createTempFile("productinfo2", ".txt");
        
        // Java 11 - writeString()
        Files.writeString(filePath1, "IPad, IPhone, IPod");
        Files.writeString(filePath2, "IPad, IPhone, IPod");

        long mismatch = Files.mismatch(filePath1, filePath2);

        System.out.println("File Mismatch position... It returns -1 if there is no mismatch");

        System.out.println("Mismatch position in productinfo1 file and productinfo2 file is: " + mismatch);

        // Deleting files after checking for mismatch.
        filePath1.toFile().deleteOnExit();
        filePath2.toFile().deleteOnExit();

        System.out.println("-------------------------------------------------");

        Path filePath3 = Files.createTempFile("productinfo3", ".txt");
        Path filePath4 = Files.createTempFile("productinfo4", ".txt");
        
        Files.writeString(filePath3, "IPad, New IPhone, IPod");
        Files.writeString(filePath4, "IPad, IPhone, IPod");

        long mismatch2 = Files.mismatch(filePath3, filePath4);

        System.out.println("Mismatch position in productinfo3 file and productinfo4 file is: " + mismatch2);

        // Deleting files after checking for mismatch.
        filePath3.toFile().deleteOnExit();
        filePath4.toFile().deleteOnExit();
    }
}