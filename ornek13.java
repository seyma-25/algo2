public class ornek13 {
    //parametre olarak gelen tek boyutlu String dizisi içinde en uzun karaktere sahip stringi bulup ekrana yazan recursive method
    public static String kelime="";
    public static String en_uzun_Stringi_bul(String s[],int uzun,int i){
       if(i>=s.length) return kelime;
       if(uzun<=s[i].length()){ kelime=s[i];uzun=s[i].length();return en_uzun_Stringi_bul(s, uzun, ++i); }
       else return en_uzun_Stringi_bul(s, uzun, ++i);
    }

    public static void main(String[] args) {
        String s[]={"ali","veli","osman","hatice","yavuzselim","şeyma"};//string ler çift tırnakla karakterler tek tırnakla yazılır
       
        String text=en_uzun_Stringi_bul(s,s[0].length(),0);
        System.out.println("en uzun string "+text+" dır");
    }

}
