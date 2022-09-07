package latihan.testng;

public class LimasPersegi {
	public double luasPermukaan(int tinggi, int sisi) {
		int c = (tinggi*tinggi)+(sisi/2);
		double hitungSisiTegak = Math.sqrt(c);
		double hitung = (sisi*sisi)+(4*hitungSisiTegak);
		return hitung;
	}
	
	public int volumeLimasPersegi(int tinggi, int sisi) {
		int hitung = ((sisi*sisi)*tinggi)/3;
		return hitung;
	}
}
