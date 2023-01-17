package CanHocaSeleniumStudy;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.TestBase;

import java.time.Duration;

public class HW11_MarketTask extends TestBase {
    @Test
    public void test01() {

        //go to amazon
        driver.get("https://www.amazon.com");
        waitFor(3);

        //search iphone 13 512
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone13 512", Keys.ENTER);
        waitFor(3);

        //check that the results are listed
        String arananKelime = driver.findElement(By.xpath("(//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style'])[1]")).getText();
        Assert.assertTrue(arananKelime.contains("Iphone13 512"));
    }
        public void clickIPhoneAtTheTopOfTheList(int index) {
            WebDriverWait wait= wait=new WebDriverWait(driver,Duration.ofSeconds(5L));
            WebElement TopOfTheList= driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])"+"["+index+"]"+""));
            wait.until(ExpectedConditions.visibilityOf(TopOfTheList));
            TopOfTheList.click();
        }



    //click i phone13 at the top of list
    //log the following values for each size.Size information Price Color Stock status
}

