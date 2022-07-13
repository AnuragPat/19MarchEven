package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File myFile=new File("G:\\NewSelenium\\My first Excel Sheet.xlsx");
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet2");
       int noOfRows = mySheet.getLastRowNum();
		System.out.println("Total rows are "+noOfRows);
		
		short noOfCell = mySheet.getRow(noOfRows).getLastCellNum();
		System.out.println(noOfCell);//it gives actual value not selenium value
		int columnCount = noOfCell-1;
		System.out.println("Total column are "+columnCount);
		
		System.out.println("Cell type is "+mySheet.getRow(0).getCell(1).getCellType());
		
		
		
		for(int i=0;i<=noOfRows;i++) 
		{
			for(int j=0;j<=columnCount;j++)//for cell for inner loop
			{
				Cell myCell = mySheet.getRow(i).getCell(j);
				CellType dataType = myCell.getCellType();
				
				if(dataType==CellType.STRING) {
					
					
					String value = myCell.getStringCellValue();
					
					System.out.print(value +" ");
				}
				else if(dataType==CellType.BLANK) {
				System.out.print(" ");
				}
				else if(dataType==CellType.BOOLEAN) {
					boolean value = myCell.getBooleanCellValue();
					System.out.print(value +" "); 
				}
				else if(dataType==CellType.NUMERIC) {
					double value = myCell.getNumericCellValue();
					System.out.print(value+" ");
					
				}
			}
			
			System.out.println();
		}
	}

}
