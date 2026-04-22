import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ornek39 {
    //kullanıcıdan 5 tane şehir al ve her birini dosyaya alt alta yaz
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc= new Scanner(System.in);
        System.out.println("5 tane şehir giriniz:");
        File f= new File("sehirler.txt");
        PrintWriter sehiryaz=new PrintWriter(f);
        for(int i=0;i<5;i++){
            String sehir=sc.nextLine();
            sehiryaz.println(sehir);
    
        }
        sehiryaz.close();
        
        
    }

}
