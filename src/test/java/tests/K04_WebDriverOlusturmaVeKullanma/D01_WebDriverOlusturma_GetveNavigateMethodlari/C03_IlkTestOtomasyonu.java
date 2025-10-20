package tests.K04_WebDriverOlusturmaVeKullanma.D01_WebDriverOlusturma_GetveNavigateMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_IlkTestOtomasyonu {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();


        //1. testotomasyonu sayfasına gidelim.✅
        driver.get("https://www.testotomasyonu.com");

        //2.sayfanın baslıgını yazdır. ✅
        System.out.println(driver.getTitle());

        //3.sayfa baslıgının "Test Otomasyon içerdiğini test edin.✅
        String expectedTitleIcerik="Test Otomasyonu";
        String actualTitle=driver.getTitle();
        if (actualTitle.toLowerCase().contains(expectedTitleIcerik.toLowerCase())){
            System.out.println("Title Test Pased");
        }else System.out.println("Test Faied");

        //4.Sayfa adresini (url)yazdırın✅
        System.out.println(driver.getCurrentUrl());

        //5.sayfa urlsini "https://testotomasyonu.com" oldgunu test edin.✅
        String expectedUrl="https://testotomasyonu.com";
        String actualUrl=driver.getCurrentUrl();
        if (actualUrl.equals(expectedUrl)){
            System.out.println("Title Test Pased");
        }else System.out.println("Test Faied");

        //6.sayfa handel değerini yazdırın✅
        System.out.println(driver.getWindowHandle());

        //7.sayfa html kodlarında "otomasyon" kelimesinin geçtiğini test edin.
        String expectedWord="otomasyon";
        String actualWord=driver.getPageSource();
        if (actualUrl.toLowerCase().contains(expectedWord.toLowerCase())){
            System.out.println("Title Test Pased");
        }else System.out.println("Test Faied");

        //8. sayfayı kapatın.
        driver.quit();














        Thread.sleep(000);





    }
}
