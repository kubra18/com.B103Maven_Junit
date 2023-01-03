package practices.practiceErol01.team21Practices;

import org.checkerframework.checker.units.qual.A;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Practice2 {
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
    public void practice() {
        //3. Ana sayfanın başarıyla göründüğünü doğrulayın
        WebElement syf = driver.findElement(By.xpath("//*[@alt='Website for automation practice']"));
        Assert.assertTrue(syf.isDisplayed());
    }
@Test
        public void practice2() throws InterruptedException {
        Thread.sleep(3000);
            //4. 'Kaydol / Giriş Yap' düğmesine tıklayın
    driver.findElement(By.xpath(" //*[text()=' Signup / Login']")).click();
    Thread.sleep(2000);

    //5. "Hesabınıza giriş yapın"ın göründüğünü doğrulayın
    WebElement lgn = driver.findElement(By.xpath("//*[text()='Login to your account']"));
    Assert.assertTrue(lgn.isDisplayed());

        //6. Doğru e-posta adresini ve şifreyi girin
    driver.findElement(By.xpath("//input[@type='email'][1]"))
            .sendKeys("k@gmail.com", Keys.TAB,"12345",Keys.TAB,Keys.ENTER);




        }






    }


//12345




    //7. 'Giriş' düğmesine tıklayın
    //8. "Kullanıcı adı olarak oturum açıldı" ifadesinin görünür olduğunu doğrulayın
    //9. 'Hesabı Sil' düğmesini tıklayın
    //10. 'HESAP SİLİNDİ!' görünür







//    WebDriver driver;
//    @Before
//    public void setUp() {
//        WebDriverManager.chromedriver().setup();
//         driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//    }
//    @Test
//    public void test01() throws InterruptedException {
//        //2. 'http://automationexercise.com' URL'sine gidin
//        driver.get("http://automationexercise.com");
//        //3. Ana sayfanın başarıyla göründüğünü doğrulayın
//       WebElement w= driver.findElement(By.xpath("//*[@src='/static/images/home/logo.png']"));
//        Assert.assertTrue(w.isDisplayed());
//        //4. 'Kaydol / Giriş Yap' düğmesine tıklayın
//        driver.findElement(By.xpath(" //*[text()=' Signup / Login']")).click();
//        //5. "Hesabınıza giriş yapın"ın göründüğünü doğrulayın
//        WebElement w1=driver.findElement(By.xpath("//*[text()='Login to your account']"));
//        Assert.assertTrue(w1.isDisplayed());
//       Thread.sleep(2000);
//        //6. Doğru e-posta adresini ve şifreyi girin
//        driver.findElement(By.xpath("(//*[@type='email'])[1]")).sendKeys("gulfen3@gmail.com",
//                Keys.TAB,"12345",Keys.TAB,Keys.ENTER);
//        //7. 'Giriş' düğmesine tıklayınd
//        //8. "Kullanıcı adı olarak oturum açıldı" ifadesinin görünür olduğunu doğrulayın
//        WebElement w2=driver.findElement(By.xpath("//*[text()=' Logged in as ']"));
//        Assert.assertTrue(w2.isDisplayed());
//        //9. 'Hesabı Sil' düğmesini tıklayın
//        driver.findElement(By.xpath("//*[@href='/delete_account']")).click();
//        //10. 'HESAP SİLİNDİ!' görünür
//    }
//}
//