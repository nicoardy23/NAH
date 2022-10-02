package remedial.remedialkeempat.themoviedb;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MadMaxWithBearerToken {
	
	@BeforeTest
	public void befTest()
	{
		baseURI = "https://api.themoviedb.org";
	}
	
	
	@Test
	public void testGet()
	{
		System.out.println("============ Mad Max With Authorization ===============");
		given().
			header("Authorization", "Bearer eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiIxZDVjN"
					+ "zczY2NmY2M4N2JkOTExMGMwOGU1ODkzZjg0YiIsInN1YiI6IjYzMzA2MzFi"
					+ "Y2VkZTY5MDA3ZWFlNzk3MCIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJ"
					+ "zaW9uIjoxfQ.ONddptBbdLkzR1zsRmFsGETmh34sGhWEE_c3L6H__FE").
			accept("application/json;charset=utf-8").
//			header("Content-Type", "application/json;charset=utf-8").
		when().
			get("3/movie/76341").
		then().
		statusCode(200).
		log().
		all();
	}
	// https://api.themoviedb.org/3/movie/76341
}
