    //CLASS ve KOMPOZİSYON örnekleri
    //bir kitap sınıfı oluştur öz:kitapadi,yazar,sayfas
    //mainde bir kitap oluştur ve bilgileri yazdır
    //!!!!!!!!!BURDAN SONRAKİ ÖRNEKLER DEFTERDE YOK !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    class kitap{
        String kitapAdi; //classtan üretiğimiz nesneler (instance)
        String yazar;
        int sayfaS;
    }
    public class ornek55 {
    public static void main(String[] args) {
        kitap k1=new kitap();//bir kitap nesnesi oluşturduk (artık elimizde gerçek bir kitap var)
        k1.kitapAdi="aşk ve gurur";  //oluşturduğumuz nesnenin içindeki değişkenlere eriştik 
        k1.sayfaS=600;
        k1.yazar="Jane Austen";

    }

}
