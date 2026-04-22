public class ornek3 {
    //Bir String dizisi alan ve "a" harfi içeren kelimeleri sayan metot yaz.
  /*
    public static void aIceren(String []s){
        int sayac=0;
        for(int i=0;i<s.length;i++){   // dizideki her kelimeyi dolaşır 
            for(int j=0;j<s[i].length();j++){ //dizideki her kelimenin karakterlerini dolaşır
                if(s[i].charAt(j)=='a'){ //karakter a mı?
                 sayac++;  
                }
            }
           
        }
        System.out.println(sayac);
    }
    public static void main(String[] args) {
        String [] dizi={"aleyna","aslı","selim","semih","şeyma","sevgi"};
        aIceren(dizi);
    } */

    //Bir String dizisi alan ve "a" harfi içeren kelimeleri sayan ve geri döndüren method
    public static int aIceren(String [] s){
        int sayac=0;
        for(int i=0;i<s.length;i++){
            for(int j=0;j<s[i].length();j++){
                if(s[i].charAt(j)=='a'){
                    sayac++;
                }
            }
        }
        return sayac;
    }public static void main(String[] args) {
        String [] dizi={"asli","sevgi","zeliha","deliha"};
        System.out.println(aIceren(dizi));
    }

}
