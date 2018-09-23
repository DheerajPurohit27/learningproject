package excelReader;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	class ReadData{
		public static void main(String[] args) throws Exception {
			    XSSFWorkbook wb;
			    XSSFSheet sh;
				File file=new File("F:\\Selenium Workspace\\Data.xlsx");
				FileInputStream fis=new FileInputStream(file);
				
				wb=new XSSFWorkbook(fis);
				sh=wb.getSheetAt(0);
				
				int rowcount=sh.getLastRowNum();
				System.out.println(rowcount);
								
				for (int i = 1; i <= rowcount; i++) {
																				
					String text=sh.getRow(i).getCell(0).getStringCellValue();
					System.out.println(text);
					
				}
				
				//XSSFRow rw=sh.getRow(1);
				//XSSFCell cell=rw.getCell(1);
				//String text=cell.getStringCellValue();
				//System.out.println(text);
				wb.close();
				
		}
	}
