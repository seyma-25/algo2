import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ornek44 {
    //Dosyada en uzun karaktere sahip satırı ekrana yazdır.
    public static void main(String[] args) throws FileNotFoundException {
        File f= new File("metin.txt");
        Scanner oku= new Scanner(f);
        if(!f.exists()){
            System.out.println("böyle bir dosya bulunmamakatadır");

        }
        String enuzun="";
        while(oku.hasNextLine()){// burada bizden en uzun karakterli satırı istediği için 
           String suankisatir=oku.nextLine();
           if(suankisatir.length()>enuzun.length()){
            enuzun=suankisatir;
           }

        }
        System.out.println("enuxun satir"+enuzun);
        System.out.println("karakter sayisi"+enuzun.length());

        oku.close();
        
    }

}
