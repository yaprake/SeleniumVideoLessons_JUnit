package tests.K04_WebDriverOlusturmaVeKullanma.D01_WebDriverOlusturma_GetveNavigateMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_NavigateMethotlariTest {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        //Youtube sayfasına gidin:"https://www.youtube.com/"
        driver.navigate().to("https://www.youtube.com/");

        //url'nin "youtube"içerdiğini test edin
        String expextedUrl="youtube";
        String actualUrl=driver.getCurrentUrl();
        if (actualUrl.toLowerCase().contains(expextedUrl.toLowerCase())){
            System.out.println("Url Test Passes✅");
        }else System.out.println("Url Test Failed❌");

        //Testotomasyonu sayfasına gidin"https://testotomasyonu.com"
        driver.navigate().to("https://testotomasyonu.com");

        //Title'n "Test Otomasyonu" içerdiğini test edin
        String expectedTitle="Test Otomasyonu";
        String actualTitle=driver.getTitle();
        if (actualTitle.contains(expectedTitle)){
            System.out.println("Title Test Otomasyon Passes✅");
        }else System.out.println("Title Test Otomasyon Failed❌");

        //tekrar youtube sayfasına dönün.
        driver.navigate().back();

       //Title'nin "youtube"oldugunu test edin
        String expectedTitle1="youtube";
        String actualTitle1=driver.getTitle();
        if (actualTitle1.equals(expectedTitle1)){
            System.out.println("Youtube Title Test Passes✅");
        }else System.out.println("Youtube Title Test Failed❌");

        //refresh yap
        driver.navigate().refresh();

        //tüm sayfalari kapatin
        driver.quit();




    }
}
