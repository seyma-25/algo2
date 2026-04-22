//bir sekil sınıfı alanHesapla() methodu "alan hesaplanıyor
// bir kare sınıfı kenar override alanHesapla()
class Sekil{
    void alanHesapla(){
        System.out.println("alan hesaplanıyor");
    }
}
class Kare extends Sekil{
    int kenar=10;
    @Override
    void alanHesapla(){
        int alan=kenar*kenar;
        System.out.println("karenin alanı="+alan);
    }
}
public class ornek68 {
    public static void main(String[] args) {
        Kare kk= new Kare();
        kk.alanHesapla();
    }

}
