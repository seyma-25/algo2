public class cikmis1 {//AHMET HOCANIN SINAV İÇİN HAZIRLADIĞI ÇALIŞMA SORULARI RECURSİVE
    //kendisine parametre olarak gelen bir dizideki A ların sayısını bulup geri döndüren method 
 /*   public static int AlarınSayisi(String  [] dizi){
        int sayac=0;
        for(int i=0;i<dizi.length;i++){//dizimizde verilen kelimelri geziyoruz
            for(int j=0;j<dizi[i].length();j++){ //kelimelr içindeki harfleri geziyoruz
                 if(dizi[i].charAt(j)=='a'|| dizi[i].charAt(j)=='A'){ //i.kelimedeki j. harfi al kontrol et a ya eşit mi
                    sayac++;

                 }
            }
            

        }
        return sayac;
    }public static void main(String[] args) {
        String [] s={"audi","volkswagen","toyota","porshe","lamburgini"};
        System.out.println(AlarınSayisi(s));
    } */


        //bir sayısal dizideki en büyük sayıyı bulan recursive method 
      /*  public static int enBüyük(int [] dizi,int i,int enbuyuk){
            if(dizi.length==0||dizi==null){
                return 0;
            }
            if(i>=dizi.length){ //dizinin sonuna geldik mi bu zamana kadar ki en büyük değeri döndür
                return enbuyuk;
            }if(dizi[i]>enbuyuk){//mevcut en büyük eleman dizinin şu anki elemanından büyük mü
                enbuyuk=dizi[i]; // şu anki eleman dizinin en büyük elemanıdır 
            }
            return enBüyük(dizi,i+1,enbuyuk);//güncellenmiş en büyük değeri gönder bir sonrski indise geç 
        }
        public static void main(String[] args) {
            int d[]={23,46,58,95,78,102,25,10,24 };
            int buyuk=enBüyük(d, 0, d[0]);
            System.out.println("verilen dizinin en büyük elemanı "+buyuk);
        } */


            //bir stringin elemanlarını alıp tersine çevirip ekrana yazan  method
         /*   public static String TersineCevir(String s,int index){
                if(index<0){
                    return " ";
                }
                return s.charAt(index)+TersineCevir(s, index-1);
            }
            public static void main(String[] args) {
                String cumle ="kendine olan saygın için kızım";
                System.out.println(TersineCevir(cumle, cumle.length()-1));
            }
 */


            //iki dizi içinde aynı olan elemanları bulan recurive fonksiyon
           /* public static int Aynibul(int [] dizi1,int i,int dizi2[],int j){
                if(i==dizi1.length){ // dizi1 tamamen bitti artık bakacak eleman yok
                    return 0;
                }  
                if(j==dizi2.length)  {// dizi2 nin sonuna geldik artık dizi1 deki yeni elemana geç
                  return Aynibul(dizi1, i+1, dizi2, 0);
                }
                if(dizi1[i]==dizi2[j]) { // iki dizideki elemanlar aynı mı?
                    return 1+Aynibul(dizi1, i+1, dizi2, 0);// 1 ortak eleman bulundu dizi1 de ilerle dizi2 yi baştan başlat
                }  //eşit değilse j artar      
                return Aynibul(dizi1, i, dizi2, j+1) ; //dizi1 sabit kalır dizi2 de ilerlenir
            }public static void main(String[] args) {
                int [] dizi1={10,20,30,50,60,40,80,90};
                int [] dizi2= {13,45,68,90,20,35,64,40};
                System.out.println("iki dizide aynı olan elemanlar"+Aynibul(dizi1, 0, dizi2, 0));
            }
    */
} 
