package K16_Waits;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.ReusableMethods;
import utilities.TestBase_Each;

import java.time.Duration;

public class C01_ExplicitWait {
    //Iki tane metod olusturun : implicitWaitTest , explicitWaitTest
    //Iki metod icin de asagidaki adimlari test edin.

    WebDriver driver;

    @Test
    public void Test01() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        //1. https://the-internet.herokuapp.com/dynamic_controls adresine gidin.
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");

        //2. Textbox’in etkin olmadigini(enabled) dogrulayın
        WebElement textBox = driver.findElement(By.xpath("//input[@type='text']"));
        Assertions.assertFalse(textBox.isEnabled());

        //3. Enable butonuna tıklayın ve textbox etkin oluncaya kadar bekleyin
        driver.findElement(By.xpath("//button[.='Enable']"))
                .click();
        ReusableMethods.bekle(8);
        Assertions.assertTrue(textBox.isEnabled());

        //4. Textbox’in etkin oldugunu(enabled) dogrulayın.
        WebElement textBoxEnabled = driver.findElement(By.id("message"));
        Assertions.assertTrue(textBoxEnabled.isDisplayed());

        //5. “It’s enabled!” mesajinin goruntulendigini dogrulayın.
        ReusableMethods.bekle(2);
        driver.quit();
    }


    @Test
    public void explicitWaitTesti() {

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        driver.manage().window().maximize();

        //1. https://the-internet.herokuapp.com/dynamic_controls adresine gidin.
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");

        //2. Textbox’in etkin olmadigini(enabled) dogrulayın
        WebElement textBox = driver.findElement(By.xpath("//input[@type='text']"));

        Assertions.assertFalse(textBox.isEnabled());

        //3. Enable butonuna tıklayın
        driver.findElement(By.xpath("//button[.='Enable']"))
                .click();
        // ve textbox etkin oluncaya kadar bekleyin
        // explicitlyWait ile bekleyelim
        // 1.adim bir wait objesi olustur
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));

        // 2.adim MUMKUNSE beklenecek objeyi locate edip bir webelement olarak kaydedin
        //        textbox'i locate edebiliyoruz ve yukarda locate edip kaydettik

        // 3.adim wait objesine neyi bekleyecegini soyleyin
        wait.until(ExpectedConditions.elementToBeClickable(textBox));

        //4. Textbox’in etkin oldugunu(enabled) dogrulayın.
        Assertions.assertTrue(  textBox.isEnabled() );

        //5. “It’s enabled!” mesajinin goruntulendigini dogrulayın.

        WebElement itsEnabledYaziElementi = driver.findElement(By.id("message"));

        Assertions.assertTrue(itsEnabledYaziElementi.isDisplayed());

        driver.quit();


    }
}