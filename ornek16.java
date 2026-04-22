public class ornek16 {
// n den geriye doğru sayan recursive method 
//bizden geriye doğru yazdırma istediği için bu tip sorularda genelde void kullanılır çünkü geriye döndürmemizi gerektiren bir değer yok
public static void GeriyeSay(int n){
    if(n==0 ){ //basecasen(durma şartı):bu olmaz ise method sonsuza kadar kendini çağırır
        return ;
    }else {
        System.out.println(n); //burada önce methodu çağırıp sonra yazdırsaydık çıktı 1,2,3,4,5 şeklinde olurdu
        GeriyeSay(n-1);
    }
}public static void main(String[] args) {
    GeriyeSay(12);
}
/*recursive çağrıdan önce yazdırırsan → büyükten küçüğe

recursive çağrıdan sonra yazdırırsan → küçükten büyüğe  yazdırmış oluruz ekrana  */

/*public static void test(int n){

    if(n==0)
        return;

    System.out.print(n);
    test(n-1);
    System.out.print(n);
}   
    bu kodun çıktısı 3 2 1 1 2 3  şeklinde olur
     */
}
