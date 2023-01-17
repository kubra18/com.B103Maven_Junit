package CanHocaSeleniumStudy;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HW9_Emoji extends TestBase {
    @Test
    public void test01(){
        //go to web site : https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/
        driver.get("https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/");
        String windowhandle1 = driver.getWindowHandle();

// ikinci emojiye tıklayın
        driver.switchTo().frame(1);
        driver.findElement(By.xpath("(//*[@class='mdl-tabs__ripple-container mdl-js-ripple-effect'])[2]")).click();

// ikinci emoji altındaki tüm öğelere tıklayın
        List<WebElement> ikinciEmoji = driver.findElements(By.xpath("//*[@id='nature']//img"));

       ikinciEmoji.stream().forEach(t->t.click());
waitFor(5);
// ana iframe'e geri dön
        driver.switchTo().defaultContent();

//formu doldurun,(Formu istediğiniz metinlerle doldurun)
       List<WebElement> list =driver.findElements(By.xpath("//*[@class='mdl-textfield mdl-js-textfield mdl-textfield--floating-label is-upgraded is-dirty']"));
       List<String> veriler = new ArrayList<>(Arrays.asList("kübra","tan","kj","iugbjkn","iuhkjn","sdfgb","dfgthn","cfgbhn","cfgbnhj","cfgh"));
for (int i=0 ; i< list.size() ;i++)
{
    list.get(i).sendKeys(veriler.get(i));
}


// uygula butonuna tıklayın

    }

}
