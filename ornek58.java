//Bir Motor sınıfı oluştur:marka,beygir
//Bir Araba sınıfı oluştur:model,Motor motor ← kompozisyon
//Main'de:motor oluştur arabaya ver bilgileri yazdır
class Motor{
    String marka;
    int beygir;
    public Motor(String marka,int beygir){
        this.marka=marka;
        this.beygir=beygir;
    }
}
class araba{
        String model;
        Motor motor; // kompozisyon :bir sınıf,başka bir dınıfın nesnesini kendi içinde bir özellik olarak kullanmasıdır 
        //burada  yazılan ilk motor kelimesi yukarda sınıftı ama araba sınıfında şimdi bir özellik bu KOMPOZİSYONDUR
        public araba(String model,Motor motor){
            this.model=model;
            this.motor= motor;
        }
    }

public class ornek58 {
    public static void main(String[] args) {
        Motor m= new Motor("turbo",600);
        araba a=new araba("porsche", m);//işte burası kritik arabayı ürettik ve daha önce oluşturduğumuz motoru burada çağırdık
        System.out.println("arabanın modeli"+a.model);//a nesnesindeki model öz. git
        System.out.println("motor markası"+a.motor.marka);//a nesnesi içindeki motorun nesnesine git markasına eriş
        System.out.println("motorun beygir gücü"+a.motor.beygir);//a nesne içindeki motorun nesnesine git beygir öz eriş

    }

}
