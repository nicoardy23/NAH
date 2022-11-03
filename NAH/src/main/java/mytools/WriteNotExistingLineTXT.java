package mytools;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class WriteNotExistingLineTXT {
	public static void main(String[] args) throws Exception {
		/* Put input and output file source  */
		String inputFile = "C:\\Users\\NEXSOFT\\Desktop\\TestWriteNumber.txt";
		String outputFile = "C:\\Users\\NEXSOFT\\Desktop\\TestWriteNumber-SnW.txt";
		try {
			BufferedReader reader = new BufferedReader(new FileReader(inputFile));
			String line = "";
			int lineCount = 1;
			while(reader.readLine()!=null) lineCount++;
			reader.close();
			try {
				reader = new BufferedReader(new FileReader(inputFile));
				FileWriter writer = new FileWriter(outputFile);
				for (int i = 1; i <= lineCount; i++) {
					line = reader.readLine();
					if (line.contains(String.format("%05d", i))) {
						System.out.println(line);
						writer.write(line);
					} else {
						System.out.println(line);
						System.out.println(String.format("%05d", i)+"|Datas is Not Exist|");
						writer.write(String.format("%05d", i)+"|Datas is Not Exist|");
						i+=1;
					}
					writer.write("\n");
					
				}
				reader.close();
				writer.close();
			} catch (Exception e) {
				System.out.println("Error : Cannot Write Content!");
				System.out.println(e);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Error : Cannot Read Content!");
			System.out.println(e);
		}
	}
}
