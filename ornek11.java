public class ornek11 {
    /*Recursive methodlar
       1.kendi kendini çağırabilmeli
       2. içinde döngü olmaz
       3.içinde değişken tanımlanmaz. değişken tanımlamak gerekirse onu parametre ya da global değişken olarak tanımlarız. 
       4.DURMA yeri olacaktır */

       //ekranan adınızı 10 defa yazan method
       public static void yaz(int t){ // void old geriye değer döndürmez
        if(t<=10) System.exit(1);  // programın çalışmasını durdurur işletim sis de bir çıkış kodu döndürür. çok tercih edilmezmiş
        else System.out.println("seyma sevgi selim");
        yaz(--t);
       }public static void main(String[] args) {
        yaz(10); // geri döndüren bir değer olmadığı için methodu direk çag,ğırdık
       }
       


}
