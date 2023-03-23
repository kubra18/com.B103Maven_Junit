package practices.practiceErol04;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WindowType;
import utilities.TestBase;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Tekrar extends TestBase {
    String tarih;

    @Test
    public void test01() throws IOException {
        //Amazon sayfasına gidelim
        driver.get("//https:www.amazon.com");
        String amazon = driver.getWindowHandle();

waitFor(2);
        //Tüm sayfanın resmini alalım
        tarih= new SimpleDateFormat("hh_mm_ss_dd_MM_yy").format(new Date());
waitFor(2);
        TakesScreenshot ts = (TakesScreenshot) driver;
        FileUtils.copyFile(ts.getScreenshotAs(OutputType.FILE),new File("target/tumSayfaResmi/"+tarih+".jpeg"));
waitFor(2);
        //Yeni bir sekmede techproeducation sayfasına gidip sayfanın resmini alalım
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("www.techproeducation.com");

        waitFor(2);


        //Tekrar amazon sayfasına dönüp iphone aratalım
        driver.switchTo().window(amazon);
        driver.get("//https:www.amazon.com");



        //Arama sonucunun resmini alalım

    }

}

