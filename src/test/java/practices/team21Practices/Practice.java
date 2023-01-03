package practices.practiceErol01.team21Practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Practice {
    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
}
    @After
    public void tearDown() {

        //driver.close();
    }

    @Test
    public void test01() {
        //1)http://automationpractice.com/index.php sayfasina gidelim
        driver.get("http://automationpractice.com/index.php");

    }
}

//2)Sing in butonuna basalim
//3)Email kutusuna @isareti olmayan bir mail yazip enter'a bastigimizda
// "invalid email address" uyarisi ciktigini test edelim