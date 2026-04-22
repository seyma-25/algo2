//hayvan sınıfı sescikar methodu
//kopek sınıfı override et "havhav"
//main kopek nesnesi oluştur ve çıktı havhav olsun
class Hayvan{
     void sescikar(){
       
}
}
class Kopek extends Hayvan{
    @Override
    void sescikar(){
 System.out.println("hav hav");

    
    }
}
 class ornek65 {
    public static void main(String[] args) {
        Kopek k = new Kopek();
        k.sescikar();
    }
}
