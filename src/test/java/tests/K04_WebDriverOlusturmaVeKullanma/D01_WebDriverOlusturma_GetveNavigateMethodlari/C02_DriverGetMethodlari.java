package tests.K04_WebDriverOlusturmaVeKullanma.D01_WebDriverOlusturma_GetveNavigateMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverGetMethodlari {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver=new ChromeDriver();
        driver.get("https://www.testotomasyon.com");

        System.out.println(driver.getTitle()); //sayfanın başlıpını getirir
        System.out.println(driver.getCurrentUrl());//sayfanın urllsini getirir
       // System.out.println(driver.getPageSource());//sayfanın html kaynak kodlarını getirir
        System.out.println(driver.getWindowHandle());//017242001A2B0D14DAB613D653F49CCF
        // Web sayfaları arasında geçiş için bu handel nolarını bilmek gerekir
        //her sorduğunda farklı bir no getirir.
        //
        System.out.println(driver.getWindowHandles());//[017242001A2B0D14DAB613D653F49CCF] //set olarak veriri


        Thread.sleep(2000);
        //driver.close();//web sayfasını kapatır bazı versionlarda çalışmaya bilir. onun yerine
        driver.quit();//kullanılır. TEK FARK DriverClose birden fazla sekme pencere vs. olsada birini en son açılanı kapatır.
                                                                    //DriverQuit ise tüm sekmeleri kapatır. Daha çok bu tercih edilir.




    }
}
