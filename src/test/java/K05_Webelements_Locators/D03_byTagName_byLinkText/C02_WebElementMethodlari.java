package K05_Webelements_Locators.D03_byTagName_byLinkText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import java.time.Duration;

public class C02_WebElementMethodlari {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // https://www.testotomasyonu.com/form adresine gidin
        driver.navigate().to("https://www.testotomasyonu.com/form");


        // Cinsiyet bolumunden size uygun radio button secin

        WebElement kadinRadio = driver.findElement(By.id("inlineRadio1"));
        // Element görünür ve tıklanabilir olana kadar bekle, gerekiyorsa scroll yap
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", kadinRadio);
        Thread.sleep(500); // kısa bekleme animasyonlar için
        kadinRadio.click();

        // istediginiz radio button'un secili oldugunu test edin
          if (kadinRadio.isSelected()){
              System.out.println("İstenilen Radio Buton(Kadin) is Correct: TEST PASSED");
          } else System.out.println("İstenilen Radio Buton(Kadin) is İncorrect: TEST FAİLED");

        // sizin isaretlediginiz disindaki butonlarin secili olmadigini test edin
        WebElement erkekRadio = driver.findElement(By.id("inlineRadio2"));
        WebElement digerRadio = driver.findElement(By.id("inlineRadio3"));
        if (!erkekRadio.isSelected() && !digerRadio.isSelected()) {
            System.out.println("Secili olmayan Radio Butonu: TEST PASSED");
        } else {
            System.out.println("Secili olmayan Radio Butonu: TEST FAILED");
        }
        // soyisim kutusunun boyutlarini ve konumunu yazdirin
            WebElement soyIsimKutusu=driver.findElement(By.id("surname"));
        System.out.println("soyisim kutusunun konumu: "+soyIsimKutusu.getLocation());
        System.out.println("soyisim kutusunun boyutu:"+soyIsimKutusu.getSize());
        // soyisim kutusunun HTML kodundaki class attribute degerinin
        // "form-control" oldugunu test edin
        String expectedAttributeDegeri="form-control";
        String actualAttributeDegeri=soyIsimKutusu.getAttribute("class");
        if (expectedAttributeDegeri.equals(actualAttributeDegeri)){
            System.out.println("Soy isim Attribuet testi PASSED");
        }else System.out.println("Soy isim Attribuet testi FAİLED");
        // sayfayi kapatin
        Thread.sleep(2000);
        driver.quit();





    }
}
