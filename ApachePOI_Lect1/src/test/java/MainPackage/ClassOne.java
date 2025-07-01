package MainPackage;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ClassOne {
	public static void main(String args[]) throws IOException {
		//Step 1 -> Open the file in reading mode.
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\ExampleFile.xlsx");
		//Step 2 -> Get the Workbook
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		//Step 3 -> Extract the sheet from the workbook
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		// Step 4 -> Get the total number of rows and column from the sheet.
			// total Number of rows ->
		int totalRows = sheet.getLastRowNum();
			// to get the total number of columns, first get the row1 and then use .getLastCellNum() method.
		int totalCols = sheet.getRow(1).getLastCellNum();
		
		System.out.println("Total Number of Rows are "+ totalRows);
		System.out.println("Total Number of Cells are "+ totalCols);
		
		for(int r=0;r<=totalRows;r++) {
			//Reading the row
			XSSFRow currentRow = sheet.getRow(r);
			for(int c=0;c<totalCols;c++) {
				//Reading the column
				XSSFCell currentCell = currentRow.getCell(c);
				System.out.print(currentCell.toString() +" ");
			}
			System.out.println();
		}
		
		workbook.close();
		file.close();
	}	
}

