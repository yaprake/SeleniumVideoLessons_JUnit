package K12_switchingWindows.D01_KontrolluWindowGecisi_KontrolsuzAcilanWindowlar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import utilities.ReusableMethods;
import utilities.TestBase_Each;

public class C02_KontrolluWindowDegistirme extends TestBase_Each {

    @Test
    public void test01(){
        // testotomasyonu sayfasina gidin
        driver.get("https://www.testotomasyonu.com");

        // whd'ini kaydedin ve yazdirin
        String windowHandle=driver.getWindowHandle();
        System.out.println(windowHandle);

        ReusableMethods.bekle(3);

        // yeni bir tab acip, yeni tab'da wisequarter sayfasina gidin
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.wisequarter.com");

        ReusableMethods.bekle(3);

        // whd'ini kaydedin ve yazdirin
        String wiseQhandle=driver.getWindowHandle();
        System.out.println(wiseQhandle);

        ReusableMethods.bekle(3);

        // yeni bir window acarak, arabam.com sayfasina gidin
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.arabam.com");

        // whd'ini kaydedin ve yazdirin
        String arabamHandle=driver.getWindowHandle();
        System.out.println(arabamHandle);

        ReusableMethods.bekle(3);

        // wisequarter'in acik oldugu window'a donun
        driver.switchTo().window(wiseQhandle);

        // ve url'in wisequarter icerdigini test edin
        Assertions.assertTrue(driver.getCurrentUrl().contains("wisequarter"));
        ReusableMethods.bekle(3);

        // testotomasyonu'nun acik oldugu window'a donun
        driver.switchTo().window(windowHandle);

        // ve url'in testotomasyonu icerdigini test edin
        Assertions.assertTrue(driver.getCurrentUrl().contains("testotomasyonu"));







    }








}
