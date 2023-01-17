package homeworksAhmetHoca;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class HW5_ extends TestBase {
    //Keyboard Base Actions
    //Homework

    //Yeni Class olusturun ActionsClassHomeWork
    //1- "http://webdriveruniversity.com/Actions" sayfasina gidin
    @Test
    public void test01(){
        driver.get("http://webdriveruniversity.com/Actions");

        //2- Hover over Me First" kutusunun ustune gelin
        Actions actions = new Actions(driver);

        WebElement elm = driver.findElement(By.xpath("//*[text()='Hover Over Me First!']"));
        actions.moveToElement(elm).perform();



        //Link 1" e tiklayin
        driver.findElement(By.xpath("(//a[text()='Link 1'])[1]")).click();

        //Popup mesajini yazdirin
        System.out.println(driver.switchTo().alert().getText());
        //Popup'i tamam diyerek kapatin
        driver.switchTo().alert().accept();
        //“Click and hold" kutusuna basili tutun
        WebElement basilitut =driver.findElement(By.id("click-box"));
        actions.clickAndHold(basilitut).perform();


        //7-“Click and hold" kutusunda cikan yaziyi yazdirin
        System.out.println(basilitut.getText());

        // 8- “Double click me" butonunu cift tiklayin (Cift tiklandigini kontrol et)
        WebElement dblklckme = driver.findElement(By.xpath("//*[.='Double Click Me!']"));
        String beforeDblklckme = dblklckme.getAttribute("class");
        actions.doubleClick(dblklckme).perform();
        String afterDblklckme = dblklckme.getAttribute("class");
        Assert.assertEquals(beforeDblklckme,afterDblklckme);


    }

}
