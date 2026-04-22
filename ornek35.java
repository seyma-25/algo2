import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ornek35 {
    //Bir PrintWriter kullanarak "alisveris_listesi.txt" adında bir dosya oluşturun. Kullanıcıdan Scanner ile 5 adet ürün ismi alıp her birini dosyada yeni bir satıra yazdırın. İşlem bittiğinde dosyayı mutlaka kapatın.
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc= new Scanner(System.in);
        File dosya=new File("alısveris_listesi.txt");
        PrintWriter yaz =new PrintWriter(dosya);

        for(int i=0;i<5;i++){
            System.out.println("ürün giriniz");
            String urun=sc.nextLine();
            yaz.println(urun);
        }
        yaz.close();
        System.out.println("liste dosyaya yazıldı");
    }

}
