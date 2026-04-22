import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ornek50 {
    //bir dosya içerisinde öprencilerin adı ve notları veriliyor bu öğrencilerin ortalam notunu hesaplayınız
    public static void main(String[] args) throws FileNotFoundException {
        File f= new File("ogrenci.txt");
        if(!f.exists()){
            System.out.println("dosya bulunamadı dosya oluşturun lütfen");
            return;
        }
        Scanner oku= new Scanner(f);
        int toplam=0;
        int sayac=0;
        while(oku.hasNext()){ //next bir ifadede boşluğa kadar olan kısmı alır / nextline ise satırın tamamını alır
           String isim= oku.next();
           int sayi =oku.nextInt();
           toplam+=sayi;
           sayac++;
        }
        double ortalama= (double)toplam/sayac; //değişken tipleri aynı olmak zorundadır 
        System.out.println("verilen öğrencilerin not ortalaması"+ortalama);
        oku.close();
        
        
    }

}
