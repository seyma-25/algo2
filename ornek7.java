public class ornek7 { 
    //Bir String dizisi alan ve en uzun kelime ile indeksini döndüren metot yaz. Methot String döndürmeli
    public static String[] EnUzun(String[] s){
        String enuzun=s[0];
        int indis=0;
        for(int i=0;i<s.length;i++){
            if(s[i].length()>enuzun.length()){
                enuzun=s[i];
                indis=i;
            }
        }
        String [] sonuc={enuzun,Integer.toString(indis)};
        return sonuc;
    }public static void main(String[] args) {
        String [] s={"Tesla","BMW","Mersedes-Benz","renault","ford","porsche"};
        String [] sonuc=EnUzun(s);
        System.out.println(sonuc[0]+" "+sonuc[1]);
    }



}
