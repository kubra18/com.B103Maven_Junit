package practices.practiceErol01.team21Practices;

public class Practice_10_Guru {
    ///*
    //       url'ye git: http://demo.guru99.com/popup.php
    //       ilk pencereyi al
    //       "Click Here" butonuna tıklayın
    //       setteki tüm pencereyi al
    //       diğer pencereye geç
    //       e-posta kimliğini (somepne@gmail.com) girin ve bu girişe bir şey yazın
    //       Gönder düğmesine tıklayarak
    //       ""This access is valid only for 20 days."" ifadesinin beklendiği gibi olduğunu doğrula
    //       Tekrar ilk pencereye geç
    //       İlk pencerede olduğunu doğrula
    //      */
}



/*
@Test
    public void test01() throws InterruptedException {
        //   url'ye git: http://demo.guru99.com/popup.php
        driver.get(" http://demo.guru99.com/popup.php");
        //       ilk pencereyi al
        String windowHandle1 = driver.getWindowHandle();
        //       "Click Here" butonuna tıklayın
        driver.findElement(By.xpath("//a[normalize-space()='Click Here']")).click();
        //       setteki tüm pencereyi al
        Set<String> allWindows = driver.getWindowHandles();
        System.out.println(allWindows);
        Thread.sleep(3000);
        for (String eachWindow : allWindows) {
            if (!eachWindow.equals(windowHandle1)) {
                driver.switchTo().window(eachWindow);
                break;
            }
        }
        //       diğer pencereye geç
        String windowHandle2 = driver.getWindowHandle();
        System.out.println(windowHandle2);
        //       e-posta kimliğini (somepne@gmail.com) girin ve bu girişe bir şey yazın
        //       Gönder düğmesine tıklayarak
        driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("somepne@gmail.com", Keys.ENTER);
        //       ""This access is valid only for 20 days."" ifadesinin beklendiği gibi olduğunu doğrula
        String actualResult=driver.findElement(By.xpath("//h3[normalize-space()='This access is valid only for 20 days.']")).getText();
        String expectedResult="This access is valid only for 20 days.";
        Assert.assertEquals(expectedResult,actualResult);
        //       Tekrar ilk pencereye geç
        Thread.sleep(3000);
        driver.switchTo().window(windowHandle1);
        //       İlk pencerede olduğunu doğrula
        Assert.assertTrue(driver.findElement(By.xpath("//a[normalize-space()='Click Here']")).isDisplayed());
    }
 */