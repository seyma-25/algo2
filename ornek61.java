//bir ders sınısfı oluştur:deradi,kredi
//bir ogrenci sınıfı oluştur:ad,ders[] dersler kompozisyon
//mainde 2 ders oluştur öğrencinin derslerini ekle yazdır
class Ders{
    String dersAdi;
    int kredi;
    public Ders(String dersAdi,int kredi){
        this.dersAdi=dersAdi;
        this.kredi=kredi;
    }
}
class Ogrenci{
    String ad;
    Ders [] dersler;
    public Ogrenci(String ad,Ders [] dersler){
        this.ad=ad;
        this.dersler=dersler;
    }
}
public class ornek61 {
    public static void main(String[] args) {
        Ders d1= new Ders("algo2", 4);
        Ders d2= new Ders("bot", 4);
        Ders [] dersler={d1,d2};
        Ogrenci ogr=new Ogrenci("şeyma",dersler);

        System.out.println("öğrencinin adı="+ogr.ad); // dizidekii ifadeleri gezip yazdırmak için bir for döngüsü kullandık
        for(int i=0;i<ogr.dersler.length;i++){
          System.out.println(ogr.dersler[i].dersAdi+"= "+ ogr.dersler[i].kredi+" kredi");
        }   
    }
}
