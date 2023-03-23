package day18;
import org.junit.Test;
import utilities.TestBase;
public class C01_JSExecutor_GetValue extends TestBase {

//  1)getValueTest metotu olustur
// 2)https://www.priceline.com/ a git
//  3)Tarih kısmındaki Yazili metinleri al ve yazdır


    @Test
    public void getValue() {
        driver.get("https://www.priceline.com/");

        //2.javascript excuter objesi olustur
        getValueByJS("hotelDates");


    }}