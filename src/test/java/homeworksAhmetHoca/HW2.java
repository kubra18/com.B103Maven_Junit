package homeworksAhmetHoca;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class HW2 extends TestBase {
    @Test
    public void test01(){
        //https://testcenter.techproeducation.com/index.php?page=multiple-windows
        driver.get("https://testcenter.techproeducation.com/index.php?page=multiple-windows");

        //Title in ‘Windows’ oldugunu test edin
        String Actuallytitle = driver.getTitle();
        Assert.assertEquals(Actuallytitle,"Windows");

        //Click here a tiklayin
        driver.findElement(By.xpath("//*[.='Click Here']")).click();

        //Sonra açılan sayfadaki title in ‘New Window’ oldugunu dogrulayin
        switchToWindow("New Window");
        String targetTitle = driver.getTitle();
        switchToWindow(targetTitle);
        Assert.assertEquals("New Window",targetTitle);

    }

}
