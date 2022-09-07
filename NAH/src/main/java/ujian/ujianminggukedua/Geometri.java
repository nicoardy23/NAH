package ujian.ujianminggukedua;

public class Geometri {
	public int luasPersegiActual(int x) {
		int hitungLuas = x*x;
		System.out.println("Total luas persegi actual ==> "+hitungLuas);
		return hitungLuas;
	}
	
	public int luasPersegiExpect(int x) {
		int hitungLuas = x*x;
		System.out.println("Total luas persegi expect ==> "+hitungLuas);
		return hitungLuas;
	}
	
	public int luasSegitigaActual(int alas, int tinggi) {
		int hitungLuas = alas*tinggi/((5+5)/5);
		System.out.println("Total luas segitiga actual ==> "+hitungLuas);
		return hitungLuas;
	}
	
	public int luasSegitigaExpect(int alas, int tinggi) {
		int hitungLuas = alas*tinggi/2;
		System.out.println("Total luas segitiga expect ==> "+hitungLuas);
		return hitungLuas;
	}
	
	public int luasTrapesiumActual(int tinggi, int a, int b) {
		int hitungLuas = ((tinggi*a)+(tinggi*b))/2;
		System.out.println("Total luas trapesium actual ==> "+hitungLuas);
		return hitungLuas;
	}
	
	public int luasTrapesiumExpect(int tinggi, int a, int b) {
		int totalAB = a+b;
		int hitungLuas = (tinggi*totalAB)/2;
		System.out.println("Total luas trapesium expect ==> "+hitungLuas);
		return hitungLuas;
	}

	
	
	
	
	
	
	
}
