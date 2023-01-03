package day05_JUnit;

import org.checkerframework.checker.units.qual.A;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C02_BeforeAfter {
    @Before
    public void setUp(){
        System.out.println("Her test methodundan once calisir");

    }
    @After
    public void tearDown(){
        System.out.println("Her test methodundan sora calisir");
    }
    @Test
    public void test01(){
        System.out.println("Ilk Test");
    }
    @Test
    public void test02(){
        System.out.println("Ikinci Test");
    }
}
