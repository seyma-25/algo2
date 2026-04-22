//bir calisan sinifi maasHesapla() "çalışan maası hesaplandı"
//bir muhendis sınıfı  override et "mühendis maası hesaplandı"
class Calisan{
    public void maasHesapla(){
        System.out.println("çalışan maası hesaplandı");
    }
}
class Muhendis extends Calisan{
    @Override
    public void maasHesapla(){
        System.out.println("mühendis maası hesaplandı");
    }
}
public class ornek66 {
    public static void main(String[] args) {
      Calisan cc= new Calisan();
      cc.maasHesapla();
       Muhendis mm= new Muhendis();
       mm.maasHesapla(); 
    }

}
