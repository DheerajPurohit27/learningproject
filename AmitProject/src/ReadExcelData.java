import lib.ExcelDataConfig;

public class ReadExcelData {

	public static void main(String[] args) throws Exception {
		
		ExcelDataConfig obj=new ExcelDataConfig("F:\\Selenium Workspace\\Data.xlsx");
		obj.getData(0,1,0);
		
	}
	
}

