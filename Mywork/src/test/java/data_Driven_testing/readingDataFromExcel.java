package data_Driven_testing;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readingDataFromExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
       FileInputStream file= new FileInputStream(System.getProperty("user.dir")+"\\testdata\\datadriventesting.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
        XSSFSheet	sheet=workbook.getSheet("Sheet1");   //	XSSFSheet sheet=workbook.getSheetAt(0);
        int totalrows =sheet.getLastRowNum();
        int totalnumberofcell=sheet.getRow(1).getLastCellNum();
        System.out.println("number of rows:"+ totalrows);
        System.out.println("number of cells:"+ totalnumberofcell);
        for(int i=0;i<=totalrows;i++)
        {
        	XSSFRow readrow=sheet.getRow(i);
        	for(int j=0;j<totalnumberofcell;j++)
        	{
        		XSSFCell readcell=readrow.getCell(j);
        		System.out.print(readcell.toString()+"\t"+"  ");
        	}
        	System.out.println();
        }
        workbook.close();
        file.close();
        
	}


}
