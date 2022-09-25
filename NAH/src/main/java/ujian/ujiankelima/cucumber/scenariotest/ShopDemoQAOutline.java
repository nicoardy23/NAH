package ujian.ujiankelima.cucumber.scenariotest;

public enum ShopDemoQAOutline {
	
	T1("Register User Account"),
	T2("Login User Account");
	
	private String testName;
	
	private ShopDemoQAOutline(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}	
}
