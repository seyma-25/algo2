import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
/* 
public class ornek54 {
    //Dosyayı oku ve satırları ters sırayla yeni dosyaya yaz.
    public static void main(String[] args) throws FileNotFoundException {
        File f= new File("hersey.txt"); 
        Scanner oku = new Scanner(f);
        while(oku.hasNextLine()){
            String dosya=oku.nextLine();

        }
        oku.close();
        PrintWriter pr= new PrintWriter("yeni.txt");
        //array list öğrenmem gerek
        /*add(veri): Listenin en sonuna yeni bir eleman ekler.

size(): Listenin içinde kaç tane eleman olduğunu söyler (Dizilerdeki length gibi).

get(index): İstediğin sıradaki elemanı sana getirir (Dizilerdeki liste[i] gibi).

remove(index): İstediğin sıradaki elemanı siler ve listeyi otomatik olarak daraltır. */
        import java.io.*;
import java.util.*;

public class TersDosyaYazdirma {
    public static void main(String[] args) {
        String inputDosya = "ornek.txt";  // Mevcut dosya
        String outputDosya = "ters.txt";  // Ters yazılacak dosya
        
        try {
            // Dosyayı oku
            BufferedReader reader = new BufferedReader(new FileReader(inputDosya));
            List<String> satirlar = new ArrayList<>();
            
            String satir;
            while ((satir = reader.readLine()) != null) {
                satirlar.add(satir); // Satırları listeye ekle
            }
            reader.close();
            
            // Listeyi ters sıraya çevir
            Collections.reverse(satirlar);
            
            // Yeni dosyaya yaz
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputDosya));
            for (String s : satirlar) {
                writer.write(s);
                writer.newLine();
            }
            writer.close();
            
            System.out.println("Ters dosya yazıldı: " + outputDosya);
        } catch (IOException e) {
            System.out.println("Hata: " + e.getMessage());
        }
    }
}