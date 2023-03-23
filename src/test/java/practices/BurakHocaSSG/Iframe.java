package practices.BurakHocaSSG;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;


public class Iframe extends TestBase {



        // ...Exercise 1...


        // https://www.jqueryscript.net/demo/jQuery-Plugin-For-Responsive-Flexible-Iframes-Flexy/ sayfasına gidiniz
        // Videoyu görecek kadar asagiya ininiz
        // Videoyu izlemek icin Play tusuna basiniz
        // videoyu durdurunuz
        // videoyu tam ekran yapınız
        // videoyu calıstırınız
        // videoyu kucultunuz
        // videoyu durdurunuz
        // Videoyu calistirdiginizi test ediniz
        // 'jQuery Flexy Plugin Demos' yazısının gorunur oldugunu test ediniz


        @Test
        public void test01() throws InterruptedException {

            // 'https://www.jqueryscript.net/demo/jQuery-Plugin-For-Responsive-Flexible-Iframes-Flexy/' sayfasına gidiniz
            driver.get("https://www.jqueryscript.net/demo/jQuery-Plugin-For-Responsive-Flexible-Iframes-Flexy/");






            // Videoyu görecek kadar asagiya ininiz
            Actions actions=new Actions(driver);
            actions.sendKeys(Keys.PAGE_DOWN).perform();





            // Videoyu izlemek icin Play tusuna basiniz
            WebElement iframe=driver.findElement(By.xpath("//iframe[@src='https://www.youtube.com/embed/x3kfyZJhC3U?rel=0&showinfo=0']"));
            driver.switchTo().frame(iframe);


            //Play'i dogru locate edip click yapmamıza ragmen videoyu calıstırmadı.
            //Bunun üzerine HTML kodlarını inceleyince Play'in aslında bir iframe içerisinde
            //oldugunu gördük.
            //Bu durumda önce iframi'i locate edip sonra switchTo() ile iframe'e gecmeliyiz.

            WebElement playTusu=driver.findElement(By.xpath("//button[@class='ytp-large-play-button ytp-button ytp-large-play-button-red-bg']"));
            playTusu.click();


            Thread.sleep(3000);






            // videoyu durdurunuz
            WebElement videoDurdur=driver.findElement(By.xpath("//button[@class='ytp-play-button ytp-button']"));
            videoDurdur.click();

            Thread.sleep(3000);




            // videoyu tam ekran yapınız
            WebElement tamEkran=driver.findElement(By.xpath("//button[@class='ytp-fullscreen-button ytp-button']"));
            tamEkran.click();

            Thread.sleep(3000);



            // videoyu calıstırınız
            videoDurdur.click();

            Thread.sleep(3000);



            // videoyu kucultunuz
            tamEkran.click();

            Thread.sleep(3000);



            // videoyu durdurunuz

            videoDurdur.click();

            Thread.sleep(3000);







            // Videoyu calistirdiginizi test ediniz
            WebElement youTubeYazısı=driver.findElement(By.xpath("//a[@class='ytp-youtube-button ytp-button yt-uix-sessionlink']"));

            Assert.assertTrue(youTubeYazısı.isDisplayed());






            // 'jQuery Flexy Plugin Demos' yazısının gorunur oldugunu test ediniz

            driver.switchTo().parentFrame();



            WebElement yazı=driver.findElement(By.xpath("//h1[text()='jQuery Flexy Plugin Demos']"));
            Assert.assertTrue(yazı.isDisplayed());


        }
    }

