public class ornek25 {
    //Bir int[] dizisi alan ve çift sayıların ortalamasını döndüren metot yaz.
    public static int CiftOrt(int [] dizi){
        int top=0,ort=0,sayac=0;
        for(int i=0;i<dizi.length;i++){
            if(dizi[i]%2==0){
               top+=dizi[i];
               sayac++;
            }
        }
        ort=top/sayac;
        return ort;
    }public static void main(String[] args) {
        int [] dizi={20,30,15,14,62,15,17,19,38,95};
        System.out.println(CiftOrt(dizi));
    }

}
