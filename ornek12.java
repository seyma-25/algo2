

public class ornek12 {
    //kendisine parametre olarak gelen tek boyutlu sayısal dizi içindeki 100 sayısının olup olamdığını bulan recursive method
    /*
    public static int bul(int []a,int i,int sayac){
        if(i>=a.length) return sayac;
        else
            if(a[i]==100) sayac++;  //return bul(a,++i,++sayac); de yazılabilirdi
            return bul(a, ++i, sayac);
    }
    public static void main(String[] args) {
        int a[]={2,4,6,100,5,67,-200,456,100};

        System.out.println(bul(a,0,0)+" tane 100 vardır");
    } */

    //i ve sayacı paraametre olarak tanımlamayıp golobal olarakta tanımlayabilirdik.yukardaki kodun global tanımlanmış haline göre düzenlenmiş hali aşağıda
    //method içinde tanımlanan değişkenler LOKAL olarak adlandırılır
    public static int i=0; //GLOBAL TANIMLAMA
    public static int sayac=0;//GLOBAL TANIMLAMA

    public static int bul(int [] a){
        if(i>=a.length) return sayac; //kontrol ve durma şartı 
        else
            if(a[i]==100){ i=i+1;sayac++;return bul(a);}
            else{ i++;return bul(a);}

    }  public static void main(String[] args) {
        int a[]={2,4,6,100,5,67,-200,456,100};

        System.out.println(bul(a)+" tane 100 vardır");

    }  

}
