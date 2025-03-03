package data_Driven_testing;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_The_data_To_Excel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream file=new FileOutputStream("C:\\Users\\nanda\\eclipse-workspace\\Mywork\\excel1.myfi.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("sheet data");
		XSSFRow row1=sheet.createRow(0);
		row1.createCell(0).setCellValue("Sl No");
		row1.createCell(1).setCellValue("Name");
		row1.createCell(2).setCellValue("email");
		row1.createCell(3).setCellValue("mobile");
		row1.createCell(4).setCellValue("address");
		
		XSSFRow row2=sheet.createRow(1);
		row2.createCell(0).setCellValue("1");
		row2.createCell(1).setCellValue("Deepa");
		row2.createCell(2).setCellValue("deepa@gmail.com");
		row2.createCell(3).setCellValue("9909909909");
		row2.createCell(4).setCellValue("Bangalore");
		
		XSSFRow row3=sheet.createRow(2);
		row3.createCell(0).setCellValue("2");
		row3.createCell(1).setCellValue("shree");
		row3.createCell(2).setCellValue("shree@gmail.com");
		row3.createCell(3).setCellValue("8898898788");
		row3.createCell(4).setCellValue("Bangalore");
		
		workbook.write(file);
		workbook.close();
		file.close();
		
//		System.out.println("File is created");
   
	}

}
