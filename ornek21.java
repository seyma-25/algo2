public class ornek21 {
    //bir int[] dizisi alan ve dizideki en büyük sayıyı bulan recursive method
    public static int bulEnBuyuk(int [] dizi, int i, int enbuyuk){
        if (dizi == null || dizi.length == 0) { //basecase  // ilk şart dizinin oluşturulmadığını ikinci şart dizinin boş bir dizi olduğunu kontrol eder
            return 0; 
        }

        if (i >= dizi.length) {//basecase  //dizinin sonuna veyada sonundan sonrasına geldiğinde kontrol edilecek eleman kalmadı
            return enbuyuk; // bu zamana kadarki en buyuk değeri döndür
        }

        if (dizi[i] > enbuyuk) { //mevcut en buyuk ile şu an ki indexteki elemanı karşılaştır
            enbuyuk = dizi[i];
        }

        return bulEnBuyuk(dizi, i + 1, enbuyuk); //güncellenmiş en buyk değeri gönderiyoruz i+1 ile de bir sonraki indexe geçiyoruz
    }

    public static void main(String[] args) {
        int [] d={23,45,46,87,6,511,9,4,67};
        int buyuk=bulEnBuyuk(d, 0, d[0]); //d[0] = başlandıçta dizinin ilk elemanınıen büyük olarak kabul ediyoruz
        System.out.println("verilen dizideki en büyük eleman="+buyuk);
    }
}
