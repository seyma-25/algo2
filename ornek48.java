import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ornek48 {
    //"sayilar.txt" içindeki sayılardan sadece çift olanları "cift.txt" dosyasına yaz.
    public static void main(String[] args) throws FileNotFoundException {
        File f= new File("sayilar.txt");
        Scanner oku= new Scanner(f);
        PrintWriter yaz= new PrintWriter("cift.txt");

        while (oku.hasNext()){
            int sayilarr=oku.nextInt();
            if(sayilarr%2==0){
                yaz.println(sayilarr);
            }
        }
        oku.close();
        yaz.close();
        System.out.println("çift sayilar başarılı bir şekilde cift.txt dosyasına yazılmıştır");
        
    }

}
