import java.io.File;
import java.util.Scanner;

public class ornek41 {
    //Kullanıcıdan bir dosya adı al. Dosya varsa "bulundu" yoksa "bulunamadı" yazdır.
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("bir dosya adı giriniz:");
        String dosyaAdi= sc.nextLine();
        File f= new File(dosyaAdi);

        if(!f.exists()){ // dosya yoksaw demektir 
            System.out.println("dosya bulunamadı oluşturulması gerek");
        }else{
            System.out.println("dosya bulundu");
        }
        sc.close();
        
    }

}
