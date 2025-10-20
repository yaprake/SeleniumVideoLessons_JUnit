package tests.K04_WebDriverOlusturmaVeKullanma.D01_WebDriverOlusturma_GetveNavigateMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_DriverNavigateMethodlari {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.testotomasyonu.com");
        Thread.sleep(3000);
        driver.navigate().to("https://www.wisequarter.com");//get ile navigate.to aynı işlemi yapar
        Thread.sleep(3000);
        //geriye test otomasyonu sayfasına dönün
        driver.navigate().back();
        //yeniden wisequarter sayfasına gelin
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.navigate().refresh();












        driver.quit();
    }
}
