public class ornek17 {
    //bir(parametre de diyebilir) n  sayısından geriye doğru tek sayıları yazan method
    public class RecursiveOrnek {

    public static void tekSayilar(int n) {

        if(n <= 0) {   // durma şartı
            return;
        }

        if(n % 2 == 1) {   // tek sayı kontrolü
            System.out.println(n);
        }

        tekSayilar(n - 1);  // recursive çağrı
    }

    public static void main(String[] args) {
        tekSayilar(10);
    }
}

}
