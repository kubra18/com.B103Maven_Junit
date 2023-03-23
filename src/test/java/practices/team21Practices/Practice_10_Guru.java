package practices.team21Practices;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class Practice_10_Guru extends TestBase {
    ///*
    @Test
    public void test01() throws InterruptedException {
        //       url'ye git: http://demo.guru99.com/popup.php
        driver.get(" http://demo.guru99.com/popup.php");

        WebElement iframe = driver.findElement(By.id("gdpr-consent-notice"));
        driver.switchTo().frame(iframe);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[text()='Accept All']")).click();
        driver.switchTo().defaultContent();
        driver.findElement(By.id("save")).click();


    }


    //       ilk pencereyi al
    //       "Click Here" butonuna tıklayın
    //       setteki tüm pencereyi al
    //       diğer pencereye geç
    //       e-posta kimliğini (somepne@gmail.com) girin ve bu girişe bir şey yazın
    //       Gönder düğmesine tıklayarak
    //       ""This access is valid only for 20 days."" ifadesinin beklendiği gibi olduğunu doğrula
    //       Tekrar ilk pencereye geç
    //       İlk pencerede olduğunu doğrula
    //      */
}



/*
@Test
    public void test01() throws InterruptedException {
        //   url'ye git: http://demo.guru99.com/popup.php
        driver.get(" http://demo.guru99.com/popup.php");
        //       ilk pencereyi al
        String windowHandle1 = driver.getWindowHandle();
        //       "Click Here" butonuna tıklayın
        driver.findElement(By.xpath("//a[normalize-space()='Click Here']")).click();
        //       setteki tüm pencereyi al
        Set<String> allWindows = driver.getWindowHandles();
        System.out.println(allWindows);
        Thread.sleep(3000);
        for (String eachWindow : allWindows) {
            if (!eachWindow.equals(windowHandle1)) {
                driver.switchTo().window(eachWindow);
                break;
            }
        }
        //       diğer pencereye geç
        String windowHandle2 = driver.getWindowHandle();
        System.out.println(windowHandle2);
        //       e-posta kimliğini (somepne@gmail.com) girin ve bu girişe bir şey yazın
        //       Gönder düğmesine tıklayarak
        driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("somepne@gmail.com", Keys.ENTER);
        //       ""This access is valid only for 20 days."" ifadesinin beklendiği gibi olduğunu doğrula
        String actualResult=driver.findElement(By.xpath("//h3[normalize-space()='This access is valid only for 20 days.']")).getText();
        String expectedResult="This access is valid only for 20 days.";
        Assert.assertEquals(expectedResult,actualResult);
        //       Tekrar ilk pencereye geç
        Thread.sleep(3000);
        driver.switchTo().window(windowHandle1);
        //       İlk pencerede olduğunu doğrula
        Assert.assertTrue(driver.findElement(By.xpath("//a[normalize-space()='Click Here']")).isDisplayed());
    }
 */

//erol hocanin cözümü
/*
package practice02;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;
import java.util.List;
public class P03 extends TestBase {
    @Test
    public void test01() throws InterruptedException {
        //1) http://demo.guru99.com/test/guru99home/ sitesine gidiniz
        driver.get("http://demo.guru99.com/test/guru99home/");
        //2) sayfadaki iframe sayısını bulunuz.
        List<WebElement> iframe = driver.findElements(By.xpath("//iframe"));
        System.out.println("iframe Sayisi = "+iframe.size());
        //3) ilk iframe'deki (Youtube) play butonuna tıklayınız.
        WebElement frame = driver.findElement(By.xpath("//*[@wmode='transparent']"));
        driver.switchTo().frame(frame);
        driver.findElement(By.cssSelector("button[aria-label='Oynat']")).click();
        Thread.sleep(3000);
        //4) ilk iframe'den çıkıp ana sayfaya dönünüz
        driver.navigate().refresh();
        //5) ikinci iframe'deki (Jmeter Made Easy) linke (https://www.guru99.com/live-selenium-project.html)
        //tıklayınız
        WebElement iframe2 = driver.findElement(By.xpath("//*[@id='a077aa5e']"));
        driver.switchTo().frame(iframe2);
        driver.findElement(By.xpath("//*[@src='Jmeter720.png']")).click();
    }
}


 */