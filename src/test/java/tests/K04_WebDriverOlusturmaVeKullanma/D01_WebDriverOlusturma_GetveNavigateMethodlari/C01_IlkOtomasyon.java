package tests.K04_WebDriverOlusturmaVeKullanma.D01_WebDriverOlusturma_GetveNavigateMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkOtomasyon {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver(); //  teste başladığında class içinde ilk yapacağın işlem bir WebDriver oluşturmaktır.

        driver.get("https://testotomasyonu.com"); //herzaman https:// yazmak zorundasın! hangi web sitesine gideceğini yaz

        //Thread.sleep(5000); Testi yaparken izlemek için bekledir. 5000 ms demek 5 saniye demek.
        driver.close();//test bitince web sayfasını kapatmak için









    }


}
