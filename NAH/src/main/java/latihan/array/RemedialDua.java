package latihan.array;

import java.util.Scanner;

public class RemedialDua {
	public static void main(String[] args) {
		int intTampung = 0;
		int intJumlahNilai;
		int intInput;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingin memasukkan berapa data?");
		intJumlahNilai = sc.nextInt();
		for(int i=0;i<intJumlahNilai;i++) {
			try {
				System.out.print("Masukkan Angka : ");
				intInput = sc.nextInt();
			} catch (Exception e) {
				System.out.println("Hanya boleh memasukkan angka");
				break;
			}
			intTampung = intTampung + intInput;
		}
		System.out.println("Jumlah nilai = "+intTampung);
	}
}
