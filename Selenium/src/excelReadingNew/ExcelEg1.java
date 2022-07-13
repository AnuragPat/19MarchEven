package excelReadingNew;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File myfile=new File("G:\\NewSelenium\\My first Excel Sheet.xlsx") ;
		Workbook work = WorkbookFactory.create(myfile);
		Sheet mySheet = work.getSheet("Sheet2");
		Row myRow = mySheet.getRow(0);
		Cell myCell = myRow.getCell(0);
		CellType cellInfo = myCell.getCellType();
		System.out.println(cellInfo);
		System.out.println("=======================");


	}

}
