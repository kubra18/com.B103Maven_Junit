package practices.practiceErol01.team21Practices;

import org.checkerframework.checker.units.qual.K;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Practice3 {
    WebDriver driver;

    @Before

    //1. Tarayıcıyı başlatın
    public void setup() {
//1. Launch browser
//2. Navigate to url 'http://automationexercise.com'
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("http://automationexercise.com");
    }
    @Test
    public void practice() throws InterruptedException {
        //3. Ana sayfanın başarıyla göründüğünü doğrulayın
        WebElement syf = driver.findElement(By.xpath("//*[@alt='Website for automation practice']"));
        Assert.assertTrue(syf.isDisplayed());
        //4. Click on 'Signup / Login' button
        driver.findElement(By.xpath(" //*[text()=' Signup / Login']")).click();
        Thread.sleep(2000);
        //5. Verify 'New User Signup!' is visible
        WebElement usr = driver.findElement(By.xpath("//*[text()='New User Signup!']"));
        Assert.assertTrue(usr.isDisplayed());
        Thread.sleep(2000);
        //6. Enter name and email address
        driver.findElement(By.xpath("//*[@data-qa='signup-name']")).click();
        driver.findElement(By.xpath("//*[@type='text']")).sendKeys("kübra", Keys.TAB,"k@gmail.com",Keys.TAB,Keys.ENTER);
        Thread.sleep(2000);
        WebElement d = driver.findElement(By.xpath("//*[@id='id_gender2']"));
        d.sendKeys(Keys.ENTER,Keys.TAB);
        d.sendKeys("12345");
        d.sendKeys(Keys.TAB);
        WebElement gun = driver.findElement(By.id("days"));
        Select gunDropdown = new Select(gun);
        gunDropdown.selectByVisibleText("18");//CASE SENSITIVE -

        WebElement ay = driver.findElement(By.xpath("//select[@id='months']"));
        Select ayDropdown = new Select(ay);
        ayDropdown.selectByValue("10");

        WebElement year = driver.findElement(By.xpath("//select[@id='years']"));
        Select yearDropdown = new Select(year);
        yearDropdown.selectByIndex(33);
        Thread.sleep(2000);

        d.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER);
        d.sendKeys("kübra");
        d.sendKeys(Keys.TAB);
        d.sendKeys("tanribuyurdu");
        d.sendKeys(Keys.TAB);
        d.sendKeys(Keys.TAB);
        d.sendKeys("almanya");
        d.sendKeys(Keys.TAB);
        Thread.sleep(2000);
    }

}

//3. Verify that home page is visible successfully
//4. Click on 'Signup / Login' button
//5. Verify 'New User Signup!' is visible
//6. Enter name and email address
//7. Click 'Signup' button
//8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
//9. Fill details: Title, Name, Email, Password, Date of birth
//10. Select checkbox 'Sign up for our newsletter!'
//11. Select checkbox 'Receive special offers from our partners!'
//12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
//13. Click 'Create Account button'
//14. Verify that 'ACCOUNT CREATED!' is visible
//15. Click 'Continue' button
//16. Verify that 'Logged in as username' is visible
//17. Click 'Delete Account' button
//18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button