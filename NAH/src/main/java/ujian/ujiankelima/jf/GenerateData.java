package ujian.ujiankelima.jf;

import java.util.Random;
import java.util.Scanner;

public class GenerateData {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		int indexAwal = rand.nextInt(0, 10);
		int indexAkhir = rand.nextInt(20, 50);
		int jumlahData;
		int dataInt;
		double dataDoub;
		int x = 0;
		do {
			System.out.println("=========================================");
			System.out.println("======== Generator Data Integer =========");
			System.out.println("=========================================");
			jumlahData = rand.nextInt(indexAwal, indexAkhir);
			dataDoub = rand.nextDouble();
			for(int i=0;i<jumlahData;i++)
			{
				dataInt = rand.nextInt(indexAwal, indexAkhir);
				System.out.println("Data Integer = " + dataInt);
			}
			System.out.println("=========================================");
			System.out.println("========= Generate Data Double ==========");
			System.out.println("=========================================");
			for(int i=0;i<jumlahData;i++)
			{
				dataDoub = rand.nextDouble(indexAwal, indexAkhir);
				System.out.println("Data Double = " + dataDoub);
			}
			System.out.println("---------------------------------");
			System.out.print("Masukkan 1 untuk berhenti : ");
			int inputNum = sc.nextInt();
			if (inputNum == 1) {
				System.out.println("Terima Kasih");
				x++;
			}
		} while (x != 1);
	}
}
