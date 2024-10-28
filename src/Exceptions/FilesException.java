package Exceptions;

import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FilesException {

    public static void main(String[] args) {
       try {
    	   File files = new File("Non Existent Files.txt");
    	   FileReader fr = new FileReader(files);
       }
       catch (FileNotFoundException a) {
    	   System.out.println("Caught Exception"+ a);
       }
    }
}