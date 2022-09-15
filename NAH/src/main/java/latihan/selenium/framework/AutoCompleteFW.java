package latihan.selenium.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import latihan.factoryobject.DriverSingleton;

public class AutoCompleteFW {
	private WebDriver driver;
	
	public AutoCompleteFW() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "autocomplete")
	private WebElement autoComplete;
	
	@FindBy(id = "street_number")
	private WebElement streetNumber;
	
	@FindBy(id = "route")
	private WebElement route;
	
	@FindBy(id = "locality")
	private WebElement locality;
	
	@FindBy(id = "administrative_area_level_1")
	private WebElement administrativeAreaLevelOne;
	
	@FindBy(id = "postal_code")
	private WebElement postalCode;
	
	@FindBy(id = "country")
	private WebElement country;
	
	public void manipulativeAutoComplete(String ac) {
		autoComplete.click();
		autoComplete.clear();
		autoComplete.sendKeys(ac);
	}
	
	public void manipulativeStreetNumber(String sn) {
		streetNumber.click();
		streetNumber.clear();
		streetNumber.sendKeys(sn);
	}
	
	public void manipulativeRoute(String r) {
		route.click();
		route.clear();
		route.sendKeys(r);
	}
	
	public void manipulativeLocality(String l) {
		locality.click();
		locality.clear();
		locality.sendKeys(l);
	}
	
	public void manipulativeAdministrativeArea(String aa) {
		administrativeAreaLevelOne.click();
		administrativeAreaLevelOne.clear();
		administrativeAreaLevelOne.sendKeys(aa);
	}
	
	public void manipulativePostalCode(String pc) {
		postalCode.click();
		postalCode.clear();
		postalCode.sendKeys(pc);
	}
	
	public void manipulativeCountry(String c) {
		country.click();
		country.clear();
		country.sendKeys(c);
	}
	
	
	
	
}
