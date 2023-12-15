package Baseclass;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Utils {


    public static String readExcelFile(String path, String sheetName, int rowIndex, int columnIndex) throws IOException {
        File file = new File(path);
        FileInputStream fis = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        Row row = workbook.getSheet(sheetName).getRow(rowIndex);
        Cell cell = row.getCell(columnIndex);
        String data = "";
        if (cell != null) {
            CellType cellType = cell.getCellType();
            if (cellType == CellType.STRING) {
                data = cell.getStringCellValue();
            } else if (cellType == CellType.NUMERIC) {
            	 double numericValue = cell.getNumericCellValue();
                 int intValue = (int) numericValue;
                 data = String.valueOf(intValue);
            }
        }
		workbook.close();
        return data;
    }
}
