package latihan.testng;

public class CekBilangan {
	public String cekBilangan(int a) {
		String status = "";
		if ((a%2)==0) {
			status = "Genap";
		}else {
			status = "Ganjil";
		}
		System.out.println(status);
		return status;
	}
}
