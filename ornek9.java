public class ornek9 {
    //Bir String dizisi alan ve en çok tekrar eden kelimeyi bulan metot yaz.
    public static void enÇokTekrar(String [] dizi){
        // En sık tekrar eden kelimeyi ve sayısını tutacak değişkenler
        String enCok = null;
        int enFazla = 0;

        // Her kelime için kaç kez tekrarlandığını hesapla
        for (int i = 0; i < dizi.length; i++) {
            String kelime = dizi[i];
            int sayac = 1; // kendisi bir kez zaten var

            // i'den sonraki elemanlara bak (tekrarları say)
            for (int j = i + 1; j < dizi.length; j++) {
                if (kelime.equals(dizi[j])) {
                    sayac++;
                }
            }

            // Eğer bu kelime şimdiye kadar gördüğümüz en fazlaysa güncelle
            if (sayac > enFazla) {
                enFazla = sayac;
                enCok = kelime;
            }
        }

        // Sonucu yazdır
        if (enCok != null) {
            System.out.println("En çok tekrar eden kelime: " + enCok + " (" + enFazla + " kez)");
        } else {
            System.out.println("Dizi boş veya kelime yok.");
        }
    }

    // Test için main metodu
    public static void main(String[] args) {
        String[] test = {"elma", "armut", "elma", "muz", "elma", "armut"};
        enÇokTekrar(test);
    }
}

