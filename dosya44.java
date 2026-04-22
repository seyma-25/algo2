import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class dosya44 {
    //ali.txt dosyası içinde sayılar bulunmaktadır.bu sayılar içinden tek olanları TEK.DAT cift olanları CIFT.DAT ve sıfır olanları da SIFIR.DAT dosyasına bulunduğu  satır ile yazan program yapınız 
   /* public static void main(String[] args) throws IOException { // throwslar birden fazla eklenebilir 
        File f= new File("ali.txt");
        if(!f.exists()){// dosaya zaten var mı?
            f.createNewFile();// dosyayı oluştur // dosya oluşturma da maine throws eklenir 
        }
        Scanner oku= new Scanner(f); // dosyayı satı satı okumamızı sağlar

        FileWriter tek= new FileWriter("TEK:DAT");   // yazma işlemleri için çıktı dosyaları oluşturur
        FileWriter cift= new FileWriter("CIFT:DAT");
        FileWriter sifir= new FileWriter("SIFIR:DAT");

        int satirno=1; // bulunduğu satir ile yazmamızı istediği için satirno tutuyoruz

        while(oku.hasNextLine()){ // dosyada okunacak satır kaldığı sürece devam et  // Scanner ne sağlar hasNextLine-- satır var mı?  nextline -- satırı al
            String satir= oku.nextLine(); // dosyayı satır satır oku
            int sayi= Integer.parseInt(satir); // Scanner dosyayı String olarak okur o nedenle sayilari okumak için String sayi dönüşümü
            if(sayi==0){
                sifir.write("satir"+satirno+"sayı:"+sayi+"\n");
            }else if(sayi%2==0){
                cift.write("satir"+satirno+"sayı:"+sayi+"\n");
            }else{
                tek.write("satir"+satirno+"sayı:"+sayi+"\n");
            }
            satirno++;
        }
        oku.close();
        tek.close();
        cift.close();
        sifir.close();
   
    }
 */

    // veli.dat dosyası içindeki 200.satırda bulunan ifadeyi okuyup ekrana yazan method
   /*  
    public static void satiroku() throws IOException{
        File f= new File("veli.dat");
        Scanner oku= new Scanner(f); // dosyayı satır satır okumamızı sağlar

        int satirno=1;
        while(oku.hasNextLine()){ // dosyada satir oldukça devam et
            String satir= oku.nextLine();
            if(satirno==200){ //200 satira geldik mi
                System.out.println("200.satir:"+satir);
                break;
            }
            satirno++;
        }
        oku.close();
    }
    public static void main(String[] args) throws IOException{
        satiroku();
    }
         */
    
    //alternatif bufferreader
    /* BufferedReader br = new BufferedReader(new FileReader("veli.dat"));

       String satir;
       int sayac = 1;

        while ((satir = br.readLine()) != null) {

       if (sayac == 200) {
          System.out.println(satir);
           break;
        }

        sayac++;
    }

    br.close(); */

    //sınıf.dat  dosyası içindeki öğrenci adı ve notu yazılmıştır bu dosyada ki en yüksek notu alan öğrenciyi bulan programı 
/*
    public static void main(String[] args) throws FileNotFoundException {
        File f= new File("sınıf.dat");
        Scanner oku= new Scanner(f);

        String enİyiOgrenci=" ";// en iyi öğrenciyi en yüksek notu tutacağız
        int enYuksek= -1;  // en yüksek notu bulmak için başta değişkeni en düşük not varsayarız 
        // notlar 0-100 aralığında old için 0 versek belki eşit olam ihtimali vardı ama -1 diye bir not yok o nedenle girilen ilk değer hep daha büyük olacak

        while(oku.hasNextLine()){ // dosyada okunacak satır var mı
            String satir = oku.nextLine();

            String [] parca=satir.split(" "); //satırı boşulğa göre ayır ve diziye ata
            String isim= parca[0]; //dizinin ilk elemaın isimi
            int not= Integer.parseInt(parca[1]);//dizinin ikinci elmanı notun değ verir

            if(not>enYuksek){ //yeni not daha büyük mü?
                enYuksek=not; 
                enİyiOgrenci=isim;
            }
        }
        oku.close();
        System.out.println("en yüksek not "+enYuksek);
        System.out.println("öğrenci"+enİyiOgrenci);

    } */


        //C:\ system dizinindeki dosyaları okuyup ekrana yazan program
      /*
        public static void main(String[] args) {
           File klasor=new File("C:\\\\system"); //klasör oluştur
           File [] dosyalar =klasor.listFiles();//klasörün içini oku

           if(dosyalar!=null){//kontrol et
              
              for(int i=0;i<dosyalar.length;i++){
                System.out.println(dosyalar[i].getName());
              }
           }else{
            System.out.println("klasör bulunamdı veya boş");
           }
        } */

    
        //matematik classı içinde sayı ve işlemleri bulunmaktadır bu işlemler dört işlemlerdir kendisine iki sayı  ve işlim türü geldiği zaman hesaplama yapan classı ve constructor oluşturunuz 

        public class matematik{
             int sayi1;
             int sayi2;
             char islem;

             public matematik(int sayi1,int sayi2,char islem){
                this.sayi1=sayi1;
                this.sayi2=sayi2;
                this.islem = islem;
             }
             public int hesapla(){
                if(islem== '+'){
                    return sayi1+sayi2;
                }
                else if(islem =='-'){
                    return sayi1-sayi2;
                }
                else if(islem == '*'){
                    return sayi1*sayi2;
                }
                else if(islem == '/'){
                    return sayi1/sayi2;
                }
                return 0;
             }
        }
}



