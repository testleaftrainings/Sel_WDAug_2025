package testcases;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CommonExcelIntegration {

	public static String[][] readData(String excelFileName) throws IOException {
		//open the workbook and set the file path
		XSSFWorkbook wb=new XSSFWorkbook("./data/"+excelFileName+".xlsx");
		
		//enter to worksheet
		XSSFSheet sheetAt = wb.getSheetAt(0);
		//XSSFSheet sheet = wb.getSheet("sheet1");
		
		//enter row
		/*XSSFRow row = sheetAt.getRow(2);
		//enterto the specific cell
		XSSFCell cell = row.getCell(1);
		String stringCellValue = cell.getStringCellValue();
		System.out.println(stringCellValue);
		
		int physicalNumberOfRows = sheetAt.getPhysicalNumberOfRows();
		System.out.println(physicalNumberOfRows);
		
		//entirerow
		for (int i = 0; i <=rowCount; i++) {
			XSSFRow row2 = sheetAt.getRow(i);
			System.out.println(row2);*/
			
		//}
		//entireData
		//to find the rowCount
				int rowCount = sheetAt.getLastRowNum();
				System.out.println(rowCount);
				
				//to find the colummnCount
				short columnCount = sheetAt.getRow(1).getLastCellNum();
				System.out.println(columnCount);
				
				//create a two dimensional array
				String[][] data=new String[rowCount][columnCount];
		for (int i = 1; i <=rowCount; i++) {
			for (int j = 0; j < columnCount; j++) {
				String stringCellValue2 = sheetAt.getRow(i).getCell(j).getStringCellValue();
				
				  data[i-1][j]=stringCellValue2;//[0][0][0][1][0][2]
				//System.out.println(stringCellValue2);
			}
			
		}
		
		wb.close();
		return data;

	}

}
