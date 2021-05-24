package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReuseableComponents {
	
	public static Properties prop;
	DataFormatter formatter = new DataFormatter();
	FileInputStream fis;
	
	public String getProperty(String key) throws IOException
	{
		prop=new Properties();
		FileInputStream fis= new FileInputStream("./src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		
		String Value=prop.getProperty(key);
		return Value;
		
	}
	
	public Object[][] readDataFromExcel(int sheetIndex) throws IOException
	{
		XSSFWorkbook workbook = new XSSFWorkbook(getFis("./src\\main\\java\\resources\\data.xlsx"));
		XSSFSheet sheet = workbook.getSheetAt(sheetIndex);
		int rowCount = sheet.getPhysicalNumberOfRows();
		XSSFRow row = sheet.getRow(0);
		int colCount = row.getLastCellNum();
		
		Object data[][] = new Object[rowCount-1][colCount];
		for(int i=0;i<rowCount-1;i++)
		{
			row=sheet.getRow(i+1);
			for(int j=0;j<colCount;j++)
			{
				XSSFCell cell=row.getCell(j);
				data[i][j] =formatter.formatCellValue(cell);
			}
			
		}
		workbook.close();
		return data;
			}
	
	public FileInputStream getFis(String path)throws FileNotFoundException
	{
		fis = new FileInputStream(path);
		return fis;
	}

}