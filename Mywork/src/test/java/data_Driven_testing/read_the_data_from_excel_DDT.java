package data_Driven_testing;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;

public class read_the_data_from_excel_DDT {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
        FileInputStream fil=new FileInputStream("C:\\Users\\nanda\\eclipse-workspace\\Mywork\\excel1\\DDT abc.xlsx");
        Workbook book=WorkbookFactory.create(fil);
        Sheet sh=book.getSheet("Sheet1");
        int row=sh.getLastRowNum();
        int cell=sh.getRow(0).getLastCellNum();
        for(int i=0;i<=row;i++)
        {
        	XSSFRow roww=(XSSFRow)sh.getRow(i);
        	
        	for(int j=0;j<cell;j++)
        	{
        		XSSFCell celll=roww.getCell(j);
        		System.out.print(celll.toString()+"\t"+"        ");
        		
        	}
        	System.out.println();
        }
        
        book.close();
        fil.close();
		
	}
}
