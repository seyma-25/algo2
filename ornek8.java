public class ornek8 {
    //Bir String dizisi alan ve palindrome kelimeleri bulan metot yaz.terten okunduğunda aynı olan kelimeler
    public static void PalindromMu(String [] s){
        System.out.println("Palindrom kelimeler:");
        for(int i = 0; i < s.length; i++){
            String word = s[i];
            // Kelimeyi ters çevirmek için boş bir string oluştur
            String reversed = "";
            // Kelimenin son harfinden başlayarak başa doğru git
            for(int j = word.length() - 1; j >= 0; j--){
                reversed = reversed + word.charAt(j);
            }
            // Orijinal kelime ile ters çevrilmiş kelimeyi karşılaştır (büyük/küçük harf duyarsız)
            if(word.equalsIgnoreCase(reversed)){
                System.out.println(word);
            }
        }
    }

}
