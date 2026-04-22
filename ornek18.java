public class ornek18 {
    //1 den n e kadar olan  tek sayıları yazdıran recursive kod
    public class RecursiveOrnek {

    public static void tekSayilar(int n){

        if(n <= 0) {   // durma şartı
            return;
        }

        tekSayilar(n - 1);   // önce recursion

        if(n % 2 == 1) {     // tek sayı kontrolü
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        tekSayilar(10);
    }
}

}
