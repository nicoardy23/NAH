package ujian.ujiankelima.jf;

import java.util.Scanner;

public class HitungMath {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nilaiMathSatu;
		String nilaiMathDua;
		String hitungLagi;
		do {
			try {
				System.out.println("==========================");
				System.out.println("====== PROGRAM MATH ======");
				System.out.println("==========================");
				System.out.print("Masukkan nilai pertama : ");
				nilaiMathSatu = sc.nextLine();
				System.out.print("Masukkan nilai kedua : ");
				nilaiMathDua = sc.nextLine();
				Double nilaiDoubSatu = Double.parseDouble(nilaiMathSatu);
				Double nilaiDoubDua = Double.parseDouble(nilaiMathDua);
				Integer nilaiIntSatu = Integer.parseInt(nilaiMathSatu);
				Integer nilaiIntDua = Integer.parseInt(nilaiMathDua);
				System.out.println("================================");
				System.out.println("=== 1. Pangkat : "+Math.pow(nilaiDoubSatu, nilaiDoubDua));
				System.out.println("=== 2. Max : "+Math.max(nilaiDoubSatu, nilaiDoubDua));
				System.out.println("=== 3. Min : "+Math.min(nilaiDoubSatu, nilaiDoubDua));
				System.out.println("=== 4. Kali : "+Math.multiplyExact(nilaiIntSatu, nilaiIntDua));
				System.out.println("=== 5. Tambah : "+Math.addExact(nilaiIntSatu, nilaiIntDua));
				System.out.println("=== 5. Kurang : "+Math.subtractExact(nilaiIntSatu, nilaiIntDua));
				System.out.println("================================");
				
			} catch (Exception e) {
				System.out.println("===================");
				System.out.println("Format Nilai Salah!");
				System.out.println("===================");
			}
			System.out.println("Mau coba lagi ? (y/n)");
			hitungLagi = sc.nextLine();
		} while (hitungLagi == "y");
		System.out.println("=== TERIMA KASIH ===");

	}
}
