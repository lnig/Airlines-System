import java.util.ArrayList;

public class Lot {
    private String rodzaj;
    private int czas;
    private Trasa trasa;
    private Samolot samolot;
    private ArrayList<Klient> Klienci = null;

    public Lot(String rodzaj, int czas, Trasa trasa, Samolot samolot, ArrayList<Klient> klienci) {
        this.rodzaj = rodzaj;
        this.czas = czas;
        this.trasa = trasa;
        this.samolot = samolot;
        Klienci = klienci;
    }

    public String getRodzaj() {
        return rodzaj;
    }

    public void setRodzaj(String rodzaj) {
        this.rodzaj = rodzaj;
    }

    public int getCzas() {
        return czas;
    }

    public void setCzas(int czas) {
        this.czas = czas;
    }

    public Trasa getTrasa() {
        return trasa;
    }

    public void setTrasa(Trasa trasa) {
        this.trasa = trasa;
    }

    public Samolot getSamolot() {
        return samolot;
    }

    public void setSamolot(Samolot samolot) {
        this.samolot = samolot;
    }

    public ArrayList<Klient> getKlienci() {
        return Klienci;
    }

    public void setKlienci(ArrayList<Klient> klienci) {
        Klienci = klienci;
    }

    public void dodajKlienta(Klient klient) {
        if (Klienci == null)
            Klienci = new ArrayList<>();
        Klienci.add(klient);
    }

    public void usunKlienta(int i) {
        Klienci.remove(i - 1);
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("Rodzaj: " + rodzaj).append(" Czas: " + czas + " h").append("\nSamolot:\n" + samolot.toString()).append("\nTrasa:\n" + trasa.toString());
        if (!(Klienci.size() == 0)) {
            s.append("\nRezerwacje:\n");
            int i = 1;
            for (Klient k : Klienci) {
                if (i == Klienci.size())
                    s.append(i + " - " + k.toString());
                else
                    s.append(i + " - " + k.toString() + "\n");
                i++;
            }
        }

        return s.toString();
    }
}
