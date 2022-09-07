package latihan.testng;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import java.util.Random;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCekBilangan {
	CekBilangan cb;
	Random rand;
	int x;
	
	@BeforeTest
	public void befTest() {
		cb = new CekBilangan();
		rand = new Random();
		System.out.println("Test Dimulai");
	}
	
	@BeforeMethod
	public void befMethod() {
		x = rand.nextInt(1, 100);
		System.out.println("===========================INI ADALAH BEFORE METHOD===========================");
		System.out.println("Angka = "+x);
	}
	
	@Test
	public void testGenap() {
		AssertJUnit.assertEquals(cb.cekBilangan(x), cb.cekBilangan(x));
	}
	
	@Test
	public void testGanjil() {
		AssertJUnit.assertEquals(cb.cekBilangan(x), cb.cekBilangan(x));
	}
	
	@AfterMethod
	public void aftMethod() {
		System.out.println("===========================INI ADALAH AFTER METHOD===========================");
	}
	
	@AfterTest
	public void aftTest() {
		System.out.println("Test Selesai");
	}
}
