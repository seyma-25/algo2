import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ornek38 {
    //kullanıcıdan adını al ve kullanıcılar.txt dosyasına yaz
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc= new Scanner(System.in);
        System.out.println("bir isim giriniz:");
        String isim= sc.nextLine();
        File f= new File("kullanıcılar.txt");
        PrintWriter ad=new PrintWriter(f);
        ad.print(isim);
        ad.close();
    
        
    }

}
