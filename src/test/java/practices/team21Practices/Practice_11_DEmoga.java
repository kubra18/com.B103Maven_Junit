package practices.team21Practices;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class Practice_11_DEmoga extends TestBase {

    @Test
    public void test1(){

        //https://demoqa.com/ url'ine gidin.
driver.get("https://demoqa.com/");

//Alerts, Frame & Windows Butonuna click yap
driver.findElement(By.xpath("//*[@src='https://ad.plus/adplus-advertising.svg']")).click();

//""Please select an item from left to start practice."" yazısının görünür olduğunu doğrula

WebElement a = driver.findElement(By.xpath("//*[text()='Please select an item from left to start practice.']"));
Assert.assertTrue(a.isDisplayed());

    }




//Sol'da açılan Menu den ""Browser Windows"" butonuna click yap
//New Tab butonunun görünür olduğunu doğrula
//New Tab butonuna click yap
//Açılan yeni Tab da ""This is a sample page"" yazısının görünür olduğunu doğrula
//İlk Tab'a geri dön
////New Tab butonunun görünür olduğunu doğrula
}
