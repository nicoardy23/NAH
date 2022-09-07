package latihan.testng;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import java.util.Random;

import org.testng.annotations.Test;

public class TestCalculator {
	Calculator c;
	Random rand;
	int x;
	int y;
	
	@BeforeTest
	public void befTest() {
		c = new Calculator();
		rand = new Random();
	}
	
	@BeforeMethod
	public void befMethod() {
		x = rand.nextInt(1, 100);
		y = rand.nextInt(1, 50);
		System.out.println("=============================INI ADALAH BEFORE METHOD=============================");
		System.out.println("Nilai Satu = "+x);
		System.out.println("Nilai Dua = "+y);
	}
	
	@Test(priority = 1)
	public void testaddNilai() {
		AssertJUnit.assertEquals(c.addNilai(x, y), c.addNilai(x, y));
		System.out.println("Total Penjumlahan Nilai Satu dan Dua = "+c.addNilai(x, y));
	}
	
	@Test(priority = 2)
	public void testDevideNilai() {
		
		AssertJUnit.assertEquals(c.devideNIlai(x, y), c.devideNIlai(x, y));		
		System.out.println("Total Pembagian Nilai Satu dan Dua = "+c.devideNIlai(x, y));
	}
	
	@AfterMethod
	public void aftMethod() {
		System.out.println("=============================INI ADALAH AFTER METHOD=============================");
	}
}
