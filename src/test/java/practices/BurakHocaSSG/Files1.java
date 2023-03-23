package practices.BurakHocaSSG;

import org.junit.Assert;
import org.junit.Test;

import java.nio.file.Paths;

import static java.nio.file.Files.exists;

public class Files1 {

    // Exercise 1...
    // masaustunde bir text dosyası olusturun
    // masaustundeki text dosyasının varlıgını test edin
    @Test
    public void test01() {
        ///Users/kubra/Desktop/logo.jpeg
        // Assert.assertTrue(Files.exists(Paths.get("C:\\Users\\BURAK\\Desktop\\text.txt")));  Bu islemi daha dinamik hale getirelim

      Assert.assertTrue(exists(Paths.get("/Users/kubra/Desktop/logo.jpeg")));
    }
}

//// Exercise 1...
//
//    // masaustunde bir text dosyası olusturun
//    // masaustundeki text dosyasının varlıgını test edin