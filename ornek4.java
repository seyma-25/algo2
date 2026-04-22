public class ornek4 {
    //Bir String dizisi alan ve en uzun kelimenin indeksini döndüren metot yaz.
    public static int enUzun(String [] s){
        String enUzun=s[0];
        int indis=0;
        for(int i=0;i<s.length;i++){
            if(s[i].length()>enUzun.length()){
                enUzun=s[i];
                indis=i;
            }
        }
        return indis;

    }public static void main(String[] args) {
        String [] s={"ali","sevgi","nur","yavuzselim","semih","ece"};
        System.out.println(enUzun(s));
    }

}
