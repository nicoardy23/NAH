package ujian.testujianminggukedua;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import ujian.ujianminggukedua.Geometri;

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


public class TestGeometri {
	Geometri ge;
	Random rand;
	int intTinggi;
	int intAlas;
	int intSisiA;
	int intSisiB;
	
	@BeforeTest
	public void befTest() {
		System.out.println("--PROSES TEST DIMULAI--");
		ge = new Geometri();
		rand = new Random();
	}
	
	@BeforeMethod
	public void befMethod() {
		System.out.println("-----------------------------INI ADALAH BEFORE METHOD-----------------------------");
		intSisiA = rand.nextInt(50, 100);
		intSisiB = rand.nextInt(100, 150);
		intTinggi = rand.nextInt(20, 70);
		intAlas = rand.nextInt(20, 50);
	}
	
	@BeforeClass
	public void befClass() {
		System.out.println("===========================INI ADALAH BEFORE CLASS===========================");
	}
	
	@Test
	public void testPersegi() {
		System.out.println("Panjang Sisi = "+intSisiA);
		AssertJUnit.assertEquals(ge.luasPersegiActual(intSisiA), ge.luasPersegiExpect(intSisiA));
	}
	
	@Test
	public void testSegitiga() {
		System.out.println("Alas = "+intAlas);
		System.out.println("Tinggi = "+intTinggi);
		AssertJUnit.assertEquals(ge.luasSegitigaActual(intAlas, intTinggi), ge.luasSegitigaExpect(intAlas, intTinggi));
	}
	
	@Test
	public void testTrapesium() {
		System.out.println("Tinggi = "+intTinggi);
		System.out.println("Lebar Sisi A = "+intSisiA);
		System.out.println("Lebar Sisi B = "+intSisiB);
		AssertJUnit.assertEquals(ge.luasTrapesiumActual(intTinggi, intSisiA, intSisiB), ge.luasTrapesiumExpect(intTinggi, intSisiA, intSisiB));
	}
	
	@AfterClass
	public void aftClass() {
		System.out.println("===========================INI ADALAH AFTER CLASS===========================");
	}
	
	@AfterMethod
	public void aftMethod() {
		System.out.println("-----------------------------INI ADALAH AFTER METHOD-----------------------------");
	}
	
	@AfterTest
	public void aftTest() {
		System.out.println("--TEST SELESAI--");
	}
	
	
	
	
}
