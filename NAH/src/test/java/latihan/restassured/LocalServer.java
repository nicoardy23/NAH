package latihan.restassured;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LocalServer {
JSONObject req;
	
	@BeforeTest
	public void befTest() {
		req = new JSONObject();
		baseURI = "http://localhost:3000";
	}
	
//	@Test(priority = 0) 
//	public void testPost() {
//		req.put("first_name", "Nico");
//		req.put("last_name", "Ardy");
//		req.put("subject_id", 1);
//		
//		given().
//			header("Content-Type","applcation/json").
//			accept(ContentType.JSON).
//			contentType(ContentType.JSON).
//			body(req.toJSONString()).
//		when().//olah url
//			post("/users").
//		then().
//			statusCode(200).
//			log().//tampilkan informasi
//			all();
//	}
	
	@Test(priority = 1)
	public void testGet() {
		given().
//		param("first_name", "Nico").
		get("/users/3").
		then().
		statusCode(200).
		log().
		all();
	}
}
