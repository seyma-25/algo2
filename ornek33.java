import java.io.File;
import java.io.FileNotFoundException;

public class ornek33 {
    //Belirli bir dizindeki (örneğin "C:\" veya "D:\") tüm dosyaları listeleyen bir program yazın. Ancak program sadece sonu ".txt" ile biten dosyaların isimlerini ekrana yazdırmalıdır. (İpucu: getName().endsWith(".txt") kullanılabilir).
    public static void main(String[] args) throws FileNotFoundException {
     String path="D:\\"   ;
     File dosya = new File(path);
       if(dosya.isDirectory()){
        File[] tumDosyalar=dosya.listFiles();
        for(int i=0;i<tumDosyalar.length;i++){
            if(tumDosyalar[i].getName().endsWith(".txt")){ //önce kontrol ediyoruz txt dosyası mı değil mi 
            System.out.println(tumDosyalar[i].getName()); // sonra yazdırıryoruz
            }
        }
       }else{
        System.out.println("klasör veya dizin değil"); // klasör = dizin
       }
    }
}
