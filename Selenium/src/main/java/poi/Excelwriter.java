package poi;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelwriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	FileOutputStream fo = new FileOutputStream("C:\\Filehandling\\MyExel.xlsx");
  XSSFWorkbook workbook = new XSSFWorkbook();
  Sheet sheet = workbook.createSheet("My Sheet");
  Row row1 = sheet.createRow(0);
  //Row row2 = sheet.createRow(1);
  Cell cellA = row1.createCell(0);	
  cellA.setCellValue("hello");
  workbook.write(fo);
  workbook.close();
	}

}
