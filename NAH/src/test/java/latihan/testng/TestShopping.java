package latihan.testng;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class TestShopping {

	ShoopingActivity sa = new ShoopingActivity();
	
	@Test
	public void addProdSatu()
	{
		AssertJUnit.assertEquals(sa.addProdSatu(), 10000);
	}
	
	@Test
	public void hitungBelanja()
	{
		AssertJUnit.assertEquals(sa.hitungTotalBelanja(),9500);
	}
	
	
}