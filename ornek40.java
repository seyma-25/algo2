import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ornek40 {
    //"sayilar.txt" dosyasındaki tüm satırları okuyup ekrana yazdır.
    public static void main(String[] args) throws FileNotFoundException {
        File f= new File("sayilar.txt");
        Scanner sayioku=new Scanner(f);
        // dosyada satır olduğu sürece oku 
        while(sayioku.hasNextLine()){
          String satir=sayioku.nextLine(); // satırı metin olarak al
            System.out.println(satir);// ekrana yazdır
        }
        sayioku.close();
    }

}
