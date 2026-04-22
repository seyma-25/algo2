//Bir Hayvan sınıfı oluştur:isim,yas
//bir kedi sınıfı oluştur ve hayvandan miras alsn
//mainde bir kedi oluştur değer ata ve yazdır 
class hayvan{
    String isim ;
    int yas;
   
}
class kedi extends hayvan{
// kedi sınıfını hayvandan miras alıyor 
}
public class ornek63 {
    public static void main(String[] args) {
        kedi k= new kedi();
        k.isim="minnos"; //değer ataması yaptık
        k.yas=3;
        System.out.println("kedinin ismi "+k.isim+" yaşı "+k.yas+" dır");

    }


}
