package test.tugaschar;
import java.util.Scanner;

public class FinalChar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hitung = 0;
		
		// input :  07a45te312qw6M-8so9
		System.out.print("Masukkan nilai : ");
		String strInput = sc.nextLine();
		
		for(int i=0; i<strInput.length(); i++) {
			Character chAngka = strInput.charAt(i);
			if(chAngka>47 && chAngka<58) {
				hitung = hitung + (chAngka-46);
			}
		}
		System.out.println(hitung);
	}
}
