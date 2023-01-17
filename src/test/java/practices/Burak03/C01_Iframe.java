package practices.Burak03;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;
public class C01_Iframe extends TestBase {
    // ...Exercise 1...
    // https://html.com/tags/iframe sayfasına gidiniz
    // Videoyu görecek kadar asagiya ininiz
    // Videoyu izlemek icin Play tusuna basiniz
    // Videoyu calistirdiginizi test ediniz
    // 'Powerful,but easy to misuse' yazısının gorunur oldugunu test ediniz
    @Test
    public void test01() throws InterruptedException {
        // https://html.com/tags/iframe sayfasına gidiniz
        driver.get("https://html.com/tags/iframe");
        // Videoyu görecek kadar asagiya ininiz
        Actions actions=new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(3000);
        // Videoyu izlemek icin Play tusuna basiniz
        //Play'i dogru locate edip click yapmamıza ragmen videoyu calıstırmadı.
        //Bunun üzerine HTML kodlarını inceleyince Play'in aslında bir iframe içerisinde
        //oldugunu gördük.
        //Bu durumda önce iframi'i locate edip sonra switchTo() ile iframe'e gecmeliyiz.
        WebElement iframe=driver.findElement(By.xpath("//iframe[@src='https://www.youtube.com/embed/owsfdh4gxyc']"));
        driver.switchTo().frame(iframe);
        WebElement play=driver.findElement(By.xpath("//button[@class='ytp-large-play-button ytp-button ytp-large-play-button-red-bg']"));
        play.click();
        // Videoyu calistirdiginizi test ediniz
        WebElement altyazisekmesi=driver.findElement(By.xpath("//*[@aria-label='YouTube Video Oynatıcısı']"));
        Assert.assertTrue(altyazisekmesi.isDisplayed());
        // 'Powerful,but easy to misuse' yazısının gorunur oldugunu test ediniz
        driver.switchTo().parentFrame();
        WebElement Powerful=driver.findElement(By.xpath("//span[text()='Powerful, but easy to misuse']"));
        Assert.assertTrue(Powerful.isDisplayed());
    }
}