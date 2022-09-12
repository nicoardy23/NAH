package latihan.restassured;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;

public class DataDriven {
	
	JSONObject req ;
	
	@BeforeTest
	public void befTest()
	{
		baseURI = "http://localhost:3000/";
		req = new JSONObject();
	}
	
	@DataProvider(name = "DataProviderFirst")
	public Object[][] dataDrivenPost()
	{
		Object [][] dDriven = new Object[3][3];
		dDriven[0][0] = "Alayhandro";
		dDriven[0][1] = "Del Piro";
		dDriven[0][2] = 2;//10
		
		dDriven[1][0] = "Alayhandro";
		dDriven[1][1] = "Maldoni";
		dDriven[1][2] = 3;//11
		
		dDriven[2][0] = "Alayhandro";
		dDriven[2][1] = "Roberto";
		dDriven[2][2] = 3;//11
		
		return dDriven;
	}
	
	@DataProvider(name="DeleteData")
	public Object[] dataDrivenDelete()
	{
		return new Object[] {
			10,10,10,10,10
		};
	}
	
//	@DataProvider(name = "DataProviderFirst")
//	public Object[][] dataDrivenPostSecond()
//	{
//		
//		return new Object[][] {
//			{"Roberto","Mancini",1},
//			{"Roberta","Lopez",2}
//		};
//	}
	
	@Test(priority=0,dataProvider = "DataProviderFirst")
	public void testPost(String fName, String lName, int subId)
	{
		req.put("first_name",fName);
		req.put("last_name",lName);
		req.put("subject_id",subId);
		 
		given().
			contentType(ContentType.JSON).
			accept(ContentType.JSON).
			header("Content-Type","application/json").
			body(req.toJSONString()).
		when().
			post("/users").
		then().
			statusCode(201).log().all();
	}
	
	@Test(priority = 1, dataProvider="DeleteData")
	public void testDelete(int uId)
	{
		when().
			delete("/users/"+uId).
		then().
			statusCode(201).log().all();
	}
}