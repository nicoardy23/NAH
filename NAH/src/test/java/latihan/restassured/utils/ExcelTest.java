package latihan.restassured.utils;

public class ExcelTest {

	public static void main(String[] args) {
//		System.setProperty("log4j.configurationFile","./path_to_the_log4j2_config_file/log4j2.xml");
		String excelPath = "./data/DataDriven.xlsx";
		String sheetName = "Sheet1";
		ExcelReader excelReader = new ExcelReader(excelPath, sheetName);

		excelReader.getIter();
	}
}