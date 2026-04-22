import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class cikmis3 {
    //2024 VİZE YAZ OKULU 2
    public static void main(String[] args) throws FileNotFoundException {
        File f1= new File("modeller.txt");
        File f2= new File("yillar.txt");

        Scanner okumodel= new Scanner(f1);
        Scanner okuyil= new Scanner(f2);

        PrintWriter yaz= new PrintWriter(f2);
         
        while(okumodel.hasNextLine() && okuyil.hasNextLine()){
            String model =okumodel.nextLine();
            int yil=Integer.parseInt(okuyil.nextLine());

            if(yil>=2020){
                yaz.print(model+" "+yil+"\n");
            }
        }
        okumodel.close();
        okuyil.close();
        yaz.close();
        
    }

}
