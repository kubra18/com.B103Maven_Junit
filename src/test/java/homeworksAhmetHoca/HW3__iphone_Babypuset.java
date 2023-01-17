package homeworksAhmetHoca;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

import java.util.List;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class HW3__iphone_Babypuset extends TestBase {

    @Test
    public void test01(){

        //Test01 :  1- amazon gidin
        driver.get("https://www.amazon.com");

        driver.findElement(By.xpath("//*[@data-action-type='DISMISS']")).click();
        //Arama kutusunun solundaki dropdown menuyu handle edip listesini ekrana yazdırın
        WebElement dd = driver.findElement(By.id("searchDropdownBox"));
        Select select = new Select(dd);
        //dropdown menude 40 eleman olduğunu doğrulayın
        List<WebElement> ddList = select.getOptions();
       ddList.stream().forEach(t-> System.out.println(t.getText()));

       Assert.assertNotEquals(40,ddList.size());

    }

   @Test
    public void test2(){
       driver.get("https://www.amazon.com");

       driver.findElement(By.xpath("//*[@data-action-type='DISMISS']")).click();


       //dropdown menuden elektronik bölümü seçin
        WebElement dd = driver.findElement(By.id("searchDropdownBox"));
        waitFor(2);
        Select select = new Select(dd);
        select.selectByVisibleText("Electronics");
        waitFor(2);

        //arama kutusuna iphone yazip aratin ve bulunan sonuç sayısını yazdırın
       driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("iphone",Keys.ENTER);
       waitFor(2);

       //sonuc sayisi bildiren yazinin iphone icerdigini test edin

       String[] ss =  driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).getText().split(" ");
       String sonucsayisi=ss[3];
       System.out.println(sonucsayisi);
       String sss =driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).getText();


       Assert.assertTrue(sss.contains("iphone"));

       //ikinci ürüne relative locater kullanarak tıklayin
       WebElement ilkurun = driver.findElement(By.xpath("(//*[@class='a-section aok-relative s-image-square-aspect'])[1]"));
        WebElement ikinciurun = driver.findElement(with(By.tagName("div")).toRightOf(ilkurun));
        ikinciurun.click();
       //ürünün title'ni ve fiyatını variable’a  assign edip ürünü sepete ekleyelim
       String urunfiyati =driver.findElement(By.xpath("(//*[@class='a-offscreen'])[1]")).getText();
       System.out.println(driver.getTitle());
       driver.findElement(By.id("add-to-cart-button")).click();



   //    ikinci ürüne relative locater kullanarak tıklayin
   //  List<WebElement> urunler=driver.findElements(By.xpath("//img[@class='s-image']"));
     //urunler.get(2).click();



    }
@Test
    public void test03(){
    //Test03
    //yeni bir sekme açarak amazon anasayfaya gidin
    driver.get("https://www.amazon.com");
    driver.findElement(By.xpath("//*[@data-action-type='DISMISS']")).click();
    driver.switchTo().newWindow(WindowType.TAB);
    driver.get("https://www.amazon.com");

    //dropdown’dan bebek bölümüne secin
    WebElement dd = driver.findElement(By.id("searchDropdownBox"));
    waitFor(2);
    Select select = new Select(dd);
    select.selectByVisibleText("Baby");
    waitFor(2);
    //bebek puset aratıp bulundan sonuç sayısını yazdırın
    driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("bebek puset",Keys.ENTER);
    waitFor(2);
    String[] ss =  driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).getText().split(" ");
    String yazi = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).getText();
    String sonucYazisi=ss[2];
    System.out.println(sonucYazisi);

    //4- sonuc yazisinin puset icerdigini test edin
    Assert.assertTrue(yazi.contains("puset"));

    //5-üçüncü ürüne relative locater kullanarak tıklayin
    waitFor(2);
    WebElement dorduncuUrun = driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-fixed-height'])[2]"));
    driver.findElement(with(By.tagName("div")).above(dorduncuUrun)).click();

    //6-title ve fiyat bilgilerini assign edelim ve ürünü sepete ekleyin
    driver.getTitle();
    String fiyat=driver.findElement(By.xpath("(//*[@class='a-offscreen'])[1]")).getText();
    System.out.println(fiyat);
    driver.findElement(By.xpath("//*[@name='submit.add-to-registry.wishlist.unrecognized']")).click();

    // Test 4
    //1-sepetteki ürünlerle eklediğimiz ürünlerin aynı olduğunu isim ve fiyat olarak doğrulayın




}















}
