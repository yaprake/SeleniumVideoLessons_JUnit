package K15_fileTestleri;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase_Each;

public class C03_fileUploadTesti extends TestBase_Each {



    @Test
    public void Test01(){

//        1.https://the-internet.herokuapp.com/upload adresine gidelim
        driver.get("https://the-internet.herokuapp.com/upload");
//        2.chooseFile butonuna basalim
//        3.Yuklemek istediginiz dosyayi secelim.


        /*Selenium dosya seçiminde bilgisayarımızdaki klasör yapısını tıklayamayacagı
         için bir yöntem veya method geliştirmiş
         Choose butonuna basıp dosyayı seçmek yerine Selenium ile choose butonunu locate edip
         yüklemek istediğimiz dosyanın dosya yolunu sendKeys ile locate ettiğimiz Choose butonuna yollarız
         */
        WebElement chooseButonu=driver.findElement(By.id("file-upload"));
        String dosyaYolu="C:\\Users\\yapra\\Downloads\\logo (1).jpeg";
        chooseButonu.sendKeys(dosyaYolu);
//        4.Upload butonuna basalim.
        driver.findElement(By.id("file-submit")).click();
//        5.“File Uploaded!” textinin goruntulendigini test edelim.
        WebElement fileUploadYaziElementi = driver.findElement(By.cssSelector("#content > div > h3"));

        String expectedYazi = "File Uploaded!";
        String actualYazi = fileUploadYaziElementi.getText();

        Assertions.assertEquals(expectedYazi,actualYazi);


    }





}
