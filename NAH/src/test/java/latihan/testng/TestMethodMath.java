package latihan.testng;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class TestMethodMath {
	FunctionMath fM = new FunctionMath();
	
	@Test
	public void testMathPow(){
		String strPow = "2";
		AssertJUnit.assertEquals(fM.testMathActual(strPow), fM.testMathExpect(strPow));
	}
}
