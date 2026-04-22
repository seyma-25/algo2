import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class ornek32 {
    //Bir PrintWriter kullanarak "notlar.txt" adında bir dosya oluşturun. Bir for döngüsü yardımıyla 1'den 100'e kadar olan çift sayıları bu dosyanın içine her satıra bir sayı gelecek şekilde yazdırın.
    public static void main(String[] args) throws FileNotFoundException,IOException {
        File f= new File("notlar.txt");
        PrintWriter pr=new PrintWriter(f);
        for(int i=1;i<=100;i++){ //kadar dahil i de içine katıyor bu nedenle  100 ü de aldık
            if(i%2==0){
                pr.println(i);
            }
        }
        pr.close();
        
    }
}
