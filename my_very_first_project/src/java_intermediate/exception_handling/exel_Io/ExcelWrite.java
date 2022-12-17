package java_intermediate.exception_handling.exel_Io;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
public class ExcelWrite {
    public static void main(String[] args) throws IOException {

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Data");

        Map<String, Object[]> data = new TreeMap<>();

        data.put("1", new Object[]{"Emp_ID", "F_Name", "L_Name"});
        data.put("2", new Object[]{"1256879", "Ahmet", "Ankara"});
        data.put("3", new Object[]{"1052698", "Antony", "Paris"});
        data.put("4", new Object[]{"1528964", "Josephine", "Corso"});

        Set<String> write = data.keySet();

        int tez = 0;

        for (String key:write){

            XSSFRow row = sheet.createRow(tez++);

            Object[] objectArr = data.get(key);

            int cellnum = 0;

            for (Object obj : objectArr){

                Cell cell = row.createCell(cellnum++);

                cell.setCellValue((String)(obj));
            }
        }
        FileOutputStream out = new FileOutputStream
                ("C:\\Users\\tezir\\java_Project\\final_java\\Turgut2.xlsx");

        workbook.write(out);

        out.close();
    }
}
