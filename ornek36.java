import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ornek36 {
    //Kullanıcıdan 5 isim alan bunları isimler.txt dosyasına yazan 
    public static void main(String[] args) throws IOException {  //06/04/26
        
          File dosya = new File("isimler.txt"); // dosya nesnesini oluşturduk 
         /*  if(!dosya.exists()){
            dosya.createNewFile();
          } *///bu komutun eğer dosya yoksa git oluşşturdur ama bunu zaten PrintWriter komutu yapıyor o nedenle burada gerek yoktur 
          Scanner sc= new Scanner(System.in);
          PrintWriter dosyayaz=new PrintWriter("isimler.txt");
          for(int i=0;i<5;i++){
            String isim=sc.nextLine();
            dosyayaz.println(isim);
          }
         dosyayaz.close(); // dosyayı kapatmazsak dosyadaki veriler tam kaydedilmeyebilir 
         


        }
    }


