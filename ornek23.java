public class ornek23 {
    //verilen bir sayının basamaklarını toplayan recursive method
    public static int BasTop(int n){
        if(n==0){
            return 0;
        }
        return  n%10+BasTop(n/10);
    }public static void main(String[] args) {
        System.out.println(BasTop(456));
    }

}
