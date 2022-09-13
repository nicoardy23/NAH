package latihan.restassured.utils;

public class ExcelTest {

	public static void main(String[] args) {
		String excelPath = "./Data/DataDriven.xlsx";
		String sheetName = "Sheet1";
		ExcelReader excelReader = new ExcelReader(excelPath, sheetName);

		excelReader.getIter();
	}
}