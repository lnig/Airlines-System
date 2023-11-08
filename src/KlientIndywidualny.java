public class KlientIndywidualny extends Klient {
    private int wiek;
    private String plec;

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public String getPlec() {
        return plec;
    }

    public void setPlec(String plec) {
        this.plec = plec;
    }

    public KlientIndywidualny(String imie, String nazwisko, String pesel, int wiek, String plec) {
        super(imie, nazwisko, pesel);
        this.wiek = wiek;
        this.plec = plec;
    }

    public String toString() {
        return "Klient Indywidualny ->" + " Imie: " + getImie() + " Nazwisko: " + getNazwisko() + " Pesel: " + getPesel() + " Wiek: " + wiek + " Plec: " + plec;
    }
}
