package Practice_Selenium;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileHandling_Excel {

	public static void main(String[] args) throws IOException 
	{
	  String filepath ="E:\\Test.xlsx";
	  XSSFWorkbook wb=new XSSFWorkbook(filepath);
	  XSSFSheet sheet= wb.getSheetAt(0);
	  int countrow= sheet.getPhysicalNumberOfRows();
	  System.out.println(countrow);
	  int countcol= sheet.getRow(0).getLastCellNum();
	  System.out.println(countcol);
	  
	  for (int i = 1; i < countrow; i++) {
		  for (int j = 0; j < countcol; j++) {
			  
			  System.out.println(sheet.getRow(i).getCell(j));
			
		}
		
	}

	}

}
