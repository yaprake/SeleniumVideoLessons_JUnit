package K15_fileTestleri;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utilities.TestBase_Each;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C04_dosyaYolunuDinamicYap extends TestBase_Each {

    @Test
    public void test01(){

        // downloads klasorunde deneme.txt dosyasinin var oldugunu test edin

        String dosyaYoluDownloadsDeneme = "C:\\Users\\yapra\\Downloads\\logo (1).jpeg";

        System.out.println(    System.getProperty("user.home")    ); //  C:\Users\yapra

        // downloads klasorunde deneme.txt dosyasinin var oldugunu test edin

        /*
            eger dosya yolunu normal olarak yazarsak
            /Users/ahmetbulutluoz/Downloads/deneme.txt
            sadece dosya yolunu olusturan kisinin bilgisayarinda calisir
            baska bilgisayarlarda calismaz

            Java ortak calisabilmemiz icin
            her kisinin bilgisayarinda farkli olan bastaki kismi
            alabilecegimiz bir kod hazirlamistir

            herkeste farkli olan kisim  :  C:\Users\yapra
            herkeste ortak olan kisim   :  /Downloads/deneme.txt


         */

        String dinamikDownloadsDosyaYoluDeneme = System.getProperty("user.home") + "\\Downloads\\logo (1).jpeg";

        Assertions.assertTrue( Files.exists( Paths.get(dinamikDownloadsDosyaYoluDeneme)) );

        // K15 package'i altinda deneme.txt dosyasinin
        // var oldugunu test edin

        String dosyaYoluProjedekiDeneme = "C:\\Users\\yapra\\IdeaProjects\\Selenium_video_classes_Junit\\src\\test\\java\\K15_fileTestleri\\deneme.txt";

        System.out.println( System.getProperty("user.dir"));




        String dinamikDosyaYoluProjedekiDeneme = System.getProperty("user.dir") +
                "\\src\\test\\java\\K15_fileTestleri\\deneme.txt";


        Assertions.assertTrue( Files.exists(Paths.get(dinamikDosyaYoluProjedekiDeneme)));

    }
}









