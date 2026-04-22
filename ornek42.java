import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ornek42 {
    //metin.txt" dosyasında kaç satır olduğunu bul.
    public static void main(String[] args) throws FileNotFoundException {
        File f= new File("metin.txt");
        if(!f.exists()){
            System.out.println("dosya bulunamadı");
        }
        Scanner oku=new Scanner(f);
        int satirs=0;
        while(oku.hasNextLine()){
            oku.nextLine();
            satirs++;
        }
        System.out.println("dosyadaki satir sayisi"+satirs);
        oku.close();
    }
}
