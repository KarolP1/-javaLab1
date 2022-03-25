package pl.karol;

public class Uzytkownik {

    public Uzytkownik(String imie, String nazwisko )
    {
        Imie = imie;
        Nazwisko = nazwisko;
    }
    public Uzytkownik(){}
    private String Imie;
    public String getImie(){
        return Imie;
    }
    public void setImie(String imie)
    {
        Imie = imie;
    }

    private String Nazwisko;
    public String getNazwisko(){
        return Nazwisko;
    }
    public void setNazwisko(String nazwisko)
    {
        Nazwisko = nazwisko;
    }

}