package D02_farkliDriverKullanimi_driverManageMethodlari;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_FarkliWebDriverKullanma {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.testotomasyonu.com");
        Thread.sleep(3000);









        driver.quit();



















    }
}
