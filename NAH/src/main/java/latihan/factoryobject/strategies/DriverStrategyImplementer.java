package latihan.factoryobject.strategies;

import latihan.factoryobject.util.Constant;

public class DriverStrategyImplementer {
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
