package mytools;

import java.io.FileWriter;

public class CounterFileCreator {
	public static void main(String[] args) {
		try {
			FileWriter writer = new FileWriter("C:\\Users\\NEXSOFT\\Desktop\\Counter.txt");
			for (Integer i = 1; i <= 30000; i++) {
				writer.write(i.toString());
				writer.write("\n");
			}
		} catch (Exception e) {
			System.out.println("Cannot Create File");
		}
		System.out.println("Success Created");
	}
}
