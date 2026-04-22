
   //2024 VİZE YAZ OKULU 3
   import java.lang.Math;

public class KompleksSayi {
    double a; // reel kısım
    double b; // sanal kısım

    // Constructor
    public KompleksSayi(double a, double b) {
        this.a = a;
        this.b = b;
    }

    // Eşlenik: a - bi
    public KompleksSayi eslenik() {
        return new KompleksSayi(a, -b);
    }

    // Mutlak değer: sqrt(a² + b²)
    public double mutlakDeger() {
        return Math.sqrt(a * a + b * b);
    }

    // Toplama: (a+c) + (b+d)i
    public KompleksSayi topla(KompleksSayi k2) {
        return new KompleksSayi(a + k2.a, b + k2.b);
    }

    // Çıkarma: (a-c) + (b-d)i
    public KompleksSayi cikar(KompleksSayi k2) {
        return new KompleksSayi(a - k2.a, b - k2.b);
    }

    // Çarpma: (ac - bd) + (ad + bc)i
    public KompleksSayi carp(KompleksSayi k2) {
        double yeniA = a * k2.a - b * k2.b;
        double yeniB = a * k2.b + b * k2.a;
        return new KompleksSayi(yeniA, yeniB);
    }

    // Bölme: (ac+bd)/(c²+d²) + (bc-ad)/(c²+d²) i
    public KompleksSayi bol(KompleksSayi k2) {
        double payda = k2.a * k2.a + k2.b * k2.b;
        double yeniA = (a * k2.a + b * k2.b) / payda;
        double yeniB = (b * k2.a - a * k2.b) / payda;
        return new KompleksSayi(yeniA, yeniB);
    }

    // Karşılaştır: mutlak değere göre 1, 0, -1
    public int karsilastir(KompleksSayi k2) {
        double m1 = this.mutlakDeger();
        double m2 = k2.mutlakDeger();

        if (m1 > m2) return 1;
        else if (m1 == m2) return 0;
        else return -1;
    }

    // toString: yazdırmak için
    public String toString() {
        if (b >= 0)
            return a + " + " + b + "i";
        else
            return a + " - " + Math.abs(b) + "i";
    }

    // Test
    public static void main(String[] args) {
        KompleksSayi k1 = new KompleksSayi(3, 4);   // 3 + 4i
        KompleksSayi k2 = new KompleksSayi(1, -2);  // 1 - 2i

        System.out.println("k1         : " + k1);
        System.out.println("k2         : " + k2);
        System.out.println("Eşlenik k1 : " + k1.eslenik());
        System.out.println("|k1|       : " + k1.mutlakDeger());
        System.out.println("k1 + k2    : " + k1.topla(k2));
        System.out.println("k1 - k2    : " + k1.cikar(k2));
        System.out.println("k1 * k2    : " + k1.carp(k2));
        System.out.println("k1 / k2    : " + k1.bol(k2));
        System.out.println("Karşılaştır: " + k1.karsilastir(k2)); // 1 çıkmalı
    }

}
