package data_Driven_testing;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.openqa.selenium.remote.http.HttpClient.Factory;

public class WAS_to_fetch_data_from_excel_sheet 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("C:\\Users\\nanda\\eclipse-workspace\\Mywork\\excel1\\registred stds csv.xlsx");
//		FileInputStream fis=new FileInputStream("C:\\Users\\nanda\\eclipse-workspace\\Mywork\\testdata\\datadriventesting.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		Sheet s=book.getSheet("Sheet1");
//		Row r=s.getRow(0);
//		Cell c=r.getCell(0);
//		String value=c.toString();
//		System.out.println(value);
		int totalrow=s.getLastRowNum();
		int totalcells=s.getRow(0).getLastCellNum();
		System.out.println("number of rows"+totalrow);
		System.out.println("number of cell"+totalcells);
		for(int r=0;r<=totalrow;r++)
		{
			XSSFRow row= (XSSFRow) s.getRow(r);
			for(int c=0;c<totalcells;c++)
			{
				XSSFCell cell=row.getCell(c);
				System.out.print(cell.toString()+"\t");
			}
			System.out.println();
		}
		book.close();
		fis.close();
}


}
