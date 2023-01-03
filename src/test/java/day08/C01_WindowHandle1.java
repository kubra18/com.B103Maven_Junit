package day08;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

import java.util.Set;

public class C01_WindowHandel1 extends TestBase {


    @Test
    public void handleWindowTest(){
        //Tests package’inda yeni bir class olusturun: WindowHandle
        //https://the-internet.herokuapp.com/windows adresine gidin.
        driver.get("https://the-internet.herokuapp.com/windows");
        //ilk sayfanin ID sini alalim.
        String window1Handle = driver.getWindowHandle();


        //Sayfadaki textin “Opening a new window” olduğunu doğrulayın.
        String window1Text = driver.findElement(By.xpath("//h3")).getText();
        Assert.assertEquals("Opening a new window",window1Text);

        //Sayfa başlığının(title) “The Internet” olduğunu doğrulayın.
        String ActualTitle = driver.getTitle();
        Assert.assertEquals("The Internet",ActualTitle);

        //Click Here butonuna basın.
        driver.findElement(By.linkText("Click Here")).click();

        //Acilan yeni pencerenin sayfa başlığının (title) “New Window” oldugunu dogrulayin.

      
        String window2Title = driver.findElement(By.xpath("//h3")).getText();
        Assert.assertEquals("New Window",window2Title);

        //Bu noktada 2 pencere acik ve ikincisine gecis yapmak istiyorum
        //Bunun icin driver.getWindowHandles() ile tum pencerelerin ID lerini alalim
        Set<String> allWindowHandles = driver.getWindowHandles();//{window1handle, window2handle}
        System.out.println(allWindowHandles);
        for (String eachHandle : allWindowHandles){
            //eger listedeki id window1 e esit degilse otomatik olarak window 2 ye esittir.
            if(!eachHandle.equals(window1Handle)){
                driver.switchTo().window(eachHandle);//Burdaki eachHandle window2 handle esittir.
            }
        }
        //Bu noktada driver 2.pencerede!!!



        //Sayfadaki textin “New Window” olduğunu doğrulayın.
        String window2Title = driver.getTitle();
        Assert.assertEquals("New Window",window2Title);

        //Bir önceki pencereye geri döndükten sonra sayfa başlığının “The Internet” olduğunu  doğrulayın.






    }

}
