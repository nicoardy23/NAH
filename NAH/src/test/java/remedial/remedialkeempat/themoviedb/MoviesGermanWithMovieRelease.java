package remedial.remedialkeempat.themoviedb;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MoviesGermanWithMovieRelease {
	
	@BeforeTest
	public void befTest()
	{
		baseURI = "https://api.themoviedb.org";
	}
	
	
	@Test
	public void testGet()
	{
		System.out.println("============ Movies German ===============");
		given().
			param("api_key", "1d5c773ccfcc87bd9110c08e5893f84b").and().
			param("language", "de-DE").and().
			param("region", "DE").and().
			param("release_date.gte", "2016-11-16").and().
			param("release_date.lte", "2016-12-02").and().
			param("with_release_type", "2|3").
		when().
			get("3/discover/movie").
		then().
		statusCode(200).
		log().
		all();
	}
// https://api.themoviedb.org/3/discover/movie?api_key=1d5c773ccfcc87bd9110c08e5893f84b&language=de-DE&region=DE&release_date.gte=2016-11-16&release_date.lte=2016-12-02&with_release_type=2|3
}
