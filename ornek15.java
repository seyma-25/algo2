public class ornek15 {
    //bir n sayısı alan ve n e kadar olan sayıların toplamını bulan recursive method
    public static int top(int n){
        if(n==0 || n==1){
            return 1;
        }else  return n+top(n-1);
    }public static void main(String[] args) {
        System.out.println(top(10));
    }

}
