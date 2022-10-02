package remedial.remedialkeempat.themoviedb;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.json.simple.JSONObject;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import latihan.restassured.utils.ExcelReader;

public class CreateRequestToken {
	
	@BeforeTest
	public void befTest()
	{
		baseURI = "https://api.themoviedb.org";
	}
	
	
	@Test
	public void testGet()
	{
		System.out.println("============ Crate Request Token ===============");
		given().
			param("api_key", "1d5c773ccfcc87bd9110c08e5893f84b"). 
		when().
			get("3/authentication/token/new"). 
		then().
		statusCode(200).
		log().
		all();
	}
	// https://api.themoviedb.org/3/authentication/token/new?api_key=1d5c773ccfcc87bd9110c08e5893f84b
}
