package K05_Webelements_Locators.D01_WebElementVeLocatorNedir;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_AramaTesti {
    public static void main(String[] args) throws InterruptedException {

        //1- Bir test class’i olusturun ilgili ayarlari yapin
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //2- https://www.testotomasyonu.com adresine gidin
        driver.navigate().to("https://www.testotomasyonu.com");

        //3- urun arama kutusunu locate edin ve kaydedin
        WebElement testOtomasyonAramaKutusu=driver.findElement(By.id("global-search"));
        Thread.sleep(3000);

        //4- arama kutusuna “shoe” yazdirin
        testOtomasyonAramaKutusu.sendKeys("shoe");
        Thread.sleep(3000);

        //5- arama islemini yapabilmek icin ENTER tusuna basin
        testOtomasyonAramaKutusu.submit();

        Thread.sleep(3000);

        //6- sayfayi kapatin
        driver.quit();




    }
}
