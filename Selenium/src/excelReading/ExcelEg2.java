package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		File myfile=new File("G:\\NewSelenium\\My first Excel Sheet.xlsx") ;
		Workbook work = WorkbookFactory.create(myfile);
		Sheet mySheet = work.getSheet("Sheet2");
		Row myRow = mySheet.getRow(0);
		Cell myCell = myRow.getCell(1);
		CellType cellInfo = myCell.getCellType();// return type is which type of data
		System.out.println("cellInfo is "+cellInfo);
		System.out.println("=======================");

		//code for reading multiple data from excel
		Sheet mySheet2=work.getSheet("Sheet1");
		for(int i=0;i<=1;i++)//for rows
		{
			for(int j=0;j<=2;j++)//inner loop for cell
			{
				String Name = mySheet2.getRow(i).getCell(j).getStringCellValue();
				System.out.print(Name+" ");
			}
			
			System.out.println();
		}
		System.out.println("================================");
	}

}
