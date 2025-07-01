package MainPackage;

import java.io.FileOutputStream;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//Excel --> Workbook --> Sheet --> Row --> Cell
public class ClassTwo {
	public static void main(String args[]) throws IOException{
		FileOutputStream file= new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\ExampleFileSecond.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook();
		// Creating a new sheet inside the workbook
		XSSFSheet sheet = workbook.createSheet("Data");
		
		//Creating the rows inside the sheet and columns inside the rows.
		XSSFRow row1 = sheet.createRow(0);
		row1.createCell(0).setCellValue("Welcome");
		row1.createCell(1).setCellValue(1234);
		row1.createCell(2).setCellValue("Automation");
		
		XSSFRow row2 = sheet.createRow(1);
		row2.createCell(0).setCellValue("Python");
		row2.createCell(1).setCellValue(3.1);
		row2.createCell(2).setCellValue("Programming");
		
		XSSFRow row3 = sheet.createRow(2);
		row3.createCell(0).setCellValue("C++");
		row3.createCell(1).setCellValue(10.0);
		row3.createCell(2).setCellValue("Development");
		
		//Attaching workbook to the file
		workbook.write(file);
		
		workbook.close();
		file.close();
		System.out.println("File has been created");
	}
}