package day05_JUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_JUnitIlkTest {
    @Test
    public void test01(){
        WebDriver drive = new ChromeDriver();
        drive.manage().window().maximize();
        drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        drive.get("https://techproeducation.com");

    }
}
