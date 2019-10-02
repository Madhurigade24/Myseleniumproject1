package StepDefinition;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DemoReadExcel {

	public static void main(String[] args) throws IOException {
		// Create an object of File class to open xlsx file

		File file = new File("C:\\Users\\Rohan\\Desktop\\ExelFile\\DemoSheet.xlsx");

		// Create an object of FileInputStream class to read excel file

		FileInputStream inputStream = new FileInputStream(file);

		Workbook objworkbook = new XSSFWorkbook(inputStream);
		
		org.apache.poi.ss.usermodel.Sheet objSheet = objworkbook.getSheet("DemoSheet");
		
		int rowCount = objSheet.getLastRowNum()-objSheet.getFirstRowNum();
		
		System.out.println("row count is "+rowCount);
		
		for(int i = 0;i<rowCount+1;i++)
		{
			Row row = objSheet.getRow(i);
			
			for(int j=0;j<row.getLastCellNum();j++)
			{
				System.out.print(row.getCell(j).getStringCellValue()+"||");
			}
			
			System.out.println();
		}
		
		
		

	}

}
