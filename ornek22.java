public class ornek22 {
    //parametre olarak gelen bir sayının fibonacci değerini hesaplayan recursive method
    public static int fibonacci(int n){
        if(n == 0){
            return 0;
        } else if(n == 1){
            return 1;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    public static void main(String[] args) {
        System.out.println("Fibonacci(5): " + fibonacci(5));  // Örnek: 5
        System.out.println("Fibonacci(10): " + fibonacci(10)); // Örnek: 55
    }
}
