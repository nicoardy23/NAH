package latihan.factoryobject.scenariotest;

public enum NOPCommerceLoginOutline {
	
	T1("Invalid login outline"),
	T2("Valid login outline"),
	T4("Dashboard NOPCommerce function");
	
	private String testName;
	
	private NOPCommerceLoginOutline(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}	
}
