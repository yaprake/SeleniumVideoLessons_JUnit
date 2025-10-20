package K05_Webelements_Locators.D02_byName_byClassName;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class pratik {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
// 1. Ana Sayfa Başlıklarının Sayısını Doğrulama
// Amaç: Ana sayfadaki başlıkların sayısının 5 olduğunu doğrulamak.
// Ana sayfaya git.
        driver.navigate().to("https://www.testotomasyonu.com");

// Üst menüdeki başlıkları listele
        List<WebElement> üstMenuBasliklarList = driver.findElements(By.className("has-sub"));
        for (WebElement each : üstMenuBasliklarList) {
            System.out.println(each.getText());
        }

// Başlık sayısının 5 olduğunu kontrol et
        int expectedBaslikSayisi = 5;
        int actualBaslikSayisi = üstMenuBasliklarList.size();
        if (expectedBaslikSayisi == actualBaslikSayisi) {
            System.out.println("Expected Üst Menü Başlık Sayısı: TEST PASSED");
        } else {
            System.out.println("Actual Üst Menü Başlık Sayısı: TEST FAILED ===> " + actualBaslikSayisi);
        }

        System.out.println("🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻");

// 2. Ürün Kategorilerinin Görünürlüğünü Test Etme
// Amaç: Ürün kategorilerinin (Electronics, Men Fashion, vb.) görünür olduğunu doğrulamak.

// Menüye tıkla (sadece 1 kez)
        driver.findElement(By.id("dropdownMenuLink")).click();

// Kategorileri al (tek değişken)
        List<WebElement> anaSayfaKategoriMenusu = driver.findElements(
                By.cssSelector("ul.dropdown-menu li[onclick^='setSearchCategory'] > a")
        );

// Her kategoriyi yazdır ve görünürlüğünü test et
        for (WebElement kategori : anaSayfaKategoriMenusu) {
            String kategoriAdi = kategori.getText().trim();
            // "Select Category" başlığını atla
            if (!kategoriAdi.isEmpty() && !kategoriAdi.equals("Select Category")) {
                System.out.println("Kategori: " + kategoriAdi);

                if (kategori.isDisplayed()) {
                    System.out.print("Kategori Görünür: PASSED ");
                } else {
                    System.out.print("Kategori Görünür: FAILED ");
                }
            }
        }



  /*️ Ürün Sayfası Test Senaryoları
3. Ürün Fiyatının Doğruluğunu Kontrol Etme

Amaç: Ürün fiyatının doğru görüntülendiğini doğrulamak.

Adımlar:

Bir ürün sayfasına git.

Ürün fiyatını al.

Fiyatın doğru olduğunu kontrol et.

4. Ürün Sepete Ekleme İşlemini Test Etme

Amaç: Ürünün sepete başarıyla eklendiğini doğrulamak.

Adımlar:

Bir ürün sayfasına git.

"Sepete Ekle" butonuna tıkla.

Sepet sayfasına git ve ürünün eklendiğini kontrol et.

🧾 Hesap ve Sipariş Test Senaryoları
5. Kullanıcı Giriş İşlemini Test Etme

Amaç: Kullanıcının başarılı bir şekilde giriş yapabildiğini doğrulamak.

Adımlar:

Giriş sayfasına git.

Geçerli kullanıcı adı ve şifre ile giriş yap.

Hesap sayfasına yönlendirildiğini kontrol et.

6. Sipariş Durumu Takip Testi

Amaç: Kullanıcının sipariş durumunu kontrol edebildiğini doğrulamak.

Adımlar:

Hesap sayfasına git.

"Siparişlerim" bölümüne tıkla.

Sipariş durumunu kontrol et.

📦 Sepet ve Ödeme Test Senaryoları
7. Sepet Boşaltma İşlemini Test Etme

Amaç: Sepetin başarıyla boşaltılabildiğini doğrulamak.

Adımlar:

Sepet sayfasına git.

"Sepeti Boşalt" butonuna tıkla.

Sepetin boş olduğunu kontrol et.

8. Ödeme Sayfası Yönlendirme Testi

Amaç: Ödeme sayfasına doğru yönlendirme yapılabildiğini doğrulamak.

Adımlar:

Sepet sayfasına git.

"Ödeme" butonuna tıkla.

Ödeme sayfasına yönlendirildiğini kontrol et.

📧 İletişim ve Bilgilendirme Test Senaryoları
9. İletişim Formu Gönderme Testi

Amaç: İletişim formunun başarıyla gönderilebildiğini doğrulamak.

Adımlar:

İletişim sayfasına git.

Gerekli bilgileri doldur.

"Gönder" butonuna tıkla.

Başarı mesajını kontrol et.

10. Blog Yazısı Görünürlüğü Testi

Amaç: Blog yazılarının doğru şekilde görüntülendiğini doğrulamak.

Adımlar:

Blog sayfasına git.

Bir blog yazısına tıkla.

Yazının içeriğini kontrol et.*/


        }
    }

