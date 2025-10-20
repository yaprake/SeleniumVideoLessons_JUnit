package K07_CheckBox_RadioButton_TestBase;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import utilities.ReusableMethods;

import javax.swing.*;
import java.time.Duration;
import java.util.List;

public class C02_RadioButton {

    //	a. Verilen web sayfasına gidin.
    //	      https://testotomasyonu.com/form
    //	b. Cinsiyet Radio button elementlerini locate edin
    //	c. Iki farkli test method’u oluşturup yazidan veya direk buton’dan size uygun olani secin
    //	d. Sectiginiz radio button’un seçili, ötekilerin seçili olmadigini test edin

WebDriver driver;

@BeforeEach
    public void setup(){
    driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
@AfterEach
    public void tearDown(){
    driver.quit();
}


    @Test
    public void yazidanSecimTesti(){
        //	a. Verilen web sayfasına gidin.
        //	      https://testotomasyonu.com/form
        driver.get("https://testotomasyonu.com/form");

        //	b. Cinsiyet Radio button elementlerini locate edin
        WebElement kadinRadioButton = driver.findElement(By.id("inlineRadio1"));
        WebElement erkekRadioButton = driver.findElement(By.id("inlineRadio2"));
        WebElement digerRadioButton = driver.findElement(By.id("inlineRadio3"));

        Actions actions = new Actions(driver);
        ReusableMethods.bekle(1);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(1);

        driver.findElement(By.xpath("//*[@for='inlineRadio2']"))
                .click();

        //	d. Sectiginiz radio button’un seçili, ötekilerin seçili olmadigini test edin

        Assertions.assertTrue(erkekRadioButton.isSelected());
        Assertions.assertFalse(kadinRadioButton.isSelected());
        Assertions.assertFalse(digerRadioButton.isSelected());

    }


    @Test
    public void butondanSecimTesti(){
        //	a. Verilen web sayfasına gidin.
        //	      https://testotomasyonu.com/form
        driver.get("https://testotomasyonu.com/form");

        //	b. Cinsiyet Radio button elementlerini locate edin
        WebElement kadinRadioButton = driver.findElement(By.id("inlineRadio1"));
        WebElement erkekRadioButton = driver.findElement(By.id("inlineRadio2"));
        WebElement digerRadioButton = driver.findElement(By.id("inlineRadio3"));

        //	c. direk buton’dan size uygun olani secin
        //     erkek butonu seciyorum
        erkekRadioButton.click();

        //	d. Sectiginiz radio button’un seçili, ötekilerin seçili olmadigini test edin
        Assertions.assertTrue(erkekRadioButton.isSelected());
        Assertions.assertFalse(kadinRadioButton.isSelected());
        Assertions.assertFalse(digerRadioButton.isSelected());

    }


}