import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ornek45 {
    //"sayilar.txt" dosyasında her satırda bir sayı var. Hepsini topla.
    public static void main(String[] args) throws FileNotFoundException {
        File f= new File("sayilar.txt");
        if(!f.exists()){
            System.out.println("böyle bir sayı bulunmamaktadır  ");
            return;// dosya yoksa burada dur
        }
        Scanner sayioku= new Scanner(f);
        int toplam=0;
        while(sayioku.hasNextInt()){
            int sayi=sayioku.nextInt();
            toplam+=sayi;
        }
        System.out.println("toplam "+toplam);
        sayioku.close();
    }
}