public class cikmis2 {
    // 2024 YAZ OKULU VİZE
    //soru1
    public class BinarySearchRecursive {
   // ikili arama algoritması sadece sıralı dizide çalışır 
    public static int ikiliArama(int[] dizi, int l, int h, int a) { // l sol sınır,h sağ sınır,a aranan sayı
        // 1. BASE CASE → eleman yoksa
        if (h < l) { //artık arayacak yer kalmadı sayı yok
            return -1;
        }
        // 2. ORTA NOKTA
        int m = (l + h) / 2; //diziyi ortadan ikiye böl orta nok. bulduk
        // 3. BULDUK MU?
        if (dizi[m] == a) { //aranan değere eşit mi
            return m;
        }
        // 4. SAĞ TARAF
        if (a > dizi[m]) { //aranan değer orta değerden büyük mü
            return ikiliArama(dizi, m + 1, h, a); //sağa  git
        }
        // 5. SOL TARAF
        if (a < dizi[m]) {// aranan değer orta değ küçükse sola
            return ikiliArama(dizi, l, m - 1, a);
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] dizi = {10, 20, 30, 40, 50, 60, 70};

        int sonuc = ikiliArama(dizi, 0, dizi.length - 1, 40);

        if (sonuc != -1)
            System.out.println("Bulundu, index: " + sonuc);
        else
            System.out.println("Bulunamadı");
    }
}
}
