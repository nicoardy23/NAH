package remedial;

import java.util.Scanner;

public class Remedial {
	public static void main(String[] args)throws Exception {
		Scanner sc = new Scanner(System.in);
		int intToken = 1;
		int tampung = 0;
		int intInput;
		for (int i = 0; i < intToken; i++) {
			System.out.print("Masukkan angka : ");
			try {
				intInput = sc.nextInt();
			} catch (Exception e) {
				System.out.println("Input Selesai, Berikut Adalah Hasilnya");
				break;
			}
			intToken++;
			tampung = tampung + intInput;
		}
		System.out.println("Jumlah = " + tampung);
		
	}
	
}
