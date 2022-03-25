package pl.karol;
import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        try {
        URL url = Main1.class.getResource("./document.txt");
        File file = new File(url.getPath());
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()){

            System.out.println(scan.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
