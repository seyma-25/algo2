import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ornek47 {
    //"veri.txt" dosyasını okuyup "kopya.txt" dosyasına aynen kopyala.
    public static void main(String[] args) throws FileNotFoundException {
        File kaynak= new File("veri.txt");
        File hedef= new File("kopya.txt");

        Scanner oku= new Scanner(kaynak);
        PrintWriter yaz= new PrintWriter(hedef);
        while(oku.hasNextLine()){
            String satir=oku.nextLine();
            yaz.println(satir);
        }
        oku.close();
        yaz.close();
        System.out.println("dosya kopyalandı");
    }

}
