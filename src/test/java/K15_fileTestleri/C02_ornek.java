package K15_fileTestleri;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import utilities.ReusableMethods;
import utilities.TestBase_Each;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C02_ornek extends TestBase_Each {
@Test
    public  void test(){
// 1. https://the-internet.herokuapp.com/download adresine gidelim.
driver.get("https://the-internet.herokuapp.com/download");
// 2. logo.png dosyasını indirelim
    driver.findElement(By.linkText("logo.jpeg"))
            .click();
//3. Dosyanın başarıyla indirilip indirilmediğini test edelim
    ReusableMethods.bekle(2);
    String dosyaYolu="C:\\Users\\yapra\\Downloads";
    Assertions.assertTrue(Files.exists(Paths.get(dosyaYolu)));

}





}
