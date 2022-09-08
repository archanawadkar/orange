package Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parametrization {

	public static String getdata (String sheet,int row,int cell) throws EncryptedDocumentException, IOException  {
		FileInputStream file=new FileInputStream("C:\\Users\\Archana\\eclipse-workspace\\OrangeHRM\\src\\test\\resources\\OrangeLoginCredentials.xlsx");
		
		String result=WorkbookFactory.create(file).getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		
		return result;
	
		
	}
		
}
