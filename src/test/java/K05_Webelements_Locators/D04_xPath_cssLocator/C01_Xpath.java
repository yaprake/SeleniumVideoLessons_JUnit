package K05_Webelements_Locators.D04_xPath_cssLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Xpath {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //1- https://testotomasyonu.com/addremove/ adresine gidin
        driver.get("https://testotomasyonu.com/addremove/");

        //2- Add Element butonuna basin
        WebElement addElemetButon=driver.findElement(By.xpath("//button[@id='sub-btn']"));
        addElemetButon.click();

        //3- Remove butonu’nun gorunur oldugunu test edin
        WebElement removeButon=driver.findElement(By.xpath("//button[@class='remove-btn']"));
        if (removeButon.isDisplayed()){
            System.out.println("Remove Buton Visible teste: PASSED");
        }else System.out.println("Remove Buton Visible teste: FAİLED");

        //remove tusuna basın
        removeButon.click();

        //5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement addRemoveYazi=driver.findElement(By.xpath("//h2"));
        if (addRemoveYazi.isDisplayed()){
            System.out.println("Add Remove yazi testi PASSED");
        } else System.out.println("Add Remove yazi testi FAILED");

        driver.quit();









    }
}
