package data_Driven_testing;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;

public class read_the_data_from_LeadPassing_List {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
     FileInputStream file=new FileInputStream("C:\\Users\\nanda\\eclipse-workspace\\Mywork\\excel1\\lead List.xlsx");
     Workbook book=WorkbookFactory.create(file);
     Sheet s=book.getSheet("Sheet1");
     int totalrow=s.getLastRowNum();
     int totalcell=s.getRow(0).getLastCellNum();
     
     for(int r=0;r<=totalrow;r++)
     {
    	 XSSFRow row=(XSSFRow) s.getRow(r);
    	 
    	 
    	 for(int c=0;c<totalcell;c++)
    	 {
    		XSSFCell cell=row.getCell(c); 
    		System.out.print(cell.toString()+"\t"+"  ");
    	 }
    	 System.out.println();
     }
     book.close();
     file.close();
	}

}
