//örnekler videosu hocanın
public class ornek69 {
        //kendisine parametre olarak gelen  bir iki boyutlu  String dizisi içinde
        //  sözlükte en önce gelen stringi bulup hangi satir ve sutunda old  geri döndüren methodu yazınız
        public static String[] enÖnceGelen(String[][]s){
            int satir=0,sutun=0;
            String ilk=s[0][0];
            for(int i=0;i<s.length;i++){ //satır sayısını veririr
                for(int j=0;j<s[0].length;j++){ //sutun sayısını verir
                    if(ilk.compareTo(s[i][j])>0){
                       ilk=s[i][j];
                       satir=i;
                       sutun=j;
                    }

                }
            }
            String geri[]={ilk,Integer.toString(satir),Integer.toString(sutun)};
            return geri;
        }public static void main(String[] args) {
            String s[][]={{"bmw","porsche","lamburgini"},{"audi","wolkswagen","togg","cheryy","range rover"}};
            String gg[]=enÖnceGelen(s);
            System.out.println(gg[0]+" "+gg[1]+" "+gg[2]);
            
        }
    

}
