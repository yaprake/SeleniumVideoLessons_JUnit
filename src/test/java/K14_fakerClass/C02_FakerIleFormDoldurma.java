package K14_fakerClass;


import com.github.javafaker.Faker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.ReusableMethods;
import utilities.TestBase_Each;


public class C02_FakerIleFormDoldurma  extends TestBase_Each {

    @Test
    public void test01(){

        //1- https://www.testotomasyonu.com adresine gidelim
        driver.get("https://www.testotomasyonu.com");

        //2- Account linkine tiklayin
        driver.findElement(By.xpath("(//span[.='Account'])[1]"))
                .click();
        Actions actions = new Actions(driver);
        ReusableMethods.bekle(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(4);
        //3- Sign Up linkine basalim
        driver.findElement(By.xpath("(//*[.=' Sign Up'])[1]")).click();

        Faker faker = new Faker();

        String fakeSifre = faker.internet().password();
        String fakeEmail = faker.internet().emailAddress();
        ReusableMethods.bekle(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        WebElement firstnameKutusu = driver.findElement(By.id("firstName"));

        actions.click(firstnameKutusu)
                .sendKeys(faker.name().firstName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB)
                .sendKeys(fakeEmail)
                .sendKeys(Keys.TAB)
                .sendKeys(fakeSifre)
                .sendKeys(Keys.TAB)
                .sendKeys(fakeSifre).perform();

        ReusableMethods.bekle(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();


        //   ve Sign Up butonuna basalim
        driver.findElement(By.id("btn-submit-form")).click();


        //5- Kaydin olusturuldugunu test edin
        //   kayit icin kullandigimiz bilgilerle login olalim
        WebElement emailKutusu = driver.findElement(By.xpath("//input[@id='email']"));
        emailKutusu.sendKeys(fakeEmail);
        ReusableMethods.bekle(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        WebElement passwordKutusu = driver.findElement(By.xpath("//input[@id='password']"));
        passwordKutusu.sendKeys(fakeSifre);

        driver.findElement(By.id("submitlogin")).click();

        // logout butonunun gorunur olmasiyla, giris yapilabildigini test edelim
        WebElement logoutButonu = driver.findElement(By.xpath("//span[.='Logout']"));
        Assertions.assertTrue(logoutButonu.isEnabled());

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(4);
        // sistemden cikis yapalim
        logoutButonu.click();
        ReusableMethods.bekle(2);

    }
}