class hayvan{
    public void yemekyer(){
        System.out.println("hayvan yemek yer");
    }

}
class kedi extends hayvan{// bu bir kalıtımdır//kedinin hayvan classından türetilmesine denir
  public void mirlar(){
    System.out.println("kedi mirlar");
  }

class Van_kedisi extends kedi{
    public void goster(){
        System.out.println("van kedisi farklı gözlere sahiptir");
    }
}


public class ornek62 {
    //ahmet hocanın kaltım videosundayız
    public static void main(String[] args) {
        hayvan Aslan= new hayvan();
        Aslan.yemekyer();
        kedi minnos=new kedi();
        minnos.mirlar();
        minnos.yemekyer();

    }//final olan methodlar override edilemezz
}
}
