import java.util.ArrayList;

public class LiniaLotnicza {
    private String Nazwa;
    private ArrayList<Samolot> Samoloty = new ArrayList<>();
    private ArrayList<Lot> Loty = new ArrayList<>();
    private ArrayList<Trasa> Trasy = new ArrayList<>();
    private ArrayList<Klient> Klienci = new ArrayList<>();
    private ArrayList<Lotnisko> Lotniska = new ArrayList<Lotnisko>();

    public LiniaLotnicza(String nazwa) {
        Nazwa = nazwa;
    }

    public String getNazwa() {
        return Nazwa;
    }

    public ArrayList<Samolot> getSamoloty() {
        return Samoloty;
    }

    public ArrayList<Lot> getLoty() {
        return Loty;
    }

    public ArrayList<Trasa> getTrasy() {
        return Trasy;
    }

    public ArrayList<Klient> getKlienci() {
        return Klienci;
    }

    public void setNazwa(String nazwa) {
        Nazwa = nazwa;
    }

    public void dodajSamolot(Samolot samolot) {
        Samoloty.add(samolot);
    }

    public void usunSamolot(Samolot samolot) {
        for (Samolot s : Samoloty) {
            if (s.getID() == samolot.getID()) ;
            Samoloty.remove(s);
        }
    }

    public void dodajLotnisko(Lotnisko lotnisko) {
        Lotniska.add(lotnisko);
    }

    public ArrayList<Lotnisko> getLotniska() {
        return Lotniska;
    }

    public void usunLotnisko(Lotnisko lotnisko) {
        int i = 0;
        for (Lotnisko l : Lotniska) {
            if (l.getX() == lotnisko.getX() && l.getY() == lotnisko.getY())
                Lotniska.remove(i);
            i++;
        }
    }

    public void dodajKlienta(Klient klient) {
        Klienci.add(klient);
    }

    public void usunKlienta(Klient klient) {
        for (Klient k : Klienci) {
            if (k.getPesel() == klient.getPesel())
                Klienci.remove(k);
        }
    }

    public void dodajTrase(Trasa trasa) {
        Trasy.add(trasa);
    }

    public void usunTrase(Trasa trasa) {
        for (Trasa t : Trasy) {
            if (t.getID() == trasa.getID())
                Trasy.remove(t);
        }
    }

    public void dodajLot(String rodzaj, int czas, Samolot samolot, Trasa trasa, ArrayList<Klient> klienci) {
        Loty.add(new Lot(rodzaj, czas, trasa, samolot, klienci));
    }
}
