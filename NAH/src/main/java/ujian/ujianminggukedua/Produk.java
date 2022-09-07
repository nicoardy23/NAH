package ujian.ujianminggukedua;

public class Produk {
	BahanProduk bp;
	public Produk() {
		bp = new BahanProduk("Tissue", 10000, 0.05);
	}
	
	public int tambahStok() {
		bp.setJumlahProdukA(bp.getJumlahProdukA()+1);
		bp.setTotalDiskon(bp.getDiskon()*bp.getHargaProdukA());
		bp.setTotalProduk(bp.getHargaProdukA()+bp.getTotalProduk());
		System.out.println("Produk bertambah menjadi : "+bp.getJumlahProdukA());
		
		return bp.getTotalProduk();
	}
	
	public int kurangStok() {
		if(bp.getJumlahProdukA()!=0)
		{
			bp.setJumlahProdukA(bp.getJumlahProdukA()-1);
			bp.setTotalDiskon(bp.getTotalDiskon()-(bp.getDiskon()*bp.getHargaProdukA()));
			bp.setTotalProduk(bp.getTotalProduk()-bp.getHargaProdukA());
		}
		
		return bp.getTotalProduk();
	}
	
	public int cekStok() {
		System.out.println("TOTAL STOK PRODUK = "+bp.getJumlahProdukA());
		return bp.getJumlahProdukA();
	}
	
	public double kalkulasiDiskon() {
		System.out.println("TOTAL DISKON = "+(bp.getTotalProduk()-bp.getTotalDiskon()));
		return bp.getTotalProduk()-bp.getTotalDiskon();
	}
	
	
	
}
