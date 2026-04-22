import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ornek43 {
    //dosyadaki toplam kelim sayısını hesapla 
    public static void main(String[] args) throws FileNotFoundException {
        File dosya= new File("metin.txt");
        Scanner kelimeoku= new Scanner(dosya);
        if(!dosya.exists()){
            System.out.println("dosya bulnamadı");
        }
        int kelimesayisi=0;
        while(kelimeoku.hasNext()){// bu kelimeyi alır line satırı alır 
            kelimeoku.nextLine();
            kelimesayisi++;
        }
        System.out.println("dosyadaki toplam kelime sayisi"+kelimesayisi);
        kelimeoku.close();

    }

}
