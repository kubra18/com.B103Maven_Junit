package practices.Burak04;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

public class C04_ActionMoveToElement extends TestBase {
    @Test
    public void test04(){
        // https://amazon.com adresine gidiniz
        driver.get("https://amazon.com");
        // sag ust bolumde bulunan dil secenek menusunun acilmasi icin mause'u bu menunun ustune getirelim
        Actions actions = new Actions(driver);
        WebElement dil = driver.findElement(By.xpath("//*[@class='icp-nav-link-inner']"));
        actions.moveToElement(dil).perform();
        // Change country/region butonuna basiniz

        WebElement country =driver.findElement(By.xpath("(//*[text()='Change country/region.'])[1]"));
        country.click();

        // United States dropdown'undan 'Turkey (Türkiye)' seciniz
        WebElement dd = driver.findElement(By.xpath("(//*[@id='icp-dropdown'])[1]"));
        Select select = new Select(dd);
        select.selectByVisibleText("Turkey (Türkiye)");

        // Go to website butonuna tiklayiniz

        // acilan yeni sayfadanin Title'inin Elektronik icerdigini test ediniz

    }
}
