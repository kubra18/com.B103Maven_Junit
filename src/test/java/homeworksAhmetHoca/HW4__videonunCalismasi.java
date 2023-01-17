package homeworksAhmetHoca;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class HW4__videonunCalismasi extends TestBase {
    @Test
    public void test01(){
        //Bir Class olusturalim KeyboardActions2
        //https://html.com/tags/iframe/ sayfasina gidelim
        driver.get("https://html.com/tags/iframe/");
        waitFor(2);

        //video’yu gorecek kadar asagi inin
        Actions actions = new Actions(driver);
        waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).perform();
        waitFor(2);

        //videoyu izlemek icin Play tusuna basin

        driver.switchTo().frame(0);
        WebElement video = driver.findElement(By.xpath("//button[@class='ytp-large-play-button ytp-button ytp-large-play-button-red-bg']"));

        video.click();


        // videoyu calistirdiginizi test edin
        waitFor(5);
        WebElement altyazisekmesi=driver.findElement(By.xpath("//*[@aria-label='YouTube Video Oynatıcısı']"));
        Assert.assertTrue(altyazisekmesi.isDisplayed());
    }

}
