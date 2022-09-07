package latihan.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import java.util.Random;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestLimasPersegi {
	LimasPersegi lp;
	Random rand;
	int sisi;
	int tinggi;
	
	@BeforeTest
	public void befTest() {
		lp = new LimasPersegi();
		rand = new Random();
		System.out.println("TEST DIMULAI");
	}
	
	@BeforeMethod
	public void befMethod() {
		sisi = rand.nextInt(1, 30);
		tinggi = rand.nextInt(1, 20);
		System.out.println("----------------------------------INI BEFORE METHOD----------------------------------");
		System.out.println("Lebar sisi = "+sisi);
		System.out.println("Tinggi = "+tinggi);
	}
	
	@BeforeClass
	public void befClass() {
		System.out.println("==============================INI BEFORE CLASS==============================");
	}
	
	@Test
	public void totalLuasPermukaan() {
		AssertJUnit.assertEquals(lp.luasPermukaan(tinggi, sisi), lp.luasPermukaan(tinggi, sisi));
		System.out.println("Total Luas Permukaan = "+lp.luasPermukaan(tinggi, sisi));
	}
	
	@Test
	public void totalVolumeLimas() {
		AssertJUnit.assertEquals(lp.volumeLimasPersegi(tinggi, sisi), lp.volumeLimasPersegi(tinggi, sisi));
		System.out.println("Total Volume = "+lp.volumeLimasPersegi(tinggi, sisi));
	}
	
	@AfterClass
	public void aftClass() {
		System.out.println("==============================INI AFTER CLASS==============================");
	}
	
	@AfterMethod
	public void aftMethod() {
		System.out.println("----------------------------------INI AFTER METHOD----------------------------------");
	}
	
	@AfterTest
	public void aftTest() {
		System.out.println("TEST SELESAI");
	}
}
