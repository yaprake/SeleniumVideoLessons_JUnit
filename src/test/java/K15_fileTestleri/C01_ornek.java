package K15_fileTestleri;

import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C01_ornek {

    @Test
    public void filetesti(){
        //day03 pacge altında deneme.txt isminde bir dosya oldugunu kontrol edin.
        //web element bilgisaya şndirilen dosyaya ulaşamaz
        //bu yüzden java kullanıtız
        //1. adım: dosya yolunu string olarak kaydedin
        String dosyaYolu="C:\\Users\\yapra\\IdeaProjects\\Team166_JunitFramwork\\src\\test\\java\\day03_FileTestleri\\deneme.txt";
        //2. adım dosyanın belirtilen dosya yolunda var oldugunu test etmek için javadaki bir methodu kullanırız
        System.out.println(Files.exists(Paths.get(dosyaYolu)));

    }



















}
