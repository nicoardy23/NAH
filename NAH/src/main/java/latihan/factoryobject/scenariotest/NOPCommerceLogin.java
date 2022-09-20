package latihan.factoryobject.scenariotest;

public enum NOPCommerceLogin {
	
	T1("Login user invalid"),
	T2("Login user valid");
	
	private String testName;
	
	private NOPCommerceLogin(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}	
}
