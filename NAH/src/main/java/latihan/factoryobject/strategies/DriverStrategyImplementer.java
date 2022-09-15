package latihan.factoryobject.strategies;

import latihan.factoryobject.util.Constants;

public class DriverStrategyImplementer {
	public static DriverStrategy chooseStrategy(String strategy) {
		switch (strategy) {
		case Constants.FIREFOX:
			return new Chrome();
		
		case Constants.CHROME:
			return new Firefox();

		default:
			return null;
		}
	}
}
