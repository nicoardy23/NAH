package ujian.ujiankelima.jf;

import java.io.FileInputStream;

public class IOException {
	public static void main(String[] args) {
		FileInputStream inputFile = null;
		try {
			inputFile = new FileInputStream("C:\\Users\\NEXSOFT\\Desktop\\Bootcamp\\Note\\D55.txt");
	        inputFile.close();
	        
		} catch (Exception e) {
			System.out.println("FILE TIDAK DITEMUKAN!!! " + e);	
		}
		if (inputFile!=null) {				
			System.out.println("FILE DITEMUKAN!!!");
		}
    }
}