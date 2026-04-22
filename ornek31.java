import java.io.File;
import java.io.FileNotFoundException;

public class ornek31 {
    //Bilgisayarınızda var olan bir dosyanın yolunu programa verin. Program şunları kontrol edip ekrana yazdırmalıdır:
//Dosya okunabilir mi? (canRead)
//Dosya yazılabilir mi? (canWrite)
//Dosyanın boyutu kaç byte? (length)
public static void main(String[] args) throws FileNotFoundException{
    String path ="C:/Users/seyma/Desktop/selim.txt"; //dosya yolunu giriyoruz
    File dosya=new File(path); //file nesnesini oluşturuyoruz

    //dosya okunabilir mi?
    if(dosya.canRead()){
        System.out.println("dosya okunabilir");
    }else{
        System.out.println("dosya okunamaz");
    }

    //dosya yazılabilir mi?
    if(dosya.canWrite()){
        System.out.println("dosya yazılabilir");
    }else{
        System.out.println("dosya yazılamaz");
    }

    //boyut
    System.out.println("dosya boyutu:"+dosya.length()+" byte");



    
}

}
