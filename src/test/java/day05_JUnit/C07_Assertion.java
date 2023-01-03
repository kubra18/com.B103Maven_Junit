package day05_junit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C07_Assertion {


    WebDriver driver;

    @Before
    public void setUp() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //2)https://www.youtube.com adresinegidin
        driver.get("https://www.amazon.com");
    }


    @After
    public void tearDown() throws InterruptedException {
        driver.close();
    }



    //   1)Bir class oluşturun:YoutubeAssertions


    //3)Aşağıdaki adları kullanarak 3 test metodu oluşturun ve gerekli testleriyapin


    //○ wrongTitleTest => Sayfa basliginin "youtube" olmadiginidogrulayin




    //○ title Test  => Sayfa başlığının "Amzon" oldugunu testedin
    @Test
    public void titleTest() {
        String actualTitle = driver.getTitle();
        String expectedTitle ="Amazon";
        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }

    //○ image Test => amazon resminin görüntülendiğini (isDisplayed()) testedin
    @Test
    public void imageTest() {
        Assert.assertTrue(driver.findElement(By.xpath("//a[@id='nav-logo-sprites']")).isDisplayed());
    }

    //○ Search Box 'in erisilebilir oldugunu test edin(isEnabled())
    @Test
    public void searchTest() {
        Assert.assertTrue(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).isEnabled());
    }
}