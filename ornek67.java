//bir hayvan sınıfı void yemekye() "hayvan yemek yer"
//bir kedi sınıfı override et once super cağır
//sonra "kedi mama yer " 
class Hayvan{
    void yemekYe(){
        System.out.println("hayvan yemek yer");
    }
}
class Kedi extends Hayvan{
    
    @Override
     void  yemekYe(){
        super.yemekYe();
        System.out.println("kedi mama yer");
    }
}

public class ornek67 {
    public static void main(String[] args) {
        Kedi k=new Kedi();
        k.yemekYe();
    }

}
