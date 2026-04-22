import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ornek46 {
    //"metin.txt" dosyasını oku ve tüm harfleri büyük yapıp "buyuk.txt" dosyasına yaz.
    public static void main(String[] args) throws FileNotFoundException {
        File f= new File("metin.txt");
        Scanner oku=new Scanner(f);
        PrintWriter dosyayaz=new PrintWriter("buyuk.txt");

        while(oku.hasNextLine()){
           String satir= oku.nextLine(); //okuduğumuz veriyi kaybetmemek için bir değişkene atıyoruz 
           dosyayaz.println(satir.toUpperCase());// büyük harfe çevirip yeni dosyaya yazıyoruz 
        }
        oku.close();
        dosyayaz.close();
        System.out.println("işlem başarıyla tamamlandı dosyayı kontrol edebilirziniz");

    }
        
}
