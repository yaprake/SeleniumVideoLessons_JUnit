package K06_JUnitFramework.D01_JUnitFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.ReusableMethods;

import java.time.Duration;

public class C02_CokluTest {


    // 3 farkli method olusturun
    // 1.method testotomasyonu anasayfaya gidin
    //          title'in Test Otomasyonu icerdigini test edin
    // 2.method wisequarter anasayfaya gidin
    //          url'in wisequarter icerdigini test edin
    // 3.method junit.org adresine gidin
    //          url'in "https://junit.org/junit5/" oldugunu test edin

    public static void main(String[] args) {

        testOtomasyonuTesti();

        wisequarterTesti();

        junitOrgTesti();
    }

    public static void testOtomasyonuTesti()  {
        WebDriver driver=new ChromeDriver();
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

        ReusableMethods.bekle(5);
        driver.quit();
    }

    public static void  wisequarterTesti()  {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // 2.method wisequarter anasayfaya gidin
        driver.get("https://www.wisequarter.com");
        //          url'in wisequarter icerdigini test edin
        String expectedTitle="wisequarter";
        String actualTitle=driver.getCurrentUrl();
        if (actualTitle.contains("wisequarter")){
            System.out.println("wisequarter Testi PASSED");
        }else System.out.println("wisequarter Testi FAİLED");

        ReusableMethods.bekle(5);
        driver.quit();
    }

    public static void junitOrgTesti()  {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // 3.method junit.org adresine gidin
        driver.get("https://junit.org/");
        //          url'in "https://junit.org/junit5/" oldugunu test edin
        String expectedUrl = "https://junit.org/";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.equalsIgnoreCase(expectedUrl)){
            System.out.println("Junit testi PASSED");
        } else System.out.println("Junit testi FAILED");


        ReusableMethods.bekle(5);
        driver.quit();
    }







}
