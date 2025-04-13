package com.accenture.lkm.ui.tester.java9;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;  

//Make sure JRE compliance is pointing to Java 9.
public class Tester1003TryWithResources {  
    public static void main(String[] args) throws IOException { 
       FileOutputStream fileOutputStream1 = new FileOutputStream("productinfo7.txt");
       writeToTheFileJava7(fileOutputStream1);
       
       FileOutputStream fileOutputStream2 = new FileOutputStream("productinfo9.txt");
       writeToTheFileJava9(fileOutputStream2);
    }
    
    private static void writeToTheFileJava7(FileOutputStream fileOutputStream) {
   	 try(FileOutputStream fis = fileOutputStream)	{ 
           String productNames = "IPad, IPhone, IPod"; 
           byte bytes[] = productNames.getBytes();       
           fis.write(bytes);      
           System.out.println("The given products are written in the file successfully");           
       }catch(Exception e) {  
           System.out.println(e);  
       }
   }  
    
    private static void writeToTheFileJava9(FileOutputStream fileOutputStream) throws FileNotFoundException {
    	 try(fileOutputStream)	{ 
    		 String productNames = "IPad, IPhone, IPod"; 
             byte bytes[] = productNames.getBytes();          
            fileOutputStream.write(bytes);      
            System.out.println("The given products are written in the file successfully");           
        }catch(Exception e) {  
            System.out.println(e);  
        }
       
       
       //The resource declared outside the try block must be final or effectively final.
       //Uncomment below line and observe.
       //fileOutputStream = new FileOutputStream("newfile.txt");
    }  
}