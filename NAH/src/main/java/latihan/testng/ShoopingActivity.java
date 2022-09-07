package latihan.testng;

public class ShoopingActivity {

	IndomaretPrototype ip;
	int limitProdSatu = 0;
	public ShoopingActivity() {
		ip = new IndomaretPrototype("Minyak", "Regal", 10000, 5000, 0.05);
	}
	
	public int addProdSatu()
	{
		ip.setJumlahProdukSatu(ip.getJumlahProdukSatu()+1);
		ip.setTotalDiskon(ip.getDiskon()*ip.getHargaProdukSatu());//++500
		ip.setTotalBelanja((ip.getHargaProdukSatu()+ip.getTotalBelanja()));
	 
		 return ip.getTotalBelanja();
		
	}
	public int kurangProdSatu()
	{
		if(ip.getJumlahProdukSatu()!=0)
		{
			ip.setJumlahProdukSatu(ip.getJumlahProdukSatu()-1);
			ip.setTotalDiskon(ip.getTotalDiskon()-(ip.getDiskon()*ip.getHargaProdukSatu()));//--500
			ip.setTotalBelanja(ip.getTotalBelanja()-ip.getHargaProdukSatu());
		}
		
		return ip.getTotalBelanja();	
	}
	
	public int addProdDua()
	{
		ip.setJumlahProdukDua(ip.getJumlahProdukDua()+1);
		ip.setTotalDiskon(ip.getDiskon()*ip.getHargaProdukDua());//++500
		ip.setTotalBelanja((ip.getHargaProdukDua()+ip.getTotalBelanja()));
	 
		 return ip.getTotalBelanja();
		
	}
	public int kurangProdDua()
	{
		if(ip.getJumlahProdukDua()!=0)
		{
			ip.setJumlahProdukDua(ip.getJumlahProdukDua()-1);
			ip.setTotalDiskon(ip.getTotalDiskon()-(ip.getDiskon()*ip.getHargaProdukDua()));//--500
			ip.setTotalBelanja(ip.getTotalBelanja()-ip.getHargaProdukDua());
		}
		
		return ip.getTotalBelanja();	
	}
	
	public double hitungTotalBelanja()
	{
		
		System.out.println("TOTAL BELANJA ADALAH "+(ip.getTotalBelanja()-ip.getTotalDiskon()));
		return ip.getTotalBelanja()-ip.getTotalDiskon();
	}
}