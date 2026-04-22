//bir adres sınısfı oluştur:sehir, sokak
//bir kisi sınıfı oluştur:ad,adres adres /kompozisyon çağır
 //mainde:adres oluştur,kişi oluştur ,bilgileri yazdır 
 class Adres{// class adları BÜYÜK harfle başlar
    String sehir;
    String sokak;
    public Adres(String sehir,String sokak){
        this.sehir=sehir;
        this.sokak=sokak;
    }
 }
 class Kisi{
    String ad;
    Adres adres;
    public Kisi(String ad,Adres adres){
        this.ad=ad;
        this.adres=adres;
    }
 }
public class ornek59 {
    public static void main(String[] args) {
        Adres a=new Adres("Ankara","hamamönü" );
        Kisi k=new Kisi("şeyma", a);
        System.out.println("kişinin adı="+k.ad);
        System.out.println("kişinin yaşadığı şehiri="+k.adres.sehir);
        System.out.println("kişinin yaşadığı sokak="+k.adres.sokak);
    }
    

}
