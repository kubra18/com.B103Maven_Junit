package homeworksAhmetHoca;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;

public class HW1 extends TestBase {
    //Bir class olusturun: IframeOdev
    @Test
    public  void test01(){
        //https://the-internet.herokuapp.com/iframe  sitesine gidiniz
        driver.get("https://the-internet.herokuapp.com/iframe");

        //sayfadaki toplam iframe sayısını bulunuz.
        List<WebElement> a = driver.findElements(By.xpath("//iframe"));
        System.out.println("Sayfadaki toplam IFrame sayisi : "+a.size());

        //Sayfa basliginda 'Editor' yazını içerdiğini test edelim.
        String actualy=driver.findElement(By.xpath("//*[.='An iFrame containing the TinyMCE WYSIWYG Editor']")).getText();
        Assert.assertTrue(actualy.contains("Editor"));

        //Paragrafdaki yaziyi silelim
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//p[.='Your content goes here.']")).clear();

        //Sonrasinda paragrafa "iframein icindeyim" yazisini yazdıralım
        WebElement b = driver.findElement(By.xpath("//*[@id='tinymce']"));
        b.sendKeys("iframein icindeyim");

        //Alt kısımdaki yazının 'Elemental Selenium' yazisini içerdiğini test edelim

        driver.switchTo().parentFrame();
        String actually = driver.findElement(By.xpath("//*[@class='large-4 large-centered columns']")).getText();
        Assert.assertTrue(actually.contains("Elemental Selenium"));





        }

    }
















//package homeworks.homework;
//import org.junit.Assert;
//import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import utilities.TestBase;
//import java.util.List;
//public class H01 extends TestBase {
//    @Test
//    public void test01() throws InterruptedException {
//        //Bir class olusturun: IframeOdev
//        //https://the-internet.herokuapp.com/iframe  sitesine gidiniz
//        driver.get("https://the-internet.herokuapp.com/iframe");
//        //sayfadaki toplam iframe sayısını bulunuz.
//        List<WebElement> iframes = driver.findElements(By.tagName("iframe"));
//        //Sayfa basliginda 'Editor' yazını içerdiğini test edelim.
//        driver.findElement(By.tagName("h3"));
//        Thread.sleep(2000);
//        //Paragrafdaki yaziyi silelim
//        driver.switchTo().frame(0);
//        WebElement textBox = driver.findElement(By.xpath("//body/p"));
//        textBox.clear();
//        Thread.sleep(2000);
//        //Sonrasinda paragrafa "iframein icindeyim" yazisini yazdıralım
//        textBox.sendKeys("iframein icindeyim");
//        Thread.sleep(2000);
//        //Alt kısımdaki yazının 'Elemental Selenium' yazisini içerdiğini test edelim
//        driver.switchTo().defaultContent();
//        String text = driver.findElement(By.xpath("//*[@style='text-align: center;']")).getText();
//        String expectedText = "Elemental Selenium";
//        Assert.assertTrue(text.contains(expectedText));
//    }
//}