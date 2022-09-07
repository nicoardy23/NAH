package ujian.ujianminggukedua;

public class Aritmatika {
	public int addPenjumlahanActual(int x, int y) {
		int hasilHitung = (x*2+y*2)/2;
		System.out.println("Hasil penjumlahan actual ==> "+hasilHitung);
		return hasilHitung;
	}
	
	public int addPenjumlahanExpect(int x, int y) {
		int hasilHitung = x+y;
		System.out.println("Hasil penjumlahan expect ==> "+hasilHitung);
		return hasilHitung;
	}
	
	public int addPenguranganActual(int x, int y) {
		int hasilHitung = ((x*2)-x)-y;
		System.out.println("Hasil pengurangan actual ==> "+hasilHitung);
		return hasilHitung;
	}
	
	public int addPenguranganExpect(int x, int y) {
		int hasilHitung = x-y;
		System.out.println("Hasil pengurangan expect ==> "+hasilHitung);
		return hasilHitung;
	}
	
	public int addPembagianActual(int x, int y) {
		int hasilHitung = ((x+x)/2)/((y+y)/2);
		System.out.println("Hasil pembagian actual ==> "+hasilHitung);
		return hasilHitung;
	}
	
	public int addPembagianExpect(int x, int y) {
		int hasilHitung = x/y;
		System.out.println("Hasil pembagian expect ==> "+hasilHitung);
		return hasilHitung;
	}
	
	public int addModulusActual(int x, int y) {
		int hasilHitung = x%y;
		System.out.println("Hasil modulus actual ==> "+hasilHitung);
		return hasilHitung;
	}
	
	public int addModulusExpect(int x, int y) {
		int hasilHitung = x%y;
		System.out.println("Hasil modulus expect ==> "+hasilHitung);
		return hasilHitung;
	}
}
