package practices.team21Practices;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Practice4 {
    WebDriver driver;


    @Before

    //1. Tarayıcıyı başlatın
    public void setup() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //2. 'http://automationexercise.com' URL'sine gidin
        driver.get("http://automationexercise.com");
    }

    @Test
        public void test01() {


        //3. Ana sayfanın başarıyla göründüğünü doğrulayın
            WebElement syf = driver.findElement(By.xpath("//*[@alt='Website for automation practice']"));
            Assert.assertTrue(syf.isDisplayed());

            //4. 'Kaydol / Giriş Yap' düğmesine tıklayın
        driver.findElement(By.xpath("//*[text()=' Signup / Login']")).click();
        //5. "Hesabınıza giriş yapın"ın göründüğünü doğrulayın
        String hsp = driver.findElement(By.xpath("//*[text()='Login to your account']")).getText();
        String expected ="Login to your account";
        Assert.assertEquals(hsp,"Login to your account");
        //6. Yanlış e-posta adresi ve şifre girin
        //7. 'Giriş' düğmesine tıklayın
        driver.findElement(By.xpath("//*[@data-qa='login-email']")).sendKeys("kjdhksjd@gmail.com", Keys.TAB,"12e3324335",Keys.TAB,Keys.ENTER);
        //8. 'E-postanız veya şifreniz yanlış!' hatasını doğrulayın. görünür
        String a = driver.findElement(By.xpath("//*[@style='color: red;']")).getText();
        String expected1 = "Your email or password is incorrect!";
        Assert.assertEquals(expected1,a);

        }
        }













