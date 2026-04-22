public class ornek29 {
    //Bir sayının basamak sayısını bulan metot yaz
  
    public static int basamakSayisi(int n) {
        int sayac = 0;
        int sayi = Math.abs(n); // Negatif sayılar için mutlak değer alıyoruz

        if (sayi == 0) {
            return 1; // 0'ın basamak sayısı 1'dir
        }

        while (sayi > 0) {
            sayi = sayi / 10; // Son basamağı at
            sayac++;          // Basamak sayısını artır
        }

        return sayac;
    }

    public static void main(String[] args) {
        int sayi1 = 12345;
        int sayi2 = 0;
        int sayi3 = -9876;

        System.out.println(basamakSayisi(sayi1)); // Çıktı: 5
        System.out.println(basamakSayisi(sayi2)); // Çıktı: 1
        System.out.println(basamakSayisi(sayi3)); // Çıktı: 4
    }
}

