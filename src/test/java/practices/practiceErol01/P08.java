package practice01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P08 {
    static WebDriver driver;
    @BeforeClass
    public static void setUp() throws Exception {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @Test
    public void test01(){
        //  https://www.google.com/ adresine gidin
        driver.get("https://www.google.com/ ");



        //       cookies uyarisini kabul ederek kapatin
        driver.findElement(By.xpath("//*[text()='Tümünü kabul et']")).click();

        //Sayfa basliginin “Google” ifadesi icerdigini test edin
        String actualTitle = driver.getTitle();
        String expectedTitle = "Google";
        Assert.assertTrue(actualTitle.contains(expectedTitle));
        //Arama cubuguna “Nutella” yazip aratin
        driver.findElement(By.xpath("//*[@class='gLFyf']")).sendKeys("Nutella", Keys.ENTER);
        //Bulunan sonuc sayisini yazdirin
        String [] sonucSayisi = driver.findElement(By.xpath("//*[@id='result-stats']")).getText().split(" ");
        String sonuc = sonucSayisi[1];
        System.out.println("Sonuc Sayısı = " +sonuc);
        //sonuc sayisinin 10 milyon’dan fazla oldugunu test edin
        sonuc=sonuc.replaceAll("\\D",""); // ReplaceAll methodu ile \\D'i kullanarak bütün noktalama işaretlerini hiçlikle değiştir
        int istenenSayi = 10000000;
        Assert.assertTrue(Integer.parseInt(sonuc)>istenenSayi);
        /*
        String[] sonuc = sonucSayisi.get(0).getText().split(" ");
        System.out.println(sonuc[1]);
        String sonucReal = sonuc[1].toString();
        String sayi = sonucReal.replaceAll("\\p{Punct}", "");
        System.out.println("sayi =" + sayi);
        int num = Integer.valueOf(sayi);
        if (num > 10000000) {
            System.out.println("Passed");
        } else System.out.println("Failed");
                 */


        //Sayfayi kapatin
        driver.close();
    }
}