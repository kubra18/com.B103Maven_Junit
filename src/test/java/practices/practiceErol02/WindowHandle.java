package practices.practiceErol02;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WindowType;
import utilities.TestBase;

public class WindowHandle extends TestBase {
    @Test
    public void test01()
    { //Amazon anasayfa adresine gidin.
        driver.get("https://amazon.com");

        //Sayfa’nin window handle degerini String bir degiskene atayin
        String amazonwindow = driver.getWindowHandle();

        //Sayfa title’nin “Amazon” icerdigini test edin
        String title = driver.getTitle();
        Assert.assertTrue(title.contains("Amazon"));

        //Yeni bir tab olusturup, acilan tab’da techproeducation.com adresine gidin
        driver.switchTo().newWindow(WindowType.TAB);//yeni bir sekme acmis olduk
        driver.get("https://techproeducation.com");

        //Sayfa title’nin “TECHPROEDUCATION” icerdigini test edin
        String title2 = driver.getTitle();
        Assert.assertFalse(title2.contains("TECHPROEDUCATION"));

        //Yeni bir window olusturup, acilan sayfada walmart.com adresine gidin
        driver.switchTo().newWindow(WindowType.WINDOW);//yeni bir window acmis olduk
        driver.get("https://walmart.com");


        //Sayfa title’nin “Walmart” icerdigini test edin
        String walmarttitlr = driver.getTitle();
        Assert.assertTrue(walmarttitlr.contains("Walmart"));

        //Ilk acilan sayfaya donun ve amazon sayfasina dondugunuzu test edin
        driver.switchTo().window(amazonwindow);
        String url = driver.getCurrentUrl();
        Assert.assertEquals("https://www.amazon.com/",url);
    }







}
