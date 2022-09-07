package ujian.testujianminggukedua;

import org.testng.annotations.Test;

import ujian.ujianminggukedua.Produk;

import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestProduk {
	Produk pr;
	
	@BeforeTest
	public void befTest() {
		System.out.println("Proses Test Dimulai");
		pr = new Produk();
	}
	
	@BeforeMethod
	public void befMethod() {
		System.out.println("------------------------------INI ADALAH BEFORE METHOD------------------------------");
	}
	
	@BeforeClass
	public void befClass() {
		System.out.println("==============================INI ADALAH BEFORE CLASS==============================");
	}
	
	@Test(priority = 1)
	public void tambahProduk() {
		AssertJUnit.assertEquals(pr.tambahStok(), 10000);
	}
	
	@Test(priority = 2)
	public void tambahProdukDua() {
		AssertJUnit.assertEquals(pr.tambahStok(), 20000);
	}
	
	@Test(priority = 3)
	public void cekStok() {
		AssertJUnit.assertEquals(pr.cekStok(), 2);
	}
	
	@Test(priority = 4)
	public void tambahProdukTiga() {
		AssertJUnit.assertEquals(pr.tambahStok(), 30000);
	}
	
	@Test(priority = 5)
	public void hitungStok() {
		AssertJUnit.assertEquals(pr.kalkulasiDiskon(), 29500.0);
	}
	
	@AfterMethod
	public void aftMethod() {
		System.out.println("------------------------------INI ADALAH AFTER METHOD------------------------------");
	}
	
	@AfterClass
	public void aftClass() {
		System.out.println("==============================INI ADALAH AFTER CLASS==============================");
	}
	
	@AfterTest
	public void aftTest() {
		System.out.println("Proses Test Telah Selesai");
	}
}
