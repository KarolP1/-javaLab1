package pl.karol;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;


public class Main6 {
    public static void main(String[] args){
        try
        {
            byte[] data = Files.readAllBytes(Paths.get("FileZad6B.txt"));
            String text = new String(data, StandardCharsets.UTF_8);
            var separator = text.split("\r\n");

            for(int i = 0;i< separator.length;i++)
            {
                System.out.println(i+1 + ". " + separator[i]);
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}