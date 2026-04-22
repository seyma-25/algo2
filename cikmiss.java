public class cikmiss {
    //işlem(3,5,topla) yazıldığında 3ile5 toplanacaktır.işlem(5,6,carp) yazdığımız zmn 5ile6 çarpılıp sonuc verecektir constructor ile yapıalcaktır
    public class ıslem{
        int sayi1;
        int sayi2;
        String tur;
        int sonuc;

        public ıslem(int sayi1,int sayi2,String tur){
            this.sayi1=sayi1;
            this.sayi2=sayi2;
            this.tur=tur;

            if(tur.equals("topla")){
                sonuc=sayi1+sayi2;
            }else if(tur.equals("cikar")){
                sonuc=sayi1-sayi2;
            }else if(tur.equals("carp")){
                sonuc=sayi1*sayi2;
            }else if(tur.equals("bol")){
                if(sayi2!=0)
                    sonuc=sayi1/sayi2;
                else
                    System.out.println("0 a bölünmez");
            }else{
                System.out.println("geçersiz işlem");
            }
        }
    }
}
