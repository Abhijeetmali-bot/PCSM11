package demoTestNg;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class ReadDataProviderDemoExcel {

	@DataProvider
	public static String[][]read()throws Exception
	{ 
	String st[][];
	String path="F:/Book1.xlsx";
	FileInputStream fis=new FileInputStream(path);//mention the path of file
	Workbook wb=WorkbookFactory.create(fis);//to load the excel file
	Sheet sh=wb.getSheet("Sheet1");//loading the sheet of excel
	int rowCount=sh.getPhysicalNumberOfRows();//to get the row count
	int colCount=sh.getRow(0).getLastCellNum();//to get the cell count of 0th row
	st=new String [rowCount -1][colCount];
	for(int i=1;i<rowCount;i++)
	{
		for(int j=0;j<colCount;j++)
		{
			Cell cl=sh.getRow(i).getCell(j);
			st[i-1][j]=cl.toString();
		}
	}
	return st;
}
}
