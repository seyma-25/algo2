import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ornek53 {
    //"a.txt" ve "b.txt" dosyalarını okuyup "sonuc.txt" dosyasında birleştir.
    public static void main(String[] args) throws FileNotFoundException {
        File f= new File("a.txt");
        File d= new File("b.txt");
        if(!f.exists()||!d.exists()){
            System.out.println("böyle bir dosya bulunmamaktadır");
            return;
        }
        Scanner oku= new Scanner(f);
        Scanner oku2= new Scanner(d);
        PrintWriter pr=new PrintWriter("sonuc.txt");

        while(oku.hasNextLine()){
            String satir=oku.nextLine();
            pr.println(satir);
        }
        while (oku2.hasNextLine()){
            String satir=oku2.nextLine();
            pr.println(satir);
        }
        oku.close();
        oku2.close();
        pr.close();
        System.out.println("dosyalar başarıyla birleştrildi");

    
        
    }

}
