public class Trasa {
    private String NazwaTrasy;
    private double Dystans;
    private int ID;
    private Lotnisko l1, l2;

    public Trasa(String nazwaTrasy, int ID, Lotnisko l1, Lotnisko l2) {
        NazwaTrasy = nazwaTrasy;
        this.ID = ID;
        this.l1 = l1;
        this.l2 = l2;

        double a = (l1.getX() - l2.getX()) * (l1.getX() - l2.getX());
        double b = (l1.getY() - l2.getY()) * (l1.getY() - l2.getY());
        Dystans = Math.sqrt(a + b);
    }

    public Trasa(Trasa t) {
        NazwaTrasy = t.getNazwaTrasy();
        this.ID = t.getID();
        this.l1 = t.getL1();
        this.l2 = t.getL2();

        double a = (l1.getX() - l2.getX()) * (l1.getX() - l2.getX());
        double b = (l1.getY() - l2.getY()) * (l1.getY() - l2.getY());
        Dystans = Math.sqrt(a + b);
    }

    public String getNazwaTrasy() {
        return NazwaTrasy;
    }

    public void setNazwaTrasy(String nazwaTrasy) {
        NazwaTrasy = nazwaTrasy;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Lotnisko getL1() {
        return l1;
    }

    public void setL1(Lotnisko l1) {
        this.l1 = l1;

        double a = (l1.getX() - l2.getX()) * (l1.getX() - l2.getX());
        double b = (l1.getY() - l2.getY()) * (l1.getY() - l2.getY());
        Dystans = Math.sqrt(a + b);
    }

    public Lotnisko getL2() {
        return l2;
    }

    public void setL2(Lotnisko l2) {
        this.l2 = l2;

        double a = (l1.getX() - l2.getX()) * (l1.getX() - l2.getX());
        double b = (l1.getY() - l2.getY()) * (l1.getY() - l2.getY());
        Dystans = Math.sqrt(a + b);
    }

    public String toString() {
        return "Nazwa: " + NazwaTrasy + " Dystans: " + String.format("%.02f", Dystans) + " ID: " + ID + " Lotniska: [" + l1.getNazwa() + ", " + l2.getNazwa() + "]";
    }
}
