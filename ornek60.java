//bir yazar sınıfı:ad,ülke
//bir kitap sınıfı:kitapAdi.yazar yazar/hihih kompozisyon
//main:yazar oluştur,kitap oluştur,bilgileri yazdır
class Yazar{
    String ad;
    String ülke;
    public Yazar(String ad,String ülke){
        this.ad=ad;
        this.ülke=ülke;
    }
}
class Kitap{
    String kitapAdi;
    Yazar yazar;
    public Kitap(String kitapAdi,Yazar yazar){ //classta kompozisyonunu alacağımız nesneyi nasıl tanımladıysak parametreye de aynen o şekilde yazarız
        this.kitapAdi=kitapAdi;
        this.yazar=yazar;
    }
}

public class ornek60 {
    public static void main(String[] args) {
        Yazar yz=new Yazar("cemal süreyya", "Türkiye");
        Kitap kk= new Kitap("sevda sözleri", yz);
        System.out.println("kitabın adı="+kk.kitapAdi);
        System.out.println("yazarı="+kk.yazar.ad);
        System.out.println("çıktığı ülke="+kk.yazar.ülke);
    }


}
