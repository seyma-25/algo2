public class ornek2 {
    //Bir String dizisi alan ve 5 harften uzun kaç kelime olduğunu bulan metot yaz.
   /* public static void bestenU(String [] s){      //!!!GERİYE DEĞER DÖNDÜRMÜYORSA DAİMA VOİD!!!
        int sayac=0;
        for(int i=0;i<s.length;i++){
            if(s[i].length()>5){
                sayac++;
            }
        }
        System.out.println(sayac);
    }
    public static void main(String[] args) {
        String [] dizi={"mehmet","taner","yavuzselim","ali","veli"};
        bestenU(dizi);
    } */


    //bir string dizisi alan ve 5 harften uzun kaç kelime olduğunu bulup geri döndüren method
    public static int bestenU(String [] s){
        int sayac=0;
        for(int i=0;i<s.length;i++){
            if(s[i].length()>5){
                sayac++;
            }
        }
        return sayac;
    }public static void main(String[] args) {
        String [] dizi={"menekşe","nergis","lale","gül","orkide","zambak","sümbül"};
        System.out.println(bestenU(dizi));
    }

}
