import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcelFile 
{
	public static void main(String[] args) throws Exception 
	{
		String path="F:/Book1.xlsx";
		FileInputStream fis=new FileInputStream(path);//mention the path of file
		Workbook wb=WorkbookFactory.create(fis);//to load the excel file
		Sheet sh=wb.getSheet("Sheet1");//loading the sheet of excel
		int rowCount=sh.getPhysicalNumberOfRows();//to get the row count
		int colCount= sh.getRow(0).getLastCellNum();//to get the cell count of 0th row
		
		for (int i = 0; i < rowCount ; i++) {
			for (int j = 0; j < colCount; j++) {
					Cell cl=sh.getRow(i).getCell(j);
					System.out.println(cl);		
			}
		}
	}
	public static String readCell(String path,String sheetName,int row,int col) throws Exception
	{
		FileInputStream fis=new FileInputStream(path);//mention the path of file
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheetName);
		Cell cl=sh.getRow(row).getCell(col);
		return cl.toString();
	}
}
