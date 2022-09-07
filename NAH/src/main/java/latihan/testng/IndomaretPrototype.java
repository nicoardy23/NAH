package latihan.testng;

public class IndomaretPrototype {

	private String produkSatu;
	private String produkDua;
	private int hargaProdukSatu;	
	private int hargaProdukDua;
	private int jumlahProdukSatu;
	private int jumlahProdukDua;
	private int totalBelanja;
	private double diskon;
	private double totalDiskon;
	
	IndomaretPrototype(String prodSatu,String prodDua,int hargaProdSatu, 
			int hargaProdDua,double diskons) {
		this.produkSatu = prodSatu;
		this.produkDua = prodDua;
		this.hargaProdukSatu = hargaProdSatu;
		this.hargaProdukDua = hargaProdDua;
		this.diskon = diskons;
		
		this.jumlahProdukSatu=0;
		this.jumlahProdukDua=0;
		this.totalBelanja=0;
		this.totalDiskon=0;
	}

	public String getProdukSatu() {
		return produkSatu;
	}

	public String getProdukDua() {
		return produkDua;
	}

	public int getHargaProdukSatu() {
		return hargaProdukSatu;
	}

	public int getHargaProdukDua() {
		return hargaProdukDua;
	}

	public double getDiskon() {
		return diskon;
	}

	public int getJumlahProdukSatu() {
		return jumlahProdukSatu;
	}

	public void setJumlahProdukSatu(int jumlahProdukSatu) {
		this.jumlahProdukSatu = jumlahProdukSatu;
	}

	public int getJumlahProdukDua() {
		return jumlahProdukDua;
	}

	public void setJumlahProdukDua(int jumlahProdukDua) {
		this.jumlahProdukDua = jumlahProdukDua;
	}

	public int getTotalBelanja() {
		return totalBelanja;
	}

	public void setTotalBelanja(int totalBelanja) {
		this.totalBelanja = totalBelanja;
	}

	public double getTotalDiskon() {
		return totalDiskon;
	}

	public void setTotalDiskon(double totalDiskon) {
		this.totalDiskon = totalDiskon;
	}
	
	
}