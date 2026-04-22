public class ornek10 {
    //En Küçük Elemanı Bul ve Yeri,2 boyutlu diziyi al,En küçük sayıyı ve satır/sütun indexlerini döndür,Return tipi: int[]
    public static int [] EnKucukE(int [][] dizi){
        int enKucuk=dizi[0][0];
        int satir = 0,sutun=0;
        for(int i=0;i<dizi.length;i++){
            for(int j=0;j<dizi[i].length;j++){
                if(dizi[i][j]<enKucuk){
                    enKucuk=dizi[i][j];
                    satir=i;
                    sutun=j;
                }
            }
        }
        int sonuc[]={enKucuk,satir,sutun};
        return sonuc;
    }public static void main(String[] args) {
        int [][] best={{7,46,27,06,12},{5,87,65,45,9}};
        int [] sonuc=EnKucukE(best);
        System.out.println("En küçük sayı: " + sonuc[0] + ", Satır: " + sonuc[1] + ", Sütun: " + sonuc[2]);
    }
}
