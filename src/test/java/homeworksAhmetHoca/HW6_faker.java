package homeworksAhmetHoca;

import com.github.javafaker.Faker;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

public class HW6_faker extends TestBase {

        //Faker Kutuphanesi HOMEWORK
        //Faker class’i testlerimizi yaparken ihtiyav duydugumuz isim, soyisim, adres vb bilgiler icin fake
        //degerler uretmemize imkan tanir.
        //Faker degerler uretmek icin Faker class’indan bir obje uretir ve var olan method’lari kullaniriz.

         @Test
        public void test01(){
        //"https://facebook.com"  Adresine gidin
        driver.get("https://facebook.com");
        driver.findElement(By.xpath("(//button[@value='1'])[2]")).click();

        //“create new account”  butonuna basin
        driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();

        //“firstName” giris kutusuna bir isim yazin
        //“surname” giris kutusuna bir soyisim yazin
        //“email” giris kutusuna bir email yazin
        //“email” onay kutusuna emaili tekrar yazin
        //Bir sifre girin
        Faker faker = new Faker();
        WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
        String emailadress = faker.internet().emailAddress();
        firstname.sendKeys(faker.name().firstName(), Keys.TAB,faker.name().lastName(),Keys.TAB,emailadress,Keys.TAB,emailadress
        ,Keys.TAB,faker.number().digits(8));

        //Tarih icin gun secin
        WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
        Select select1 = new Select(day);
        select1.selectByIndex(faker.random().nextInt(0,30));

        //Tarih icin ay secin
        WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
        Select select2 = new Select(month);
        select2.selectByIndex(faker.random().nextInt(0,12));

        //Tarih icin yil secin
        WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
        Select select3 = new Select(year);
        select3.selectByIndex(faker.random().nextInt(0,117));
        waitFor(3);

        //Cinsiyeti secin
        WebElement kadin = driver.findElement(By.xpath("(//*[@type='radio'])[1]"));
        WebElement erkek  = driver.findElement(By.xpath("(//*[@type='radio'])[2]"));
        WebElement ozel = driver.findElement(By.xpath("(//*[@type='radio'])[3]"));

        //Isaretlediginiz cinsiyetin secili, diger cinsiyet kutusunun secili olmadigini test edin.
        kadin.click();
        Assert.assertTrue(kadin.isSelected());
        Assert.assertFalse(erkek.isSelected());
        Assert.assertFalse(ozel.isSelected());

    }

}
