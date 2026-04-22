import java.io.File;
import java.io.IOException;

public class ornek37 {
    //notlar.txt adında bir dosya oluştur eğer dosya zaten var ise dosya var yazdır 
    public static void main(String[] args) throws IOException {
        File f= new File("notlar.txt");
        if(!f.exists()){ // eğer dosya mevcut değilse oluştur 
            f.createNewFile();
            System.out.println("dosya başarıyla oluşturuldu.");
        }else{
            System.out.println("dosya zaten mevcuttur");
        }

    }

}
