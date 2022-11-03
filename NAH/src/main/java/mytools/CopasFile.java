package mytools;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * copas FILE DENGAN BANYAKNYA N FILE
 */
public class CopasFile {

    public static void main(String args[]) throws IOException {    
        String copySource = "./fileUpload/copied001.pdf";
        // String enumStr;
        // String copyDestination = "./example-copied.txt";
        for (int i = 2; i <= 400; i++) {
            String enumStr="./"+"fileUpload/"+"copied"+String.format("%03d" , i)+".pdf";
            
            // String a = "./"+"copied"+i+".pdf";
            copasFile(copySource, enumStr);
        }
        
    }
    public static void copasFile(String coSource,String coDest){
        try {
            Files.copy(Paths.get(coSource), Paths.get(coDest));
        } catch (Exception e) {
            System.out.println("Could not copy the file to the destination: " + ". Check if the folder or file already exists.");
        }
        System.out.println("2nd File copied");
    }
}