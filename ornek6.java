public class ornek6 {
    //Bir String dizisi alan ve ilk harfi büyük olan kelimeleri sayan metot yaz.
    public static void ilkBuyuk(String [] s){
        int sayac=0;
        for(int i=0;i<s.length;i++){
                if(s[i].charAt(0)>='A' && s[i].charAt(0)<='Z'){
                    sayac++;
                }
        }
        System.out.println(sayac);
    }
    public static void main(String[] args) {
        String [] ss={"Audi","BMW","mersedes","Porsche","Lamborghini","maserati"};
        ilkBuyuk(ss);
    }

}
