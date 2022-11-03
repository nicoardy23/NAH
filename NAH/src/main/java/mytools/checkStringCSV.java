package mytools;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
/*
 * PROGRAM UNTUK CEK STRING DARI SUATU CSV
 */
class checkStringCSV{
    public static void main(String[] args) throws FileNotFoundException {
        File filetxt = new File("C:\\JobDocumentation\\Nexhub\\Master_Data\\Prefix\\CompanyProfile_RampUp6000\\log\\CSV_MD_CompanyProfile-Sorted - Copy.csv");
        Scanner scn = new Scanner(filetxt);
        // int counter = 0;
        // while(scn.hasNextLine()){
        //     for(int i=0;i<200;i++){

        //     }
        // }
        // System.out.println(counter);
        for(int i=1;i<=30000;i++){
            String keySearch = i + "|" ;
            if(!checkStringCSV.find(filetxt, keySearch)){
                System.out.println(i);
            }
        }
        System.out.println("pengecekan CSV selesai");
        // String search = ">2<";
        // System.out.println(checkString.find(filetxt, search));

    }
    public static boolean find(File f, String searchString) {
        boolean result = false;
        Scanner in = null;
        try {
            in = new Scanner(new FileReader(f));
            while(in.hasNextLine() && !result) {
                result = in.nextLine().indexOf(searchString) >= 0;
            }
        }
        catch(IOException e) {
            e.printStackTrace();      
        }
        finally {
            try { in.close() ; } catch(Exception e) { /* ignore */ }  
        }
        return result;
    }
}