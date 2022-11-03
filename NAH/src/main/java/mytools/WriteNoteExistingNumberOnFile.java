package mytools;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class WriteNoteExistingNumberOnFile {
	private static int data = 10;
	private static final int READ_CHAR = 5;
	public static void main(String[] args) throws Exception {
		/* This readerCSV to compare the datas with readerTXT file */
//		BufferedReader readerCSV = new BufferedReader(new FileReader("C:\\JobDocumentation\\Nexhub\\Counter.csv"));
		BufferedReader readerTXT = new BufferedReader(new FileReader("C:\\Users\\NEXSOFT\\Desktop\\TestWriteNumber.txt"));
		FileWriter writer = new FileWriter("C:\\Users\\NEXSOFT\\Desktop\\TestWriteNumber-SnW.txt");
//		String lineCSV = readerCSV.readLine();
		String line = readerTXT.readLine();
		String skip = null;
		for (Integer i = 1; i <= data; i++) {
			if (line.contains(i.toString())) {
				writer.write(line+" | Skipped |");
			} else {
				writer.write(i.toString());
			}
			writer.write("\n");
		}
//		while((skip = lineTXT) != null) {
//			if (!(lineTXT.contains(lineCSV))) {
//				writer.write(lineCSV);
//			} else {
//				writer.write(lineTXT);
//			}
//			writer.write("\n");
//		}
		
//		readerCSV.close();
		readerTXT.close();
		writer.close();
	}
}
