package D02_farkliDriverKullanimi_driverManageMethodlari;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverManage_WindowMethodlari {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();



        // 1. https://www.testotomasyonu.com/ sayfasina gidin
        driver.get("https://www.testotomasyonu.com");

        // 2. Sayfanin konumunu ve boyutlarini yazdirin
        // Acilista konum : (22, 60)
        System.out.println("Açılışta konum:"+driver.manage().window().getPosition());

        // Acilista boyut : (1200, 989)
        System.out.println("Açılışta boyut:"+driver.manage().window().getSize());

        // 3. Sayfayi simge durumuna getirin
        driver.manage().window().minimize();


        // 4. Simge durumunda 3 saniye bekleyip sayfayi maximize yapin
        Thread.sleep(2000);
        driver.manage().window().maximize();

        // 5. Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
        System.out.println("maximize konum:"+driver.manage().window().getPosition());
        System.out.println("maximize boyut"+driver.manage().window().getSize());
        Thread.sleep(2000);
        // 6. Sayfayi fullscreen yapin
        driver.manage().window().fullscreen();
        Thread.sleep(2000);
        // 7. Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
        System.out.println("fullscreen konum:"+driver.manage().window().getPosition());
        System.out.println("fullscreen boyut"+driver.manage().window().getSize());
        Thread.sleep(2000);

/*      calistigi ekranin cozunurlugunu verin
        💨System.out.println("fullscreen konum:"+driver.manage().window().getPosition());
        💨consolda yazılan full screen boyut bizim bilgisayarımızın ekran çözünürlüğünü veriri
        💨fullscreen boyut(1067, 600)*/

        // 8. Sayfanin konumunu pixel olarak (200,200)’ye getirin
        driver.manage().window().setPosition(new Point(198,198));

        // 9. Sayfa boyutunu pixel olarak (1000,500)’ye ayarlayin
        driver.manage().window().setSize(new Dimension(1000,500));
        System.out.println("özel boyut konum:"+driver.manage().window().getPosition());
        System.out.println("özel boyut"+driver.manage().window().getSize());


        Thread.sleep(2000);
        driver.quit();

    }
}
