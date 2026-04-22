import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ornek51 {
    //kullanıcı ürün girsin "liste.txt"dosyasına ürünleri yaz sonra dosyayı okuyup ürünleri numaralandır
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(System.in);
        System.out.println("alınacak ürünleri giriniz:");
        String ürün=sc.nextLine();

        File f= new File("liste.txt");
       
        PrintWriter yaz=new PrintWriter(f);
        yaz.println(ürün);
        yaz.close();  

        Scanner oku= new Scanner(f);
        int satirno=1;
        while(oku.hasNext()){
            String ürünler=oku.next();
            System.out.println(satirno+"."+ürünler);
            satirno++;

        }
        oku.close();
        sc.close();
    }
}
