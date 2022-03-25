package pl.karol;


import java.time.LocalTime;
import java.util.Date;
import java.util.TimeZone;

public class Main5 {
    public static void main(String[] args){
        LocalTime time = LocalTime.now();
        System.out.println("localtime: " + time);

        Date now = new Date();
        TimeZone.setDefault(TimeZone.getTimeZone("GMT"));
        System.out.println("globaltime: Main" + now);
    }
}