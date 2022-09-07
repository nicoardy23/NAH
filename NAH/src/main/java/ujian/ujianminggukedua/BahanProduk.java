package ujian.ujianminggukedua;

public class BahanProduk {
	private String produkA;
	private int hargaProdukA;
	private int jumlahProdukA;
	private int totalProduk;
	private double diskon;
	private double totalDiskon;
	
	BahanProduk(String prodA, int hargaProdA, double diskonn){
		this.produkA = prodA;
		this.hargaProdukA = hargaProdA;
		this.diskon = diskonn;
		
		this.totalDiskon=0;
		this.jumlahProdukA=0;
		this.totalProduk=0;
	}

	public String getProdukA() {
		return produkA;
	}

	public int getHargaProdukA() {
		return hargaProdukA;
	}

	public double getDiskon() {
		return diskon;
	}

	public int getJumlahProdukA() {
		return jumlahProdukA;
	}

	public void setJumlahProdukA(int jumlahProdukA) {
		this.jumlahProdukA = jumlahProdukA;
	}

	public int getTotalProduk() {
		return totalProduk;
	}

	public void setTotalProduk(int totalProduk) {
		this.totalProduk = totalProduk;
	}

	public double getTotalDiskon() {
		return totalDiskon;
	}

	public void setTotalDiskon(double totalDiskon) {
		this.totalDiskon = totalDiskon;
	}
	
	
}
