package ujian.testujianminggukedua;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import ujian.ujianminggukedua.Aritmatika;

import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
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


public class TestAritmatika {
	Aritmatika ar;
	Random rand;
	int nilaiPertama;
	int nilaiKedua;
	
	@BeforeTest
	public void befTest() {
		System.out.println("PROSES TEST DIMULAI!!");
		ar = new Aritmatika();
		rand = new Random();
	}
	
	@BeforeMethod
	public void befMethod() {
		System.out.println("-------------------------INI ADALAH BEFORE METHOD-------------------------");
		nilaiPertama = rand.nextInt(25, 100);
		nilaiKedua = rand.nextInt(1, 20);
	}
	
	@BeforeClass
	public void befClass() {
		System.out.println("=========================INI ADALAH BEFORE CLASS=========================");
	}
	
	@Test
	public void testPenjumlahanAritmatika() {
		AssertJUnit.assertEquals(ar.addPenjumlahanActual(nilaiPertama, nilaiKedua), ar.addPenjumlahanExpect(nilaiPertama, nilaiKedua));
	}
	
	@Test
	public void testPenguranganAritmatika() {
		AssertJUnit.assertEquals(ar.addPenguranganActual(nilaiPertama, nilaiKedua), ar.addPenguranganExpect(nilaiPertama, nilaiKedua));
	}
	
	@Test
	public void testPembagianAritmatika() {
		AssertJUnit.assertEquals(ar.addPembagianActual(nilaiPertama, nilaiKedua), ar.addPembagianExpect(nilaiPertama, nilaiKedua));
	}
	
	@Test
	public void testModulusAritmatika() {
		AssertJUnit.assertEquals(ar.addModulusActual(nilaiPertama, nilaiKedua), ar.addModulusExpect(nilaiPertama, nilaiKedua));
	}
	
	@AfterClass
	public void aftClass() {
		System.out.println("=========================INI ADALAH AFTER CLASS=========================");
	}
	
	@AfterMethod
	public void aftMethod() {
		System.out.println("-------------------------INI ADALAH AFTER METHOD-------------------------");
	}
	
	@AfterTest
	public void aftTest() {
		System.out.println("TEST SELESAI!!");
	}
}
