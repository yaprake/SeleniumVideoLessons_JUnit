package K19_ExcelOtomasyon.D01_ReadExcel;

import org.apache.poi.ss.usermodel.*;
import org.junit.jupiter.api.Test;
import utilities.TestBase_Each;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_ReadExcel extends TestBase_Each {

    @Test
    public void test01() throws IOException {

   /*
                Excel'deki bilgileri kullanabilmek icin
                once excel'deki datalara ulasmamiz lazim
                bilgisayarimizdaki dosyaya selenium WebDriver ile ulasamayacagimiz icin
                Java'dan yardim istemeliyiz
         */

        // 1.adim dosya yolunu alalim
        String excelDosyaYolu = "C:\\Users\\yapra\\IdeaProjects\\Selenium_video_classes_Junit\\src\\test\\java\\K19_ExcelOtomasyon\\ulkeler.xlsx";

        // 2.adim Java ile dosyaya erismek icin
        FileInputStream fileInputStream = new FileInputStream(excelDosyaYolu);
        // 3.adim Excel'den alinan bilgileri
        //   kodlarimizin icinde olusturacagimiz bir obje olarak kaydedelim

        // Workbook workbook = new Workbook();
        // 'Workbook' is abstract; cannot be instantiated
        // Workbook bir interface oldugundan direkt obje olusturulamaz

        /*
                Artik fiziki excel dosyasindaki tum bilgileri
                kodlarimiz icersinde olusturdugumuz workbook objesine kaydettik.
         */
        Workbook workbook = WorkbookFactory.create(fileInputStream);
        // 4.adim excel'in kopyasi olan workbook'da
        //        istedigimiz bilgiye ulasalim
        // Sayfa1'deki 5.satir, 3.hucrede olan bilgiyi yazdirin
        Sheet sayfa1 = workbook.getSheet("Sayfa1");
        Row besinciSatir = sayfa1.getRow(4);
        Cell ucuncuHucre = besinciSatir.getCell(2);

        System.out.println("5.satir 3. cell : " + ucuncuHucre);
        // 5.satir 3. cell : Andorra

        System.out.println(workbook.getSheet("Sayfa1")
                                                                       .getRow(14)
                                                                           .getCell(1));
        // son satir numarasini yazdirin
        System.out.println(workbook.getSheet("Sayfa1").getLastRowNum());
        System.out.println("Son satir no : " + (workbook.getSheet("Sayfa1").getLastRowNum() + 1)); //java index kullandıı için başlık hariç demek için +1 ekleyeblirsin
        //kullanılan satır sayısı

        System.out.println("kullanılan satır sayısı: "+ workbook.getSheet("Sayfa1").getPhysicalNumberOfRows());


    }








}
