
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Paths;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.*;

public class Main {
    //zad 1
//        public static void main(String[] args) throws FileNotFoundException {
//        File text = new File("dane1.txt");
//
//        Scanner readtxt = new Scanner(new File("dane1.txt"));
//
//        while(readtxt.hasNextLine()){
//            String txt = readtxt.nextLine();
//            System.out.println(txt);
//        }
//
//    }

    //zad 2
//    public static void main(String[] args) throws FileNotFoundException {
//        File text = new File("dane1.txt");
//
//        Scanner readtxt = new Scanner(new File("dane1.txt"));
//
//        List<Integer> lista = new ArrayList<Integer>();
//
//        while (readtxt.hasNextInt()) {
//            Integer txt = readtxt.nextInt();
//            lista.add(txt);
//            System.out.println(txt);
//        }
//        long intsum = lista.stream().mapToLong(Integer::longValue).sum();
//        System.out.println(intsum);

    //}
    //Zad 3
//    public static void main(String[] args) throws IOException {
//        File text = new File("dane2.txt");
//
//        String text2 = Files.readString(Paths.get("dane2.txt"));
//        System.out.println(text2);
//    }



    //Zad 1 Strony

    /*public static void main(String[] args) throws IOException {
        URL url = new URL("https://www.youtube.com/");
        BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));

        String currentline;
        boolean isfoundword = false;

        while((currentline = br.readLine()) != null){

            if (currentline.contains("@")){
                isfoundword = true;
                System.out.println(currentline);
                break;
            }
        }
        if (!isfoundword){
            System.out.println("Nie znaleziono danego slowa");
        }
    }*/

}
