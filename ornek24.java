public class ornek24 {
//parametre olarak bir String kelime alan bu kelimenin palindrom olup olmadığını kontrol eden recursive method
public static boolean isPalindrome(String kelime){
    if(kelime == null || kelime.length() <= 1){
        return true;
    }
    if(kelime.charAt(0) != kelime.charAt(kelime.length()-1)){
        return false;
    }
    return isPalindrome(kelime.substring(1, kelime.length()-1));
}
public static void main(String[] args) {
    System.out.println(isPalindrome("merhaba")); // false
    System.out.println(isPalindrome("kayak"));   // true
}
}
