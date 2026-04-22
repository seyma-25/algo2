//bir arac sınıfı oluştur marka,hizlan() methodu
//bir araba sınıfı oluştur ve miras al
//mainde araba nesnesi oluştur hizlan() methounun çağır
class Arac{
    String marka;
    public void hizlan(){
        System.out.println("araç hızlanıyor");
    }
}
class Araba extends Arac{

}
class ornek64 {
    public static void main(String[] args) {
        Araba aa= new Araba();
         aa.hizlan();
    }

}
