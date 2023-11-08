public class Samolot {
    private double zasieg;
    private int LiczbaMiejsc;
    int ID;

    public Samolot(double zasieg, int liczbaMiejsc, int ID) {
        this.zasieg = zasieg;
        LiczbaMiejsc = liczbaMiejsc;
        this.ID = ID;
    }

    public Samolot(Samolot s) {
        this.zasieg = s.getZasieg();
        LiczbaMiejsc = s.getLiczbaMiejsc();
        this.ID = s.getID();
    }

    public double getZasieg() {
        return zasieg;
    }

    public void setZasieg(double zasieg) {
        this.zasieg = zasieg;
    }

    public int getLiczbaMiejsc() {
        return LiczbaMiejsc;
    }

    public void setLiczbaMiejsc(int liczbaMiejsc) {
        LiczbaMiejsc = liczbaMiejsc;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String toString() {
        return "ID: " + ID + " Zasieg: " + zasieg + " Liczba Miejsc: " + LiczbaMiejsc;
    }
}
