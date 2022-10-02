package remedial.remedialkeempat.themoviedb;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MadMax {
	
	@BeforeTest
	public void befTest()
	{
		baseURI = "https://api.themoviedb.org";
	}
	
	
	@Test
	public void testGet()
	{
		System.out.println("============ Mad Max ===============");
		given().
			param("api_key", "1d5c773ccfcc87bd9110c08e5893f84b"). 
		when().
			get("3/movie/76341"). 
		then().
		statusCode(200).
		log().
		all();
	}
	// https://api.themoviedb.org/3/movie/76341?api_key=1d5c773ccfcc87bd9110c08e5893f84b
}
