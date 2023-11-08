public class Lotnisko {
    private String Kraj, Miasto, Nazwa;
    private double x, y;

    public Lotnisko(String kraj, String miasto, String nazwa, double x, double y) {
        Kraj = kraj;
        Miasto = miasto;
        Nazwa = nazwa;
        this.x = x;
        this.y = y;
    }

    public Lotnisko(Lotnisko l) {
        Kraj = l.getKraj();
        Miasto = l.getMiasto();
        Nazwa = l.getNazwa();
        this.x = l.getX();
        this.y = l.getY();
    }

    public String getKraj() {
        return Kraj;
    }

    public void setKraj(String kraj) {
        Kraj = kraj;
    }

    public String getMiasto() {
        return Miasto;
    }

    public void setMiasto(String miasto) {
        Miasto = miasto;
    }

    public String getNazwa() {
        return Nazwa;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setNazwa(String nazwa) {
        Nazwa = nazwa;
    }

    public String toString() {
        return "Nazwa: " + Nazwa + " Kraj: " + Kraj + " Miasto: " + Miasto + " Wspolrzedne: (" + x + ", " + y + ")";
    }
}
