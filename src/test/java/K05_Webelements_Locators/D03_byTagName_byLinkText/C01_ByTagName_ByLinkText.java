package K05_Webelements_Locators.D03_byTagName_byLinkText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_ByTagName_ByLinkText {
    public static void main(String[] args) throws InterruptedException {
        //Tag name ile uniq değerlere ulamak zor olabilir bu yğzden çk kullanmayız. genelde tüm linkleri görmek için kullanılır.

        //1- Bir test class’i olusturun ilgili ayarlari yapin
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //2- https://www.automationexercise.com/ adresine gidin
        driver.navigate().to(" https://www.automationexercise.com");

        //   cikan cookies kabul edin
        Thread.sleep(1000);
        driver.findElement(By.className("fc-button-label"))
                .click();
        Thread.sleep(1000);
        //3- Sayfada 147 adet link bulundugunu test edin.
        List<WebElement> linkElementleriList=driver.findElements(By.tagName("a"));
        int expectedLinkSayisi=147;
        int actualLinkSayisi=linkElementleriList.size();
        if (actualLinkSayisi==expectedLinkSayisi){
            System.out.println("Link Sayısı Elemetleri Listesi 147 Adet: TEST  PASSED");
        }else System.out.println("Link Sayısı Elemetleri Listesi 147 Adet: TEST FAİLED ====> "+linkElementleriList.size()+" Adet Link Var");
        //4- Products linkine tiklayin
        driver.findElement(By.partialLinkText(" Products")).click();
        //5- special offer yazisinin gorundugunu test edin
        WebElement  specialOfferImg= driver.findElement(By.id("sale_image"));
        if (specialOfferImg.isDisplayed()){
            System.out.println("Special Offer İmg. TEST PASSED");
        } else System.out.println("Special Offer İMG TEST FAİLED");

        //6- Sayfayi kapatin

        driver.quit();






    }
}
