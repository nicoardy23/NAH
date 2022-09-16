package tugas.selenium.driver;

import tugas.selenium.util.Constant;

public class DriverStrategyImplemen {
	public static DriverStrategy chooseStrategy(String strategy) {
		switch (strategy) {
		case Constant.FIREFOX:
			return new Firefox();
		
		case Constant.CHROME:
			return new Chrome();

		default:
			return null;
		}
	}
}
