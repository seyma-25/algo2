import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ornek34 {
    //Bir program yazın; kullanıcıdan silmek istediği dosyanın adını alsın. Eğer dosya mevcutsa silsin ve "Dosya başarıyla yok edildi" desin. Eğer dosya mevcut değilse "Hata: Silinmek istenen dosya bulunamadı!" uyarısı versin.
    public static void main(String[] args) throws FileNotFoundException,IOException {
        Scanner sc= new Scanner(System.in);
        System.out.println("silinecek bir dosya adı girin:");
        String path=sc.nextLine();
        File dosya= new File(path);
        if(dosya.delete()){
            System.out.println("dosya başarıyla yok edildi");
        }else{
            System.out.println("hata: silmek istenilen dosya bulunamadı");
        }
        
    }
}
