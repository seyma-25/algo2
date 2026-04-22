public class ornek27 {
    //Bir int[] dizisinde artan sıralı olup olmadığını kontrol eden metot yaz.
    public static boolean SiraliMi(int [] dizi){
        for(int i=0;i<dizi.length-1;i++){
            if(dizi[i]>dizi[i+1]){
                return false;
            }
        }
       return true;
    }
    public static void main(String[] args) {
        int [] a={10,30,60,45,23,96};
        int [] b={5,23,42,56,78,95,102};
       System.out.println(SiraliMi(a));
       System.out.println(SiraliMi(b));
    }

}
