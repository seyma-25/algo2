public class ornek5 {
    //Bir String dizisi alan ve bütün kelimelerin toplam karakter sayısını bulan metot yaz.
    public static void topKarakter(String [] s){
        int top=0;
        for(int i=0;i<s.length;i++){  //dizinin her elemanını geziyor
            for(int j=0;j<s[i].length();j++){ //dizideki her elemanın karakterini geziyor 
                top+=1;  //biz şu an karakterleri gezdiğimiz için her karakter için toplamı 1 artırıyor
            }
        }
        System.out.println("toplam="+top);
    }public static void main(String[] args) {
        String [] s={"audi","mersedes","ford","BMW","porsche","ferrari"};
        topKarakter(s);
    }

}
