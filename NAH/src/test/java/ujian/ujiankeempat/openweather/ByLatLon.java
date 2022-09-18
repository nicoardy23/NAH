package ujian.ujiankeempat.openweather;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.json.simple.JSONObject;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import latihan.restassured.utils.ExcelReader;

public class ByLatLon {
	private ExcelReader excelReader;
	private Object [][] dDriven ;
	private int intColumnNums;
	private int intRowNums;
	private JSONObject req ;
	private int count=1;
	
	@BeforeTest
	public void befTest()
	{
		baseURI = "https://api.openweathermap.org";
		req = new JSONObject();
		String excelPath = "C:\\TRAINING\\SQA\\NAH\\data\\NAH_Ujian_Keempat.xlsx";
		String sheetName = "ByLatLon";
		excelReader = new ExcelReader(excelPath, sheetName);
		intRowNums = excelReader.getRowCount();
		intColumnNums = excelReader.getColCount();
	}
	
	@DataProvider(name = "DataProviderFirst")
	public Object[][] dataDrivenPost()
	{
		
		dDriven = new Object[intRowNums][intColumnNums];
		
		Iterator<Row> rX = excelReader.getIter();
		int a=0;
		int b=1;
		while(rX.hasNext())
		{
			Row rows = rX.next();
			System.out.println();
			System.out.println("Data ke - " +b);
			for(int i=0;i<intColumnNums;i++)
			{
				dDriven[a][i] = excelReader.getCellData(a, i);
				if(i==0) {
					System.out.println("lat : " +dDriven[a][i]);
				} else {
					System.out.println("lon : " +dDriven[a][i]);
				}
			}
			System.out.println("=====================================");
			a++;
			b++;
		}
		
		return dDriven;		
	}
	
	@Test(priority = 0,dataProvider="DataProviderFirst")
	public void testGet(String lat, String lon)
	{
		System.out.println("============ Data ke - " +(this.count++)+ " ===============");
		given().
			param("lat", lat).and(). 
			param("lon", lon).and().
			param("appid", "d78908e59462dd6d0b9f458e1e3f4cdf"). 
		when().
			get("data/2.5/weather"). 
		then().
		statusCode(200).
		log().
		all();
	}
	
}
