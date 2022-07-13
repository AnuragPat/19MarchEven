package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		// TO create object of file class
		File myFile=new File("G:\\NewSelenium\\My first Excel Sheet.xlsx") ;
		
		//Using WrokBook Factory class call create method & pass details
        // to read String type value
		String City = WorkbookFactory.create(myFile).getSheet("Sheet2").getRow(0).getCell(0).getStringCellValue();
        System.out.println("City is "+City +".");
        
        System.out.println(WorkbookFactory.create(myFile).getSheet("Sheet2").getRow(0).getCell(1).getStringCellValue());
	
	   // to read numeric value
	   System.out.println(WorkbookFactory.create(myFile).getSheet("Sheet2").getRow(1).getCell(0).getNumericCellValue() );
	   double NumericValue = WorkbookFactory.create(myFile).getSheet("Sheet2").getRow(1).getCell(0).getNumericCellValue();
	   System.out.println("Numeric Value is "+NumericValue);
	
	// to read boolean value
	  boolean value = WorkbookFactory.create(myFile).getSheet("Sheet2").getRow(1).getCell(1).getBooleanCellValue();
	  System.out.println("Boolean value is "+value);
	 System.out.println(WorkbookFactory.create(myFile).getSheet("Sheet2").getRow(1).getCell(1).getBooleanCellValue());
	  
	 
	// to read character
	 String Character = WorkbookFactory.create(myFile).getSheet("Sheet2").getRow(2).getCell(0).getStringCellValue();
	System.out.println(Character);
	
	
	
	}

}
