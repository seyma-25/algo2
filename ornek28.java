public class ornek28 {
    //Bir String[] dizisinde en uzun ikinci kelimeyi bulan metot yaz.
    public static String EnUzunİki(String[] s){
        String enuzun=s[0];
        String enuzun2=s[1];
        for(int i=0;i<s.length;i++){
           if(s[i].length()>enuzun.length()){
             enuzun2=enuzun;
             enuzun=s[i];
           }
           else if(s[i].length()>enuzun2.length()){
            enuzun2=s[i];
           }
            }
            return enuzun2;
        }
        public static void main(String[] args) {
            String [] s={"osevgir","ayrılık","heryalangibi","sezen","aksu","kolayolmayacak"};
            System.out.println(EnUzunİki(s));
        }
    }
    /*public static String BirinciEnUzunAra(String[] s, int sirasayisi){
    String[] sonuclar = new String[sirasayisi];
    
    for(int i = 0; i < s.length; i++){
        // Her elemanı sonuçlar dizisinde doğru yere yerleştir
        for(int j = 0; j < sirasayisi; j++){
            if(sonuclar[j] == null || s[i].length() > sonuclar[j].length()){
                // Sağa kaydır
                for(int k = sirasayisi - 2; k >= j; k--){
                    sonuclar[k + 1] = sonuclar[k];
                }
                sonuclar[j] = s[i];  // Doğru yere yerleştir
                break;
            }
        }
    }
    
    return sonuclar[sirasayisi - 1];  // N. en uzunuyu döndür
} */


