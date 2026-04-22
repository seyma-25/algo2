//bir öğrenci sınıfı oluştur öz:ad,numara,ortalama constructor ile değer al
//mainde 1 öğrenci oluştur ve bilgileri yazdır
class ogrenci{
    String ad;
    int no;
    double ort;

public ogrenci(String ad,int no,double ort){
    this.ad=ad;
    this.no=no;
    this.ort=ort;
}
//mainde özellikler tek tek erişip yazdırmak istemezsek burada bir methot oluşturabiliriz
/*public void bilgileriYazdir() {
        System.out.println("Öğrenci: " + this.ad + " | No: " + this.no + " | Ort: " + this.ort);
    } */
}

public class ornek57 {
    public static void main(String[] args) {
        ogrenci ogr=new ogrenci("şeyma", 119, 3.5);
        //tip farklılıkları old için ve nesen işlemlerinden dolayı özelliklere tek tek erişiyoruz
        System.out.println("öğrencininn adı="+ogr.ad);
        System.out.println("ögrencinin no="+ogr.no);
         System.out.println("ögrencinin ortalamsı ="+ogr.ort); 
        //ogr.bilgileriYazdir(); // Çok daha temiz!

        
    }
}
