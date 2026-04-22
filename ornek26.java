public class ornek26 {
    //Bir String alan ve kelimedeki en çok tekrar eden harfi döndüren metot yaz.
    public static String EnCokTekrar(String s) {
        String sonuc = s.substring(0,1); // İlk harfi sonuç olarak alıyoruz
        int max = 0; // Şu ana kadar bulunan en yüksek tekrar sayısı

        for(int i = 0; i < s.length(); i++){ // 1. döngü: harfleri sırayla seçiyoruz
            int sayac = 0; // Seçilen harfin sayısını saymak için sayaç

            for(int j = 0; j < s.length(); j++){ // 2. döngü: tüm stringi geziyoruz
                if(s.charAt(i) == s.charAt(j)){ // Eğer harfler aynıysa
                    sayac++; // sayacı 1 artır
                }
            }

            if(sayac > max){ // Eğer bu harfin sayısı, en çok tekrar eden harften büyükse
                max = sayac; // max değerini güncelle
                sonuc = String.valueOf(s.charAt(i)); // En çok tekrar eden harfi güncelle
            }
        }

        return sonuc; // En çok tekrar eden harfi döndür
    }

    public static void main(String[] args) {
        String s = "herşey istediğim gibi olacak çok çalışacağım";
        System.out.println(EnCokTekrar(s)); // Fonksiyonu çağır ve sonucu yazdır
    }
}


