public class ornek19 {
    //bir int dizisi alan ve bu dizinin elemanlarının toplamını geri döndüren recursive method
    public static int DiziTop(int[] dizi,int index){ //index şu an hangi elemanda old tutar
        if(index==dizi.length){
            return 0; //eğer dizinin sonuna gelmişsek toplam sıfırdan ibaret
    } return dizi[index]+DiziTop(dizi,index+1);
}public static void main(String[] args) {
    int [] a={12,20,7,6,43};
    System.out.println(DiziTop(a,0));
}
}
