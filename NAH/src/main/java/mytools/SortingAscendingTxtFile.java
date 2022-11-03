package mytools;

import java.io.*;
import java.util.*;

/* ================================ */
/* PROGRAM SORTING DATA ON TXT FILE */
/* ================================ */
public class SortingAscendingTxtFile {
	public static void main(String[] args) throws Exception {
		try {
			/* READ FILE : PUT DIRECTORY FILE IN FileReader */
			BufferedReader reader = new BufferedReader(new FileReader("C:\\JobDocumentation\\Nexhub\\Master_Data\\Prefix\\CompanyProfile_RampUp6000\\log\\CSV_MD_CompanyProfile.txt"));
	        Map<String, String> map=new TreeMap<String, String>();
	        String line="";
	        while((line=reader.readLine())!=null){
	            map.put(getField(line),line);
	        }
	        reader.close();
	        try {
	        	/* CREATE FILE : PUT THE DIRECTORY AND FILE NAME THAT WOULD SAVED TO BE */
	        	FileWriter writer = new FileWriter("C:\\JobDocumentation\\Nexhub\\Master_Data\\Prefix\\CompanyProfile_RampUp6000\\log\\CSV_MD_CompanyProfile-Sorted.txt");
		        for(String val : map.values()){
		            writer.write(val);  
		            writer.write('\n');
		        }
		        writer.close();
			} catch (Exception e) {
				System.out.println("Cannot Create File!!");
			}
		} catch (Exception e) {
			System.out.println("Cannot Read File, doesn't exist!!");
		}
        System.out.print("Success Created!!");
    }

    private static String getField(String line) {
        return line.split(" ")[0];//extract value you want to sort on
    }
}
