package K19_ExcelOtomasyon.D01_ReadExcel;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utilities.TestBase_Each;

import java.io.FileInputStream;
import java.io.IOException;

public class C02_ReadExcel extends TestBase_Each {
    @Test
    public void test01() throws IOException {
        // Gerekli ayarlamalari yapip, ulkeler excel'indeki sayfa2'ye gidin
        String excelDosyaYolu="C:\\Users\\yapra\\IdeaProjects\\Selenium_video_classes_Junit\\src\\test\\java\\K19_ExcelOtomasyon\\ulkeler.xlsx";
        FileInputStream fileInputStream=new FileInputStream(excelDosyaYolu);
        Workbook workbook= WorkbookFactory.create(fileInputStream);
        Sheet sayfa2=workbook.getSheet("Sayfa2");// buna kaydedilimde ilerleyen işlemlerde sheet olarak sayfa 2 yazmayalım ikidebir

        // Kullanilan son satirin 20.satir oldugunu test edin
        int actualSonSatirNo=sayfa2.getLastRowNum()+1;
        int expectedSonSatirNo=20;
        Assertions.assertEquals(expectedSonSatirNo, actualSonSatirNo);
        // Kullanilan (bos birakilmayan) satir sayisinin 8 oldugunu test edin
        int kullanilanSatirSayisi=sayfa2.getPhysicalNumberOfRows()+1;
        int expectedKullanilanSatirSayisi=9;
        Assertions.assertEquals(expectedKullanilanSatirSayisi, kullanilanSatirSayisi);

        // 17.satir 5.hucredeki bilgiyi yazdirin
        // satir var ama istenen hucrede bilgi yok
        System.out.println(sayfa2.getRow(16).getCell(4));
        // 5.satir 3.hucredeki bilgiyi yazdirin
        System.out.println(sayfa2.getRow(4).getCell(3));

 /*
            Olmayan bir satir veya
            Olan satirda deger atanmayan hucreyi yazdirmak isterseniz
            null yazdirilir

            Ancak olmayan bir satirda
            hucre degerini isterseniz
            NullPointerException olusur
         */
    }







































}
