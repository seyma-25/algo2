import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ornek49 {
    //Dosyada bulunan en büyük sayıyı bul.
    public static void main(String[] args) throws FileNotFoundException {
        File f= new File("cift.txt");
        if(!f.exists()){
            System.out.println("böyle bir dosya yok lütfen dosya oluşturun");
            return;
        }
        Scanner oku = new  Scanner(f); //Kural: Aynı dosyayı aynı anda hem okuyup hem üzerine yazmaya çalışmamalısın. En büyük sayıyı bulmak için sadece okuman yeterli.
        int enbuyuk=oku.nextInt();//başlangıç değerini dosyadaki en küçük sayı seçilir
    
        while(oku.hasNextInt()){
          int suanki = oku.nextInt();
          if(suanki>enbuyuk){
           enbuyuk=suanki;
          }
        }
        System.out.println("dosyadaki enbuyuk sayı "+enbuyuk);
        oku.close();
       
    }

}
