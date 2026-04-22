import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ornek52 {
    //dosyada "şeyma" kelimesi kaç kere geçiyor onu bul 
    public static void main(String[] args) throws FileNotFoundException {
        File f= new File("hersey.txt");
        if(!f.exists()){
            System.out.println("böyle bir dosya yok lütfen oluşturunuz");
            return;
        }
        Scanner oku= new Scanner(f);
        int sayac=0;
        while(oku.hasNext()){
            String kelime=oku.next();
            if(kelime.equalsIgnoreCase("seyma")){ //equals ıgnorecase büyük küçük harf duyarlılığını kaldırmak için kullanılır
                sayac++;
            }
        }
        System.out.println("dosyada seyma kelimesi "+sayac+" kere geçiyor");
        oku.close();
    }

}
