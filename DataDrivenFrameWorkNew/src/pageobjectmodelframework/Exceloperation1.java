package pageobjectmodelframework;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Exceloperation1
{
public static String Readdata(String sheetname,int rowno,int cellno) throws EncryptedDocumentException, InvalidFormatException, IOException
	
	{
	FileInputStream e1 =new FileInputStream("D:\\testdata\\userdata.xlsx");
	Workbook w1 = WorkbookFactory.create(e1);
	String s=w1.getSheet(sheetname).getRow(rowno).getCell(cellno).getStringCellValue();
     return s;
			}

	public static void writedata(String sheetname,int rowno,int cellno,String s) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		FileInputStream e1 =new FileInputStream("D:\\testdata\\userdata.xlsx");
	    Workbook w1=WorkbookFactory.create(e1);
		w1.getSheet(sheetname).getRow(rowno).createCell(cellno).setCellValue(s);
     }
}
