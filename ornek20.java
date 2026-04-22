public class ornek20 {
    //bir string alan(cümle ,kelime) ve bunu tersine döndüren recursive method
    public static String kelimeninTersi(String s,int index){
        if(index<0) {return "";}
        return s.charAt(index)+kelimeninTersi(s, index-1);
    }public static void main(String[] args) {
        String cümle  ="kendine olan saygın için kızım";
        System.out.println(kelimeninTersi(cümle,cümle.length()-1));
    }

}  // substring bir Stringin bellirli bir bölümünü almak için kullanılır
