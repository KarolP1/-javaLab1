package pl.karol;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main7 {
    public static void main(String[] args) throws JsonProcessingException {
        Uzytkownik uzytkownik = new Uzytkownik("Karol", "Platek");
        ObjectMapper objectMapper = new ObjectMapper();
        String uzytkownikJson = ((ObjectMapper) objectMapper).writeValueAsString(uzytkownik);
        System.out.println(uzytkownikJson);
    }
}