package latihan.restassured;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
public class SampleRestAssured {
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
	
//	@Test(priority = 1)
//	public void testGet() {
//		given().
//			header("", "").accept("JSON").
//			param("first_name", "Nico").
//			and().param("", "").
//			and().param("", "").
//			and().param("", "").
//		when().
//			get("/users").
//		then().
//			statusCode(200).
//			log().
//			all();
//	}
	
//	@Test(priority = 0) 
//	public void testPatch() {
//		req.put("first_name", "Adul");
//		
//		given().
//			header("Content-Type","applcation/json").
//			accept(ContentType.JSON).
//			contentType(ContentType.JSON).
//			body(req.toJSONString()).
//		when().//olah url
//			patch("/users/3").
//		then().
//			statusCode(200);
//	}
	
//	@Test(priority = 0) 
//	public void testPut() {
//		req.put("first_name", "Adul");
//		req.put("last_name", "Ardy");
//		req.put("subject_id", 5);
//		
//		given().
//			header("Content-Type","applcation/json").
//			accept(ContentType.JSON).
//			contentType(ContentType.JSON).
//			body(req.toJSONString()).
//		when().//olah url
//			patch("/users/3").
//		then().
//			statusCode(200);
//	}
	
	@Test(priority = 0) 
	public void testDelete() {
		when().//olah url
			delete("/users/4").
		then().
			statusCode(200).
			log().
			all();
	}
}
