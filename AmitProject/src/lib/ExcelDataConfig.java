package lib;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig {
	
	XSSFWorkbook wb;
    XSSFSheet sh;
    XSSFRow row;
    XSSFCell cell;
    
	public ExcelDataConfig(String path) throws Exception{
	
			File file=new File(path);
			FileInputStream fis=new FileInputStream(file);
			wb=new XSSFWorkbook(fis);
		
	}
	
	public void getData(int sheetNum, int rowNum, int cellNum) throws IOException{
		
		sh=wb.getSheetAt(sheetNum);
		row=sh.getRow(rowNum);
		cell=row.getCell(cellNum);
		String value=cell.getStringCellValue();
		System.out.println(value);
		wb.close();
				
	}
		

}
	
