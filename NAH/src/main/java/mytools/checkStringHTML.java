package mytools;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
/*
 * PROGRAM UNTUK CEK HTML TEXT
 */
class checkStringHTML{
    public static void main(String[] args) throws FileNotFoundException {
        File filetxt = new File("./24_10/400/Inspect_Element_2.html");
        Scanner scn = new Scanner(filetxt);
        // int counter = 0;
        // while(scn.hasNextLine()){
        //     for(int i=0;i<200;i++){

        //     }
        // }
        // System.out.println(counter);
        for(int i=1;i<=300;i++){
            String keySearch = ">"+i+" | 2022";
            if(!checkStringHTML.find(filetxt, keySearch)){
                System.out.println(i);
            }
        }
        System.out.println("pengecekan HTML CHAT selesai");
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