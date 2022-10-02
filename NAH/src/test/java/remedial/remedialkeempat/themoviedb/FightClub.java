package remedial.remedialkeempat.themoviedb;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FightClub {
	
	@BeforeTest
	public void befTest()
	{
		baseURI = "https://api.themoviedb.org";
	}
	
	
	@Test
	public void testGet()
	{
		System.out.println("============ Fight Club ===============");
		given().
			param("api_key", "1d5c773ccfcc87bd9110c08e5893f84b").
		when().
			get("3/movie/550").
		then().
		statusCode(200).
		log().
		all();
	}
	// https://api.themoviedb.org/3/movie/550?api_key=1d5c773ccfcc87bd9110c08e5893f84b
}
