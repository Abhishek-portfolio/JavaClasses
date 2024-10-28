package Exceptions;

import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class NotFound {

    public static void main(String[] args) {
        // Specify the path to the file
        String filePath = "C:\\Users\\Admin\\Desktop\\Java"; // Update this to your actual file path
        
        // Create a File object
        File file = new File(filePath);
        
        try {
            // Attempt to create a FileReader for the specified file
            FileReader fileReader = new FileReader(file);
            System.out.println("File found! Reading contents...");
            // You can add code here to read from the file if needed
            
            // Close the FileReader (not shown here for brevity)
            fileReader.close();
        }
        catch (FileNotFoundException e) 
        {
            // Handle the case where the file does not exist
            System.out.println("File not found: " + e.getMessage());
        }
        catch 
        (Exception e) {
            // Handle any other exceptions
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}