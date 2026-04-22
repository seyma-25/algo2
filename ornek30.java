import java.io.File;
import java.util.Scanner;

public class ornek30 {
    // DOSYA İŞLEMLERİ
    //Kullanıcıdan bir dosya adı ve bir klasör yolu (path) girmesini isteyen bir program yazın. Eğer belirtilen klasör yoksa önce klasörü oluştursun, ardından bu klasörün içine belirtilen dosyayı oluşturup "İşlem başarılı" mesajı versin.
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("bir klasör path giriniz");
        String path=sc.nextLine();
        System.out.println("dosya adı giriniz");
        String dosyaAdi=sc.nextLine();
        File klasor=new File(path);
        try{
            if(!klasor.exists()){
                klasor.mkdirs(); //klasör oluşturmak için mkdir veya mkdirs kullanılır
            }
            File dosya=new File(klasor,dosyaAdi); //klasor içine dosya oluşturur 
            if(dosya.createNewFile()){ //dosya oluşturduk
                 System.out.println("işlem başarılı");
            }
        }catch(Exception e){
            System.out.println(e.getMessage());

        } //next()-> sadece ilk kelimeyi alır boşlukta durur
        //nextLine()->satırın tamamını alır boşlukları da alır. dosya yolu ve dosya adları boşluk içerebildiğinden nextline kulanmak hata verdirmez 
        
    }


}
