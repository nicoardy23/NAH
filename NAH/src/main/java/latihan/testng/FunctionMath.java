package latihan.testng;

import org.testng.annotations.Test;

public class FunctionMath {
	@Test
	public String testMathActual(String x) {
		String strOutput = "";
		try {
			strOutput = String.valueOf(Math.pow(Double.parseDouble(x), Double.parseDouble(x)));
		} catch (Exception e) {
			strOutput = ""+e;
		}
		System.out.println("TEST MATH POW ACTUAL --> "+strOutput);
		return strOutput;
	}

	@Test
	public String testMathExpect(String x) {
		String strOutput = "";
		try {
			strOutput = String.valueOf(Math.pow(Double.parseDouble(x), Double.parseDouble(x)));
		} catch (Exception e) {
			strOutput = ""+e;
		}
		System.out.println("TEST MATH POW EXPECT --> "+strOutput);
		return strOutput;
	}
}
