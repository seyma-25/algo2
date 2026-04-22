//birdikdörtgen sınıfı oluşturduk öz:uzunluk,genişlik
//metot oluştur alanHesapla() adıve alanında
//mainde değer ver alanı yazdır

class dikdortgen{
    int uzunluk;
    int genişlik;

public int alanHesapla(){//methotlar sınıfın içerisinde olmalıki nesne özelliklerine erişilebilsin
     return uzunluk*genişlik; // return ile bu değeri elimize almış olduk istediğimiz yerde kullanabiliriz
 }
}
public class ornek56 {
    
    public static void main(String[] args) {
        dikdortgen dk= new dikdortgen();
        dk.genişlik=10;
        dk.uzunluk=20;

        int sonuc=dk.alanHesapla();//methot nesneye ait olduğu için "dk.alanHesapla" şeklinde çağırılır.
        System.out.println("dikdörtgenin alanı="+sonuc);
       // System.out.println("dikdörtgenin alanı="+dk.alanHesapla());
    }
    

}
