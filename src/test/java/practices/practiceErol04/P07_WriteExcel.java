package practices.practiceErol04;

import org.apache.poi.ss.usermodel.*;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class P07_WriteExcel {


    @Test
    public void name() throws IOException {
        String dosyaYolu = "/Users/kubra/Desktop/data.xlsx";
        FileInputStream fis = new FileInputStream(dosyaYolu);
        Workbook workbook = WorkbookFactory.create(fis);

        workbook.getSheet("Sayfa1").createRow(3).createCell(0).setCellValue("2. Kullanıcı Bilgileri");
        workbook.getSheet("Sayfa1").createRow(4).createCell(0).setCellValue("email");
        workbook.getSheet("Sayfa1").createRow(5).createCell(0).setCellValue("password");
        FileOutputStream fos = new FileOutputStream(dosyaYolu);
       workbook.write(fos);
    }
    @Test
    public void name01() throws IOException {
        //Yeni bir methodda kullanıcı bilgileri başlığını silelim
        String dosyaYolu = "/Users/kubra/Desktop/data.xlsx";
        FileInputStream fis = new FileInputStream(dosyaYolu);
        Workbook workbook = WorkbookFactory.create(fis);
        Sheet sheet = workbook.getSheet("Sayfa1");
        Row row = sheet.getRow(3);
        Cell cell = row.getCell(0);
        row.removeCell(cell);
        FileOutputStream fos = new FileOutputStream(dosyaYolu);
        workbook.write(fos);

    }//Data isimli excel dosyasına yeni kullanıcı adı ve password ekliyelim
    //Yeni bir methodda kullanıcı bilgileri başlığını silelim
}
