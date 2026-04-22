public class ornek1 {

    //Bir String dizisi alan ve en kısa kelimeyi bulan bir metot yaz.
   /* public static void enkisaK(String [] s){
        String enkucuk=s[0];
        for(int i=0;i<s.length;i++){
           if(s[i].length()<s[0].length()){
            enkucuk=s[i];

           }

        }
        System.out.println(enkucuk);
    }
    public static void main(String[] args) {
        String[] dizi={"yavuz selim","sevginur","semih ege","zahide","cafer"};
        enkisaK(dizi);

    } */



    //bir String dizisi alan ve en kısa kelimeyi bulup bunu geri döndüren method
    public static String enkisaK(String [] s){
        String enkucuk=s[0];
        for(int i=0;i<s.length;i++){
            if(s[i].length()<enkucuk.length()){
                enkucuk=s[i];
            }
        }
        return enkucuk;
    }
    public static void main(String[] args) {
       String[] dizi={"yavuz selim","sevginur","ali","semih ege mert","cafer","zahide"}; 
       System.out.println(enkisaK(dizi));
    }
   

}
