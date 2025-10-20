package K06_JUnitFramework.D02_Annotations;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_SetupVeTeardownMethodOlusturma {
    WebDriver driver;

    public void setup(){
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    public void teardown()  {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();
    }

    @Test
    public  void testOtomasyonuTesti()  {
        setup();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        // 1.method testotomasyonu anasayfaya gidin
        driver.get("https://www.testotomasyonu.com");
        //          title'in Test Otomasyonu icerdigini test edin
        String expectedTitle="Test Otomasyonu";
        String actualTitle=driver.getTitle();
        if (actualTitle.contains("Test Otomasyonu")){
            System.out.println("Test Otomasyonu Testi PASSED");
        }else System.out.println("Test Otomasyonu Testi FAİLED");
        teardown();

    }

    @Test
    public  void wisequarterTesti()  {
    setup();

        // 2.method wisequarter anasayfaya gidin
        driver.get("https://www.wisequarter.com");
        //          url'in wisequarter icerdigini test edin
        String expectedTitle="wisequarter";
        String actualTitle=driver.getCurrentUrl();
        if (actualTitle.contains("wisequarter")){
            System.out.println("wisequarter Testi PASSED");
        }else System.out.println("wisequarter Testi FAİLED");

        teardown();
    }

    @Test
    public  void junitOrgTesti() {
    setup();

        // 3.method junit.org adresine gidin
        driver.get("https://junit.org/");
        //          url'in "https://junit.org/junit5/" oldugunu test edin
        String expectedUrl = "https://junit.org/";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.equalsIgnoreCase(expectedUrl)){
            System.out.println("Junit testi PASSED");
        } else System.out.println("Junit testi FAILED");


    teardown();


    }



}
