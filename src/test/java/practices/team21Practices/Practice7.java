package practices.team21Practices;

public class Practice7 {
    //2. 'http://automationexercise.com' URL'sine gidin
    //3. Ana sayfanın başarıyla göründüğünü doğrulayın
    //4. 'Bize Ulaşın' düğmesine tıklayın
    //5. "İLETİŞİME GEÇİN" ifadesinin görünür olduğunu doğrulayın
    //6. Adı, e-postayı, konuyu ve mesajı girin
    //7. Dosya yükleyin
    //8. 'Gönder' düğmesini tıklayın
    //9. Tamam düğmesine tıklayın
    //10. Başarı mesajını doğrulayın 'Başarı! Bilgileriniz başarıyla gönderildi.' görünür
    //11. 'Ana Sayfa' düğmesine tıklayın ve ana sayfaya başarıyla geldiğini doğrulayın
}
/*
@Test
public void test01() throws InterruptedException {
    //2. 'http://automationexercise.com' URL'sine gidin
    driver.get("http://automationexercise.com");
    //3. Ana sayfanın başarıyla göründüğünü doğrulayın
    WebElement anaSayfa = driver.findElement(By.xpath("//img[@src='/static/images/home/logo.png']"));
    Assert.assertTrue(anaSayfa.isDisplayed());
    //4. 'Bize Ulaşın' düğmesine tıklayın
    driver.findElement(By.xpath("//*[text()=' Contact us']")).click();
    //5. "İLETİŞİME GEÇİN" ifadesinin görünür olduğunu doğrulayın
    WebElement iletisim = driver.findElement(By.xpath("//*[text()='Get In Touch']"));
    Assert.assertTrue(iletisim.isDisplayed());
    //6. Adı, e-postayı, konuyu ve mesajı girin
    driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys("Hava", Keys.TAB
    ,"havva.ozbay@hotmail.com",Keys.TAB,"sikayet",Keys.TAB,"TEAM21EEEE");
    //7. Dosya yükleyin
    WebElement upload_file = driver.findElement(By.xpath("//*[@name='upload_file']"));
    upload_file.sendKeys("C:\\Users\\sevim\\OneDrive\\Desktop\\TEAM21");
    //8. 'Gönder' düğmesini tıklayın
    WebElement bb = driver.findElement(By.xpath("//*[@data-qa='submit-button']"));
    bb.sendKeys(Keys.ENTER);


    //9. Tamam düğmesine tıklayın
    //10. Başarı mesajını doğrulayın 'Başarı! Bilgileriniz başarıyla gönderildi.' görünür
    //11. 'Ana Sayfa' düğmesine tıklayın ve ana sayfaya başarıyla geldiğini doğrulayın


}
 */