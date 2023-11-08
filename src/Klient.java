import java.util.ArrayList;

public class Klient {
    private String imie, nazwisko;
    private String Pesel;

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getPesel() {
        return Pesel;
    }

    public void setPesel(String pesel) {
        Pesel = pesel;
    }

    public Klient(String imie, String nazwisko, String pesel) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        Pesel = pesel;
    }

    public String toString() {
        return "Klient Zwykly ->" + " Imie: " + imie + " Nazwisko: " + nazwisko + " Pesel: " + Pesel;
    }
}
