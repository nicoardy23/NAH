package ujian.ujiankelima.testng;

import static org.testng.Assert.assertEquals;

import java.util.Random;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.apache.commons.lang3.RandomStringUtils;

public class TestParsing {
	Parsing pars;
	Random rand;
	String valueParse = "";
	int intLength;
	Boolean number = true;
	Boolean letter = false;
	
	@BeforeTest
	public void befTest() {
		System.out.println("\n============== PROSES TEST DIMULAI =============\n");
	}
	
	@BeforeMethod
	public void befMethod() {
		pars = new Parsing();
		rand = new Random();
		intLength = rand.nextInt(5, 15);
	}
	
	@Test(priority = 1)
	public void testParsingInteger() {
		System.out.println("=============== Parse To Integer ===============");
		valueParse = RandomStringUtils.random(intLength, letter, number);
		System.out.println("Nilai String = "+valueParse);
		System.out.println("================== HASIL TEST ==================");
		assertEquals(pars.parseToIntegerActual(valueParse), pars.parseToIntegerExpect(valueParse));
	}

	@Test(priority = 2)
	public void testParsingDouble() {
		System.out.println("=============== Parse To Double ================");
		valueParse = RandomStringUtils.random(intLength, letter, number);
		System.out.println("Nilai String = "+valueParse);
		System.out.println("================== HASIL TEST ==================");
		assertEquals(pars.parseToDoubleActual(valueParse), pars.parseToDoubleExpect(valueParse));
	}
	
	@Test(priority = 3)
	public void testParsingLong() {
		System.out.println("================ Parse To Long =================");
		valueParse = RandomStringUtils.random(intLength, letter, number);
		System.out.println("Nilai String = "+valueParse);
		System.out.println("================== HASIL TEST ==================");
		assertEquals(pars.parseToLongActual(valueParse), pars.parseToLongExpect(valueParse));
	}
	
	@Test(priority = 4)
	public void testParsingFloat() {
		System.out.println("================ Parse To Float ================");
		valueParse = RandomStringUtils.random(intLength, letter, number);
		System.out.println("Nilai String = "+valueParse);
		System.out.println("================== HASIL TEST ==================");
		assertEquals(pars.parseToFloatActual(valueParse), pars.parseToFloatExpect(valueParse));
	}
	
	@AfterMethod
	public void aftMethod() {
		System.out.println("================================================\n");
	}
	
	@AfterTest
	public void aftTest() {
		System.out.println("================== TEST SELESAI =================\n");
	}
}
