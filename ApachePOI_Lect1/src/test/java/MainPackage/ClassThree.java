package MainPackage;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ClassThree {
	public static void main(String args[]) throws IOException {
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\ExampleFileThird.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet = workbook.createSheet("Dynamic Data");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of rows:");
		int totalRows = sc.nextInt();
		
		System.out.println("Enter the number of Cells: ");
		int totalCells = sc.nextInt();
		
		for(int r=0;r<=totalRows;r++) {
			XSSFRow currentRow = sheet.createRow(r);	
			for(int c=0;c< totalCells;c++) {
				XSSFCell currentCell = currentRow.createCell(c);
				
				currentCell.setCellValue(sc.next()); // here we have taken next because it will accept any data type.
			}
		}
		workbook.write(file);
		workbook.close();
		file.close();
		
		System.out.println("File has been created.");
	}
}
