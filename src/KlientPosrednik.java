public class KlientPosrednik extends Klient {
    private String NazwaFirmy;
    private String NIP;

    public KlientPosrednik(String imie, String nazwisko, String pesel, String nazwaFirmy, String NIP) {
        super(imie, nazwisko, pesel);
        NazwaFirmy = nazwaFirmy;
        this.NIP = NIP;
    }

    public String getNazwaFirmy() {
        return NazwaFirmy;
    }

    public void setNazwaFirmy(String nazwaFirmy) {
        NazwaFirmy = nazwaFirmy;
    }

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public String toString() {
        return "Klient Posrednik ->" + " Imie: " + getImie() + " Nazwisko: " + getNazwisko() + " Pesel: " + getPesel() + " Nazwa Firmy: " + NazwaFirmy + " NIP: " + NIP;
    }
}
