package K05_Webelements_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class pratik1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


        // 🟩 1. Başlıklarının Sayısını Doğrulama

        // https://testotomasyonu.com ana sayfasına gidin
        driver.navigate().to("https://testotomasyonu.com");

        // Üst menüdeki başlıkları locate edin
        List<WebElement> anaSayfaÜstBasliklarList = driver.findElements(By.className("has-sub"));

        // Başlıkların sayısının 5 olduğunu test edin
        int expectedAnasayfaUstBaslikSayisi = 5;
        int actualAnasayfaUstBaslikSayisi = anaSayfaÜstBasliklarList.size();
        if (expectedAnasayfaUstBaslikSayisi == actualAnasayfaUstBaslikSayisi) {
            System.out.println("Expected Ana Sayfa Başlık Sayısı Test PASSED");
        } else System.out.println("Actual Ana Sayfa Baslık sayısı Test FAİED ====> " + anaSayfaÜstBasliklarList.size());

        //Tüm başlıkları konsola yazdırın
        for (WebElement tumBasliklar : anaSayfaÜstBasliklarList) {
            String tumBasliklarStr = tumBasliklar.getText();
            System.out.println(tumBasliklarStr);
        }

        //“Contact” başlığının listede yer aldığını doğrulayın

        boolean contactVarMi = false;

// Ana sayfa üst başlık listesi üzerinden kontrol et
        for (WebElement baslik : anaSayfaÜstBasliklarList) {
            if (baslik.getText().equalsIgnoreCase("Contact")) {
                contactVarMi = true;
                break; // Bulduğumuzda döngüden çıkıyoruz
            }
        }
// Test sonucunu konsola yazdır
        if (contactVarMi) {
            System.out.println("\"Contact\" başlığı listede bulundu. Test PASSED");
        } else {
            System.out.println("\"Contact\" başlığı listede bulunamadı. Test FAILED");

        }
   /*     //        if (tumBasliklarStr.c("Contact")){
        //            System.out.println("Has Contact TEST PASSED ");
        //        }   else System.out.println("Has Contact TEST FAİLED");
            // Sayfayı kapatın*/


//🟦 2. Kategorilerinin Görünürlüğünü Test Etme
//
//        https://testotomasyonu.com/categories
//        adresine gidin
//
//“Electronics”, “Fashion” ve “Home” kategorilerinin göründüğünü test edin
//
//“Books” kategorisinin görünmediğini doğrulayın
//
//“Fashion” kategorisine tıklayın
//
//        Açılan sayfanın başlığının “Fashion Products” olduğunu test edin
//
//        Sayfayı kapatın
//
//🟨 3. Ürün Sayfası Test Senaryoları
//
//        https://testotomasyonu.com/products
//        adresine gidin
//
//        İlk ürünün ismini ve fiyatını konsola yazdırın
//
//        İlk ürüne tıklayın
//
//        Ürün detay sayfasında ürün isminin görünür olduğunu test edin
//
//“Add to Cart” butonuna tıklayın
//
//“Product added to cart” mesajının görüntülendiğini doğrulayın
//
//        Sepete gidin ve ürünün sepette listelendiğini test edin
//
//        Sayfayı kapatın


    }
}